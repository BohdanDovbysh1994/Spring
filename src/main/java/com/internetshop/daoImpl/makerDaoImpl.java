package com.internetshop.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.internetshop.dao.makerDao;
import com.internetshop.entity.ComputerComodity;
import com.internetshop.entity.Country;
import com.internetshop.entity.householdAppliances;
import com.internetshop.entity.maker;

@Repository
public class makerDaoImpl extends GenericDaoIplementation<maker, String> implements makerDao {
	@Transactional
	public void addComputerComodutyTomaker(maker maker, ComputerComodity computerComodity) {
		computerComodity.setMaker(maker);
	}

	@Transactional
	public void addhouseholdAppTomaker(maker maker, householdAppliances householdAppliances) {
		householdAppliances.setMaker(maker);
	}

	@Transactional
	public void addCountryToMaker(Country country, maker maker) {
		maker.setCountry(country);
	}

}
