package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Contact;
import com.example.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
@Autowired
private ContactRepository repo;
	@Override
	public void savecont(Contact c) {
		repo.save(c);
		
	}
	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = repo.findAll();
		return contacts;
	}
	@Override
	public Contact getById(long id) {
	   Optional<Contact> findById = repo.findById(id);
	   Contact contact = findById.get();
	return contact;
	}
	@Override
	public void deleteContactById(long id) {
		repo.deleteById(id);
		
	}

}
