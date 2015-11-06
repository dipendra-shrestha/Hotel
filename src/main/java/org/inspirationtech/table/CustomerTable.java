package org.inspirationtech.table;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblCustomerTable")
public class CustomerTable {
	@Id
	String CustomerTableID;
	String Name;
	String Location;
	int Capacity;
	String Priority;
	String Status;		//Status could be free,reserved,occupied,out_of_order
	
	
	public String getCustomerTableID() {
		return CustomerTableID;
	}
	public void setCustomerTableID(String customerTableID) {
		CustomerTableID = customerTableID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;

	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}

}