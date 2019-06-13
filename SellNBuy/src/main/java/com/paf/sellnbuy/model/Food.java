package com.paf.sellnbuy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Foods")
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
	private String fname;
	private String fdiscription;
	private double fprize;
	private double fdiscount;
	private int sid;
	
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFdiscription() {
		return fdiscription;
	}
	public void setFdiscription(String fdiscription) {
		this.fdiscription = fdiscription;
	}
	public double getFprize() {
		return fprize;
	}
	public void setFprize(double fprize) {
		this.fprize = fprize;
	}
	public double getFdiscount() {
		return fdiscount;
	}
	public void setFdiscount(double fdiscount) {
		this.fdiscount = fdiscount;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	
	
	@Override
	public String toString() {
		return "Food [fid=" + fid + ", fname=" + fname + ", fdiscription=" + fdiscription + ", fprize=" + fprize
				+ ", fdiscount=" + fdiscount + ", sid=" + sid + "]";
	}
	
	
	
}
