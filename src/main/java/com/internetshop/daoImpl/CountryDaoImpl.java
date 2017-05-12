package com.internetshop.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.internetshop.dao.CountryDao;
import com.internetshop.entity.Country;
import com.internetshop.entity.maker;
@Repository
public class CountryDaoImpl extends GenericDaoIplementation<Country, String> implements CountryDao {
	@Transactional
	public void addMakerToCountry(Country country, maker maker) {
		maker.setCountry(country);
	}

}
