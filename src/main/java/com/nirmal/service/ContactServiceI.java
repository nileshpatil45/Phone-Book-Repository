package com.nirmal.service;

import java.util.List;

import com.nirmal.model.Contact;



public interface ContactServiceI {

	public boolean savecontact(Contact contact);
	public List<Contact> getall();
}
