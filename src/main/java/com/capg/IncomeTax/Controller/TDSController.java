package com.capg.IncomeTax.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.IncomeTax.Exception.IdNotFoundException;
import com.capg.IncomeTax.Service.TDSService;
import com.capg.IncomeTax.model.TDSDetails;

@RestController
public class TDSController {
	
	
	@Autowired
	TDSService tdsDetailsService;
	

	
	@GetMapping("/user/tds/{id}")
	public TDSDetails getById(@PathVariable int id) {
		TDSDetails details=tdsDetailsService.getById(id);
		if(details==null) {
			throw new IdNotFoundException("ID is not found wrong ID : "+id);
		}
		else
			return details;
	}

}
