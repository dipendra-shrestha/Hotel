package org.inspirationtech.order;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblCustomerBill")
public class CustomerBill {
	@Id
	String CustomerBillID;
	String CustomerOrderID;
	float Discount;
	String Offer;
	Timestamp Timestamp;
	String CashierID;
	
	public String getCustomerBillID() {
		return CustomerBillID;
	}
	public void setCustomerBillID(String customerBillID) {
		CustomerBillID = customerBillID;
	}
	public String getCustomerOrderID() {
		return CustomerOrderID;
	}
	public void setCustomerOrderID(String customerOrderID) {
		CustomerOrderID = customerOrderID;
	}
	public float getDiscount() {
		return Discount;
	}
	public void setDiscount(float discount) {
		Discount = discount;
	}
	public String getOffer() {
		return Offer;
	}
	public void setOffer(String offer) {
		Offer = offer;
	}
	public Timestamp getTimestamp() {
		return Timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		Timestamp = timestamp;
	}
	public String getCashierID() {
		return CashierID;
	}
	public void setCashierID(String cashierID) {
		CashierID = cashierID;
	}
	
}
