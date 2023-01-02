package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Service.ContactService;
import com.example.Service.LeadService;
import com.example.entity.Contact;
import com.example.entity.Lead;

@Controller
public class LeadController {
@Autowired
private LeadService ser;
@Autowired
private ContactService con;
@RequestMapping("/createlead")
	public String createlead() {
		return "createlead";
	}

@RequestMapping("/savlead")
public String saveLead(@ModelAttribute Lead lead ,ModelMap model) {
	ser.savelead(lead);
	model.addAttribute("lead", lead);
	return "leadInfo";
	
}
@RequestMapping("leadlist")
public String getLead(ModelMap model) {
	List<Lead> leads = ser.getListOfLead();
	model.addAttribute("lead", leads);
	return "listlead";
}

@RequestMapping("/converLead")
public String convertLead(@RequestParam("id") long id,ModelMap model) {
	Lead lead = ser.getBiId(id);
	Contact c = new Contact();
	c.setFirst_Name(lead.getFirst_Name());
	c.setLast_Name(lead.getLast_Name());
	c.setEmail(lead.getEmail());
	c.setMobile(lead.getMobile());
	con.savecont(c);
	ser.deleteById(id);
	List<Lead> leads = ser.getListOfLead();
	model.addAttribute("lead", leads);
	return "listlead";
}
@RequestMapping("/leadInfo")
public String leadInfo(@RequestParam("id") long id,ModelMap model) {
	Lead lead = ser.getBiId(id);
	model.addAttribute("lead", lead);
	return "leadInfo";
	
}

}
