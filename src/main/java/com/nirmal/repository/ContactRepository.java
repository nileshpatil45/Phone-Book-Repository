package com.nirmal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmal.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
