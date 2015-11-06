package org.inspirationtech.food;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblIngredientCategory")
public class IngredientCategory {

	@Id
	String IngredientCategoryID;
	String FoodIngredientID;
	String Name;
	boolean isFish;
	boolean isMilk;
	boolean isMeat;
	boolean isVegetable;
	boolean isFruits;
	boolean isVegan;
	boolean isFat;
	boolean isAlcohol;
	boolean isJuice;
	boolean isDrink;
	String Note;
	
	public String getIngredientCategoryID() {
		return IngredientCategoryID;
	}
	public void setIngredientCategoryID(String ingredientCategoryID) {
		IngredientCategoryID = ingredientCategoryID;
	}
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
	public boolean isFish() {
		return isFish;
	}
	public void setFish(boolean isFish) {
		this.isFish = isFish;
	}
	public boolean isMilk() {
		return isMilk;
	}
	public void setMilk(boolean isMilk) {
		this.isMilk = isMilk;
	}
	public boolean isMeat() {
		return isMeat;
	}
	public void setMeat(boolean isMeat) {
		this.isMeat = isMeat;
	}
	public boolean isVegetable() {
		return isVegetable;
	}
	public void setVegetable(boolean isVegetable) {
		this.isVegetable = isVegetable;
	}
	public boolean isFruits() {
		return isFruits;
	}
	public void setFruits(boolean isFruits) {
		this.isFruits = isFruits;
	}
	public boolean isVegan() {
		return isVegan;
	}
	public void setVegan(boolean isVegan) {
		this.isVegan = isVegan;
	}
	public boolean isFat() {
		return isFat;
	}
	public void setFat(boolean isFat) {
		this.isFat = isFat;
	}
	public boolean isAlcohol() {
		return isAlcohol;
	}
	public void setAlcohol(boolean isAlcohol) {
		this.isAlcohol = isAlcohol;
	}
	public boolean isJuice() {
		return isJuice;
	}
	public void setJuice(boolean isJuice) {
		this.isJuice = isJuice;
	}
	public boolean isDrink() {
		return isDrink;
	}
	public void setDrink(boolean isDrink) {
		this.isDrink = isDrink;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	
	
	
}
