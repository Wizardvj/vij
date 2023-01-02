package com.example.Service;

import java.util.List;

import com.example.entity.Lead;

public interface LeadService {

	void savelead(Lead lead);

	List<Lead> getListOfLead();

	Lead getBiId(long id);

	void deleteById(long id);

}
