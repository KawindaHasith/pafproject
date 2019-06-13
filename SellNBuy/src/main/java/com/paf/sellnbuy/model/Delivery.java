package com.paf.sellnbuy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Delivery")
public class Delivery {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String cusName;
	private String address;
	private int telNo;
	private String email;
	private String itemName;
	private String noOfItem;
	private String amount;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTelNo() {
		return telNo;
	}
	public void setTelNo(int telNo) {
		this.telNo = telNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getNoOfItem() {
		return noOfItem;
	}
	public void setNoOfItem(String noOfItem) {
		this.noOfItem = noOfItem;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	@Override
	public String toString() {
		return "Delivery [id=" + id + ", cusName=" + cusName + ", address=" + address + ", telNo=" + telNo + ", email="
				+ email + ", itemName=" + itemName + ", noOfItem=" + noOfItem + ", amount=" + amount + "]";
	}
	
	
}
