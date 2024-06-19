package com.oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Address {
	
	@Id
	private int id;
	
	private String addressType;
	private String address;
	@ManyToOne
	private EmpDtls emp;
	
	public EmpDtls getEmp() {
		return emp;
	}
	public void setEmp(EmpDtls emp) {
		this.emp = emp;
	}
	public Address(int id, String addressType, String address) {
		super();
		this.id = id;
		this.addressType = addressType;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
