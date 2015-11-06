package org.inspirationtech.food;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblFood")
public class Food {
	@Id
	String FoodID;
	String Name;
	float Price;
	float Calorie;
	String PictureLink;
	String VideoLink;
	String Offer;
	float Discount;
	float Quantity;
	
	public String getFoodID() {
		return FoodID;
	}
	public void setFoodID(String foodID) {
		FoodID = foodID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public float getCalorie() {
		return Calorie;
	}
	public void setCalorie(float calorie) {
		Calorie = calorie;
	}
	public String getPictureLink() {
		return PictureLink;
	}
	public void setPictureLink(String pictureLink) {
		PictureLink = pictureLink;
	}
	public String getVideoLink() {
		return VideoLink;
	}
	public void setVideoLink(String videoLink) {
		VideoLink = videoLink;
	}
	public String getOffer() {
		return Offer;
	}
	public void setOffer(String offer) {
		Offer = offer;
	}
	public float getDiscount() {
		return Discount;
	}
	public void setDiscount(float discount) {
		Discount = discount;
	}
	public float getQuantity() {
		return Quantity;
	}
	public void setQuantity(float quantity) {
		Quantity = quantity;
	}
	
	
}
