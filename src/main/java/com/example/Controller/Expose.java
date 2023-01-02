package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.LeadService;
import com.example.entity.Lead;

@RestController
@RequestMapping("/api/leads")
public class Expose {
	@Autowired
	private LeadService ser;
	
	@GetMapping
	public List<Lead> getData() {
		List<Lead> leads = ser.getListOfLead();
		return leads;
	}
	@PostMapping
	public void insertData(@RequestBody Lead lead) {
		ser.savelead(lead);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") long id) {
		ser.deleteById(id);
	}
	
  @GetMapping("/cr/{id}")
	public Lead getById(@PathVariable("id") long id) {
	  
	  Lead cr = ser.getBiId(id);
	  return cr;
  }
  @PutMapping
  public void updateLead(@RequestBody Lead lead) {
		
		ser.savelead(lead);
  }
	
}



