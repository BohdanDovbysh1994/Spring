package com.internetshop.serviceImpl;

import org.springframework.stereotype.Service;
import com.internetshop.entity.Country;
import com.internetshop.entity.maker;
import com.internetshop.service.CountryService;
@Service
public class CountryServiseImpl extends GenericServiceImpl<Country, String> implements CountryService {
	
	public void addMakerToCountry(Country country, maker maker) {
		maker.setCountry(country);
	}

}
