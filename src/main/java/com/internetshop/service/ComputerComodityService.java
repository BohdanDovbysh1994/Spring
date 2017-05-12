package com.internetshop.service;

import com.internetshop.entity.ComputerComodity;
import com.internetshop.entity.maker;

public interface ComputerComodityService extends GenericService<ComputerComodity, String>{
	
	void AddComputerComodityToMaker(maker maker, ComputerComodity computerComodity);

}
