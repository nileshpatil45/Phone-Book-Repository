package com.nirmal.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
@Table(name="CONTACT_DETAILS")
public class Contact {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CONTACT_ID")
	private Integer contactId;
	@Column(name="CONTACT_NAME")
    private String contactName;
	@Column(name="CONTACT_NUMBER")
    private String contactNumber;
	@Column(name="CONTACT_EMAIL")
	private String contactEmail;
	@Column(name="CONTACT_ACTIVESWITCH")
	private Character ActiveSwitch;
	@Column(name="CREATED_DATE",updatable=false)
	@CreationTimestamp
	private LocalDate createdDate;
	@Column(name="UPDATEED_DATE",insertable=false)
	@UpdateTimestamp
	private LocalDate updateddate;
	
}
