package org.inspirationtech.personnel;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblStaff")
public class Staff {

	@Id
	String StaffID;
	String Firstname;
	String Lastname;
	String AddressID;
	String ContactNum;
	Date DateOfBirth;
	String Role;
	Date JoinDate;
	String PictureLink;
	
	
	public String getStaffID() {
		return StaffID;
	}
	public void setStaffID(String staffID) {
		StaffID = staffID;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public Date getJoinDate() {
		return JoinDate;
	}
	public void setJoinDate(Date joinDate) {
		JoinDate = joinDate;
	}
	public String getPictureLink() {
		return PictureLink;
	}
	public void setPictureLink(String pictureLink) {
		PictureLink = pictureLink;
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
	
	
}
