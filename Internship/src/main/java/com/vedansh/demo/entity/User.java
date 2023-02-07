package com.vedansh.demo.entity;

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
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
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
