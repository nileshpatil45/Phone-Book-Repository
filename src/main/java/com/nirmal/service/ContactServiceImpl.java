package com.nirmal.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Contact> getall() {
		List<Contact> list = this.contactRepository.findAll();
		
		return list;
	}

	@Override
	public Contact getcontact(Integer id) {
		Contact id2 = this.contactRepository.findById(id).get();
		return id2;
	}

	@Override
	public boolean updatecontact(Contact contact) {
		Contact save = this.contactRepository.save(contact);
		if(save!=null) {
			return true;

		}else {
			return false;

		}
	}

	@Override
	public boolean deletebyid(Integer id) {
	//	boolean existbyid= this.contactRepository.existsById(id);
	//	if(existbyid) {
	//		this.contactRepository.deleteById(id);
			return true;
	//	}else {
	//		return false;

	//	}

			Optional<Contact> contact = contactRepository.findById(id);
			
	}
}

		

		
