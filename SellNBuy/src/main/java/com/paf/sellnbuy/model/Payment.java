package com.paf.sellnbuy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Payments")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String pdate;
	private double pamount;
	private String pstatus;
	private int oid;
	private int cardid;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	public double getPamount() {
		return pamount;
	}
	public void setPamount(double pamount) {
		this.pamount = pamount;
	}
	public String getPstatus() {
		return pstatus;
	}
	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getCardid() {
		return cardid;
	}
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
	
	
	@Override
	public String toString() {
		return "Payment [pid=" + pid + ", pdate=" + pdate + ", pamount=" + pamount + ", pstatus=" + pstatus + ", oid="
				+ oid + ", cardid=" + cardid + "]";
	}

	
	
}
