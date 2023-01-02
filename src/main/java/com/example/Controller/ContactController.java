package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Service.ContactService;
import com.example.entity.Contact;

@Controller
public class ContactController {
@Autowired
private ContactService ser;
	
	@RequestMapping("/listcontacts")
	public String allContacts(ModelMap model) {
		List<Contact> contacts = ser.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "listcontacts";
	}
	
}
