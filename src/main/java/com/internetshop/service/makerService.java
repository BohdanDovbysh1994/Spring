package com.internetshop.service;


import com.internetshop.entity.ComputerComodity;
import com.internetshop.entity.Country;
import com.internetshop.entity.householdAppliances;
import com.internetshop.entity.maker;

public interface makerService extends GenericService<maker, String> {
	void addCountryToMaker(Country country , maker maker);
	void addComputerComodutyTomaker(maker maker, ComputerComodity computerComodity);
	void addhouseholdAppTomaker(maker maker , householdAppliances householdAppliances);

}
