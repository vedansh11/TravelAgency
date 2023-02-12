package com.vedansh.demo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection="UserDb")
public class User {
	private String carName;
	@Id
	private String driverName;
	private String intialDestination;
	private String finalDestination;
	private String totalkilometers;
	
	private Float fuelRequired;
	private Float costOfJourneyToAgency;
	private Float costOfJourneyToCustomer;
	private Float profitPercentage;
	private Float requiredProfit;
	private Float requiredKilometers;
	
	public Float getProfitPercentage() {
		return profitPercentage;
	}
	public void setProfitPercentage(Float profitPercentage) {
		this.profitPercentage = profitPercentage;
	}
	public Float getRequiredProfit() {
		return requiredProfit;
	}
	public void setRequiredProfit(Float requiredProfit) {
		this.requiredProfit = requiredProfit;
	}
	public Float getRequiredKilometers() {
		return requiredKilometers;
	}
	public void setRequiredKilometers(Float requiredKilometers) {
		this.requiredKilometers = requiredKilometers;
	}
	public String[] getCars() {
		return cars;
	}
	public void setCars(String[] cars) {
		this.cars = cars;
	}
	private String[] cars= {"swift","nisaan","truck"};
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	private Float discountedPrice;
	
	public Float getFuelRequired() {
		return fuelRequired;
	}
	public void setFuelRequired(Float fuelRequired) {
		this.fuelRequired = fuelRequired;
	}
	public Float getCostOfJourneyToAgency() {
		return costOfJourneyToAgency;
	}
	public void setCostOfJourneyToAgency(Float costOfJourneyToAgency) {
		this.costOfJourneyToAgency = costOfJourneyToAgency;
	}
	public Float getCostOfJourneyToCustomer() {
		return costOfJourneyToCustomer;
	}
	public void setCostOfJourneyToCustomer(Float costOfJourneyToCustomer) {
		this.costOfJourneyToCustomer = costOfJourneyToCustomer;
	}
	public Float getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(Float discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getIntialDestination() {
		return intialDestination;
	}
	public void setIntialDestination(String intialDestination) {
		this.intialDestination = intialDestination;
	}
	public String getFinalDestination() {
		return finalDestination;
	}
	public void setFinalDestination(String finalDestination) {
		this.finalDestination = finalDestination;
	}
	public String getTotalkilometers() {
		return totalkilometers;
	}
	public void setTotalkilometers(String totalkilometers) {
		this.totalkilometers = totalkilometers;
	}



}
