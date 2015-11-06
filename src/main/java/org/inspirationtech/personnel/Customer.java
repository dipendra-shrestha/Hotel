package org.inspirationtech.personnel;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblCustomer")
public class Customer {
	@Id
	String CustomerID;
	String Firstname;
	String Lastname;
	String AddressID;
	String ContactNum;
	Date DateOfBirth;
	String PictureLink;
	String Organization;
	String Email;
	
	
	public String getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getAddressID() {
		return AddressID;
	}
	public void setAddressID(String addressID) {
		AddressID = addressID;
	}
	public String getContactNum() {
		return ContactNum;
	}
	public void setContactNum(String contactNum) {
		ContactNum = contactNum;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getPictureLink() {
		return PictureLink;
	}
	public void setPictureLink(String pictureLink) {
		PictureLink = pictureLink;
	}
	public String getOrganization() {
		return Organization;
	}
	public void setOrganization(String organization) {
		Organization = organization;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
}
