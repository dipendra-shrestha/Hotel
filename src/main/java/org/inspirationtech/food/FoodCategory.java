package org.inspirationtech.food;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblFoodCategory")
public class FoodCategory {

	@Id
	String FoodCategoryID;
	String Name;
	String Note;
	boolean isFish;
	boolean isMilk;
	boolean isMeat;
	boolean isvegetable;
	boolean isFruits;
	boolean isVegan;
	boolean isFat;
	boolean isAlcohol;
	boolean isJuice;
	boolean isDrink;
	
	public String getFoodCategoryID() {
		return FoodCategoryID;
	}
	public void setFoodCategoryID(String foodCategoryID) {
		FoodCategoryID = foodCategoryID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
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
	public boolean isIsvegetable() {
		return isvegetable;
	}
	public void setIsvegetable(boolean isvegetable) {
		this.isvegetable = isvegetable;
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
	
	
}
