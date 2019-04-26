package com.capg.IncomeTax.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capg.IncomeTax.Dao.TDSDao;
import com.capg.IncomeTax.model.TDSDetails;

@Component("tdsDetailsService")
@Service
@Transactional
public class TDSServiceImpl implements TDSService {
	//dependency injection of dao object
	@Autowired
	TDSDao tdsDao;

	@Override
	public TDSDetails getById(int id) {
		return tdsDao.getById(id);
	}

}
