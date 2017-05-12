package com.internetshop.serviceImpl;
import org.springframework.stereotype.Service;
import com.internetshop.entity.ComputerComodity;
import com.internetshop.entity.maker;
import com.internetshop.service.ComputerComodityService;
@Service
public class ComputerComodityServiseImpl extends GenericServiceImpl<ComputerComodity, String> implements ComputerComodityService{

	public void AddComputerComodityToMaker(maker maker, ComputerComodity computerComodity) {
		computerComodity.setMaker(maker);
	}
	

}
