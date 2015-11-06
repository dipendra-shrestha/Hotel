package org.inspirationtech.order;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblCustomerOrderDetail")
public class CustomerOrderDetail {
	@Id
	String CustomerOrderDetailID;
	String CustomerOrderID;
	String FoodID;
	float Quantity;
	String WishNote;
	String DeliverStatus;
	
	public String getCustomerOrderDetailID() {
		return CustomerOrderDetailID;
	}
	public void setCustomerOrderDetailID(String customerOrderDetailID) {
		CustomerOrderDetailID = customerOrderDetailID;
	}
	public String getCustomerOrderID() {
		return CustomerOrderID;
	}
	public void setCustomerOrderID(String customerOrderID) {
		CustomerOrderID = customerOrderID;
	}
	public String getFoodID() {
		return FoodID;
	}
	public void setFoodID(String foodID) {
		FoodID = foodID;
	}
	public float getQuantity() {
		return Quantity;
	}
	public void setQuantity(float quantity) {
		Quantity = quantity;
	}
	public String getWishNote() {
		return WishNote;
	}
	public void setWishNote(String wishNote) {
		WishNote = wishNote;
	}
	public String getDeliverStatus() {
		return DeliverStatus;
	}
	public void setDeliverStatus(String deliverStatus) {
		DeliverStatus = deliverStatus;
	}
	
	
}
