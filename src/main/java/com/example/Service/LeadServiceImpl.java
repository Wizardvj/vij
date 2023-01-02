package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Lead;
import com.example.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
@Autowired
private LeadRepository repo;

	@Override
	public void savelead(Lead lead) {
		repo.save(lead);
		
	}

	@Override
	public List<Lead> getListOfLead() {
	 List<Lead> lead = repo.findAll();
		return lead;
		
	}

	@Override
	public Lead getBiId(long id) {
		Optional<Lead> findById = repo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteById(long id) {
		repo.deleteById(id);
	}

}
