package com.nirmal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nirmal.model.Contact;
import com.nirmal.service.ContactServiceI;

@RestController
public class ContactController {

	@Autowired
	private ContactServiceI contactservicei;
	

	@PostMapping(value = "/save", consumes = "application/json")
	public ResponseEntity<String> save(@RequestBody Contact contact) {
		boolean savecontact = this.contactservicei.savecontact(contact);
		if (savecontact == true) {
			return new ResponseEntity<String>("contact successfully save", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("contact not save", HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping(value = "/getall", produces = "application/json")
	public ResponseEntity<List<Contact>> getallcontact() {
	List<Contact> getall = this.contactservicei.getall();
		if (getall != null) {
			return new ResponseEntity<List<Contact>>(getall, HttpStatus.OK);
		} else {
			String msg = "data not found";
			return new ResponseEntity(msg, HttpStatus.BAD_REQUEST);
		}
	}
	

	@GetMapping(value = "/getbyid{id}", produces = "application/json")
	public ResponseEntity<Contact> getbyid(@PathVariable Integer id) {
	Contact id2 = this.contactservicei.getcontact(id);
	return new ResponseEntity<Contact>(id2, HttpStatus.OK);

	}

	@PutMapping(value="/update",consumes="application/json",produces="application/json")
	public ResponseEntity<String> update(@RequestBody Contact contact) {
		boolean updatecontact = this.contactservicei.updatecontact(contact);
		if (updatecontact == true) {
			return new ResponseEntity<String>("contact updated successefully", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("contact not updated", HttpStatus.OK);

		}

	}
	@DeleteMapping(value="/delete{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		boolean deletebyid = this.contactservicei.deletebyid(id);
		if(deletebyid==true) {
			return new ResponseEntity<String>("contact deleted successefully", HttpStatus.OK);

		}else {
			return new ResponseEntity<String>("contact not deleted successefully", HttpStatus.OK);

		}
		
	}


}
