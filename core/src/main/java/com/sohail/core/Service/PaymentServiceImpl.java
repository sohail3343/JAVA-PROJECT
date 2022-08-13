package com.sohail.core.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohail.core.Dao.PaymentDao;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentDao dao;

	public PaymentDao getDao() {
		return dao;
	}

	public void setDao(PaymentDao dao) {
		this.dao = dao;
	}
}
