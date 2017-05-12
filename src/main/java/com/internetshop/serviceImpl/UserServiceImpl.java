package com.internetshop.serviceImpl;
import org.springframework.stereotype.Service;

import com.internetshop.entity.Orders;
import com.internetshop.entity.User;
import com.internetshop.service.UserService;
@Service
public class UserServiceImpl extends GenericServiceImpl<User, String> implements UserService {

	public void addOrdersToUser(User user, Orders orders) {
		orders.setUser(user);
	}

}
