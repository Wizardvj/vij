package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Service.BillService;
import com.example.Service.ContactService;
import com.example.entity.Bill;
import com.example.entity.Contact;

@Controller
public class BillingController {
@Autowired
private ContactService ser;
	@Autowired
	private BillService bil;
	@RequestMapping("/generatebill")
	public String generateBill(@RequestParam("id") long id,ModelMap model) {
		Contact cont = ser.getById(id);
		model.addAttribute("cont", cont);
		ser.deleteContactById(id);
		return "Bill";
	}
	@RequestMapping("/saveBill")
	public String  saveBill(@ModelAttribute Bill bill,ModelMap model) {
		bil.saveBill(bill);
		model.addAttribute("bill", bill);
		return "bill_info";
	}
}
