package com.internetshop.serviceImpl;
import org.springframework.stereotype.Service;

import com.internetshop.entity.Orders;
import com.internetshop.entity.User;
import com.internetshop.service.OrdersService;

@Service
public class OrdersServiceImpl extends GenericServiceImpl<Orders, String> implements OrdersService {

	public void addUserToOrders(Orders orders, User user) {
		orders.setUser(user);
	}
}
