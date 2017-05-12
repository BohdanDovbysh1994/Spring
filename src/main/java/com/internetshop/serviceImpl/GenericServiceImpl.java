package com.internetshop.serviceImpl;
	import java.util.List;
	import javax.persistence.EntityManager;
	import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import com.internetshop.service.GenericService;

	@Service
	public class GenericServiceImpl<T, K> implements GenericService<T, K>
	{
		public GenericServiceImpl() {
			// TODO Auto-generated constructor stub
		}
		
		public GenericServiceImpl(Class<T> entityClass) {
			this.entityClass = entityClass;
		}

		protected Class<T> entityClass;
		@PersistenceContext //(unitName = "primary")
		private EntityManager entityManager;

		public EntityManager getEntityManager()
		{
			return entityManager;
		}

		public void setEntityManager(EntityManager entityManager) 
		{
			this.entityManager = entityManager;
		}

		public Class<T> getEntityClass()
		{
			return entityClass;
		}

		public void setEntityClass(Class<T> entityClass)
		{
			this.entityClass = entityClass;
		}
	
		public T add(T entity) 
		{
		
			entityManager.persist(entity);

			return entity;
		}

		public T update(T entity) 
		{
			entityManager.merge(entity);
			return entity;
		}

		public void delete(K fieldName, K fieldValue) 
		{
			T entity = getOne(fieldName, fieldValue);
			entityManager.remove(entity);
		}

		@SuppressWarnings("unchecked")
		public T getOne(K fieldName, K fieldValue) 
		{
	
			return (T) entityManager
					.createQuery("select u from " + entityClass.getSimpleName()+ " u where u." + fieldName + " =:value1")
					.setParameter("value1", fieldValue)
					.getSingleResult();
		}

		@SuppressWarnings("unchecked")
		public List<T> getAll()
		{
			return entityManager
					.createQuery("from " + entityClass.getName())
					.getResultList();
		}
	}



