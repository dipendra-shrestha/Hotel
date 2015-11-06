package org.inspirationtech.table;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblReservation")
public class Reservation {
	@Id
	String ReservationID;
	String Firstname;
	String Lastname;
	String Organization;
	String CustomerID;
	String ContactNum;
	Timestamp ReservationFrom;
	Timestamp ReservationTo;
	String ReservedTablesID;
	int PersonCount;
	String Note;
	
	public String getReservationID() {
		return ReservationID;
	}
	public void setReservationID(String reservationID) {
		ReservationID = reservationID;
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
	public String getOrganization() {
		return Organization;
	}
	public void setOrganization(String organization) {
		Organization = organization;
	}
	public String getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	public String getContactNum() {
		return ContactNum;
	}
	public void setContactNum(String contactNum) {
		ContactNum = contactNum;
	}
	public Timestamp getReservationFrom() {
		return ReservationFrom;
	}
	public void setReservationFrom(Timestamp reservationFrom) {
		ReservationFrom = reservationFrom;
	}
	public Timestamp getReservationTo() {
		return ReservationTo;
	}
	public void setReservationTo(Timestamp reservationTo) {
		ReservationTo = reservationTo;
	}
	public String getReservedTablesID() {
		return ReservedTablesID;
	}
	public void setReservedTablesID(String reservedTablesID) {
		ReservedTablesID = reservedTablesID;
	}
	public int getPersonCount() {
		return PersonCount;
	}
	public void setPersonCount(int personCount) {
		PersonCount = personCount;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	
}
