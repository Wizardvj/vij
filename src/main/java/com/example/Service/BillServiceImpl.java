package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Bill;
import com.example.repository.BillRepo;
@Service
public class BillServiceImpl implements BillService {
@Autowired
private BillRepo repo;
	@Override
	public void saveBill(Bill bill) {
	repo.save(bill);	
	}

}
