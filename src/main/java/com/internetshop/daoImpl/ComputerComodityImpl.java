package com.internetshop.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.internetshop.dao.ComputerComodityDao;
import com.internetshop.entity.ComputerComodity;
import com.internetshop.entity.maker;
@Repository
public class ComputerComodityImpl extends GenericDaoIplementation<ComputerComodity, String> implements ComputerComodityDao{
	@Transactional
	public void AddComputerComodityToMaker(maker maker, ComputerComodity computerComodity) {
		computerComodity.setMaker(maker);
	}
	

}
