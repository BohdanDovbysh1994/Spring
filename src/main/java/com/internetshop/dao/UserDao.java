package com.internetshop.dao;



import com.internetshop.entity.Orders;
import com.internetshop.entity.User;

public interface UserDao extends GenericDao<User, String> {
	void addOrdersToUser(User user, Orders orders);

}
