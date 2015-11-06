package org.inspirationtech.table;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblReservedtables")
public class ReservedTables {

	@Id
	String ReservedTablesID;
	String ReservationID;
	String CustomerTableID;
	
	public String getReservedTablesID() {
		return ReservedTablesID;
	}
	public void setReservedTablesID(String reservedTablesID) {
		ReservedTablesID = reservedTablesID;
	}
	public String getReservationID() {
		return ReservationID;
	}
	public void setReservationID(String reservationID) {
		ReservationID = reservationID;
	}
	public String getCustomerTableID() {
		return CustomerTableID;
	}
	public void setCustomerTableID(String customerTableID) {
		CustomerTableID = customerTableID;
	}
	
	
}
