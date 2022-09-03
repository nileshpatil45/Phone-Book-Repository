package com.nirmal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmal.model.Contact;
import com.nirmal.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactServiceI {

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public boolean savecontact(Contact contact) {
		Contact save = this.contactRepository.save(contact);
		
		if(save !=null) {
			return true;
		}
		else {			
		return false;
		}
	}

}
