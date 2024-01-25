package com.SpringBootRestApi.CrudOperations.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

    @Entity
	@Table(name = "student")
	public class Student {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Integer Id;
		@Column(name = "name")
		private String name;
		@Column(name = "email_id")
		private String emailId;
		@Column(name = "mobile_no")
		private String mobileNo;
		@Column(name = "current_address")
		private String currentAddress;
		
		
		public Integer getId() {
			return Id;
		}
		public void setId(Integer id) {
			Id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public String getCurrentAddress() {
			return currentAddress;
		}
		public void setCurrentAddress(String currentAddress) {
			this.currentAddress = currentAddress;
		}
		public Student(Integer id, String name, String emailId, String mobileNo, String currentAddress) {
			super();
			Id = id;
			this.name = name;
			this.emailId = emailId;
			this.mobileNo = mobileNo;
			this.currentAddress = currentAddress;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
			

}
