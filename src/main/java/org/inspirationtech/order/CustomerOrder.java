package org.inspirationtech.order;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblCustomerOrder")
public class CustomerOrder {
	@Id
	String CustomerOrderID;
	String CustomerID;
	String CustomerTableID;
	String WaiterID;
	Timestamp Timestamp;
	
	public String getCustomerOrderID() {
		return CustomerOrderID;
	}
	public void setCustomerOrderID(String customerOrderID) {
		CustomerOrderID = customerOrderID;
	}
	public String getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	public String getCustomerTableID() {
		return CustomerTableID;
	}
	public void setCustomerTableID(String customerTableID) {
		CustomerTableID = customerTableID;
	}
	public String getWaiterID() {
		return WaiterID;
	}
	public void setWaiterID(String waiterID) {
		WaiterID = waiterID;
	}
	public Timestamp getTimestamp() {
		return Timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		Timestamp = timestamp;
	}
	
	
}
