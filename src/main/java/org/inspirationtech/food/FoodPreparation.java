package org.inspirationtech.food;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblFoodPreparation")
public class FoodPreparation {
	@Id
	String FoodPreparationID;
	String FoodCourse;
	String Procedure;
	float Duration;
	String Origin;
	
	public String getFoodPreparationID() {
		return FoodPreparationID;
	}
	public void setFoodPreparationID(String foodPreparationID) {
		FoodPreparationID = foodPreparationID;
	}
	public String getFoodCourse() {
		return FoodCourse;
	}
	public void setFoodCourse(String foodCourse) {
		FoodCourse = foodCourse;
	}
	public String getProcedure() {
		return Procedure;
	}
	public void setProcedure(String procedure) {
		Procedure = procedure;
	}
	public float getDuration() {
		return Duration;
	}
	public void setDuration(float duration) {
		Duration = duration;
	}
	public String getOrigin() {
		return Origin;
	}
	public void setOrigin(String origin) {
		Origin = origin;
	}
	
	
}
