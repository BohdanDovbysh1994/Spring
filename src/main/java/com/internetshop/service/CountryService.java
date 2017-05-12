package com.internetshop.service;

import com.internetshop.entity.Country;
import com.internetshop.entity.maker;

public interface CountryService extends GenericService<Country, String> {
	
	void addMakerToCountry (Country country, maker maker);
	

}
