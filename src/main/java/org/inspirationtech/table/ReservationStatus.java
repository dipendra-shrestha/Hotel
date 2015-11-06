package org.inspirationtech.table;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblReservationStatus")
public class ReservationStatus {
	@Id
	String ReservationStatusID;
	String ReservationID;
	String Status;
	String Note;
	Timestamp Lastmodified;
	
	public String getReservationStatusID() {
		return ReservationStatusID;
	}
	public void setReservationStatusID(String reservationStatusID) {
		ReservationStatusID = reservationStatusID;
	}
	public String getReservationID() {
		return ReservationID;
	}
	public void setReservationID(String reservationID) {
		ReservationID = reservationID;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	public Timestamp getLastmodified() {
		return Lastmodified;
	}
	public void setLastmodified(Timestamp lastmodified) {
		Lastmodified = lastmodified;
	}
	
	
}
