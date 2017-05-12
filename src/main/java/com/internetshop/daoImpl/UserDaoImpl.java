package com.internetshop.daoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.internetshop.dao.UserDao;
import com.internetshop.entity.Orders;
import com.internetshop.entity.User;
@Repository
public class UserDaoImpl extends GenericDaoIplementation<User, String> implements UserDao {
	@Transactional
	public void addOrdersToUser(User user, Orders orders) {
		orders.setUser(user);
	}

}
