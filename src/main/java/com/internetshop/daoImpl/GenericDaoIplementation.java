package com.internetshop.daoImpl;
	import java.util.List;
	import javax.persistence.EntityManager;
	import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.internetshop.dao.GenericDao;

	@Repository
	public class GenericDaoIplementation<T, K> implements GenericDao<T, K>
	{
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
		@Transactional
		public T add(T entity) 
		{
		
			entityManager.persist(entity);

			return entity;
		}
		@Transactional
		public T update(T entity) 
		{
			entityManager.merge(entity);
			return entity;
		}
		@Transactional
		public void delete(K fieldName, K fieldValue) 
		{
			T entity = getOne(fieldName, fieldValue);
			entityManager.remove(entity);
		}
		@Transactional
		@SuppressWarnings("unchecked")
		public T getOne(K fieldName, K fieldValue) 
		{
	
			return (T) entityManager
					.createQuery("select u from " + entityClass.getSimpleName()+ " u where u." + fieldName + " =:value1")
					.setParameter("value1", fieldValue)
					.getSingleResult();
		}
		@Transactional
		@SuppressWarnings("unchecked")
		public List<T> getAll()
		{
			return entityManager
					.createQuery("from " + entityClass.getName())
					.getResultList();
		}
	}



