package com.nirmal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nirmal.model.Contact;
import com.nirmal.service.ContactServiceI;

@RestController
public class ContactController {

	@Autowired
	private ContactServiceI contactservicei;
	
	@PostMapping(value="/save",consumes="application/json")
	public ResponseEntity <String> save(@RequestBody Contact contact){
		boolean savecontact = this.contactservicei.savecontact(contact);
		if(savecontact==true) {
			return new ResponseEntity<String>("contact successfully save",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("contact not save",HttpStatus.BAD_REQUEST);


		}
		
	}
}
