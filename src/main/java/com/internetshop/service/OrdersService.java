package com.internetshop.service;


import com.internetshop.entity.Orders;
import com.internetshop.entity.User;

public interface OrdersService extends GenericService<Orders, String>{

	void addUserToOrders( Orders orders, User user);

}
