package com.example.Service;

import java.util.List;

import com.example.entity.Contact;

public interface ContactService {

	void savecont(Contact c);

	List<Contact> getAllContacts();

	Contact getById(long id);

	void deleteContactById(long id);

}
