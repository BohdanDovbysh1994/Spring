package com.internetshop.serviceImpl;

import org.springframework.stereotype.Service;

import com.internetshop.entity.ComputerComodity;
import com.internetshop.entity.Country;
import com.internetshop.entity.householdAppliances;
import com.internetshop.entity.maker;
import com.internetshop.service.makerService;

@Service
public class makerServiceImpl extends GenericServiceImpl<maker, String> implements makerService {

	public void addComputerComodutyTomaker(maker maker, ComputerComodity computerComodity) {
		computerComodity.setMaker(maker);
	}

	public void addhouseholdAppTomaker(maker maker, householdAppliances householdAppliances) {
		householdAppliances.setMaker(maker);
	}

	public void addCountryToMaker(Country country, maker maker) {
		maker.setCountry(country);
	}

}
