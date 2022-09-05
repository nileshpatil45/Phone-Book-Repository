package com.nirmal.service;

import java.util.List;

import com.nirmal.model.Contact;



public interface ContactServiceI {

	public boolean savecontact(Contact contact);
	public List<Contact> getall();
	public Contact getcontact(Integer id);
	public boolean updatecontact(Contact contact);
	public boolean deletebyid(Integer id);
}
