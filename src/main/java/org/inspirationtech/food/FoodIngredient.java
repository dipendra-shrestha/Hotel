package org.inspirationtech.food;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblFoodIngredient")
public class FoodIngredient {
	
	@Id
	String FoodIngredientID;
	String Name;
	String PictureLink;
	String VideoLink;
	float CaloriePer100g;
	float Quantity;
	String QuantitiyUnit;
	
	public String getFoodIngredientID() {
		return FoodIngredientID;
	}
	public void setFoodIngredientID(String foodIngredientID) {
		FoodIngredientID = foodIngredientID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
	public float getCaloriePer100g() {
		return CaloriePer100g;
	}
	public void setCaloriePer100g(float caloriePer100g) {
		CaloriePer100g = caloriePer100g;
	}
	public float getQuantity() {
		return Quantity;
	}
	public void setQuantity(float quantity) {
		Quantity = quantity;
	}
	public String getQuantitiyUnit() {
		return QuantitiyUnit;
	}
	public void setQuantitiyUnit(String quantitiyUnit) {
		QuantitiyUnit = quantitiyUnit;
	}
	
	
}
