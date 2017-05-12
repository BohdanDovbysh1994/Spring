package com.internetshop.daoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.internetshop.dao.OrdersDao;
import com.internetshop.entity.Orders;
import com.internetshop.entity.User;

@Repository
public class OrdersDaoImpl extends GenericDaoIplementation<Orders, String> implements OrdersDao {
	@Transactional
	public void addUserToOrders(Orders orders, User user) {
		orders.setUser(user);
	}
}
