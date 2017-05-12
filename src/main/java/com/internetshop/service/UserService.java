package com.internetshop.service;

import com.internetshop.entity.Orders;
import com.internetshop.entity.User;

public interface UserService extends GenericService<User, String>{
	void addOrdersToUser(User user, Orders orders);

}
