package com.vedansh.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedansh.demo.entity.User;
import com.vedansh.demo.repository.UserRepo;

@Service

public class UserServiceimpl implements UserService{
	
	@Autowired
	private UserRepo repo;
	private int average = 15;
	private int minimumPetrol = 10;
	private float chargePerKmOfInnova = 23;
	private float chargePerKmOfSwift = 18;
	private float chargePerKmOfEtios = 15;
	private float intialPetrolInCar=10;
	private float petrolPerLitre=100;
	
	@Override
	public List<User> getallUsers() {
		return repo.findAll();
	}

	@Override
	public User registerUser(User user) {
		return repo.save(user);
		
	}

	@Override
	public User showDetails(User user){
		
		
		
		float totalkilo=Float.parseFloat(user.getTotalkilometers());
	     user.setFuelRequired((totalkilo/average)-intialPetrolInCar);
	
		
		user.setCostOfJourneyToAgency(petrolPerLitre*intialPetrolInCar);
		
		
		
		if(user.getCarName().equalsIgnoreCase("innova")) 
		{
			user.setCostOfJourneyToCustomer((chargePerKmOfInnova*totalkilo)+((user.getFuelRequired())*petrolPerLitre));
			user.setDiscountedPrice(((chargePerKmOfInnova-2)*totalkilo)+((user.getFuelRequired())*petrolPerLitre));
		}
		else if(user.getCarName().equalsIgnoreCase("swift")) 
		{
			user.setCostOfJourneyToCustomer((chargePerKmOfSwift*totalkilo)+((user.getFuelRequired())*petrolPerLitre));
			user.setDiscountedPrice(((chargePerKmOfSwift-2)*totalkilo)+((user.getFuelRequired())*petrolPerLitre));
		}
		else if(user.getCarName().equalsIgnoreCase("etios"))
		{
			user.setCostOfJourneyToCustomer((chargePerKmOfEtios*totalkilo)+((user.getFuelRequired())*petrolPerLitre));
			user.setDiscountedPrice(((chargePerKmOfEtios-2)*totalkilo)+((user.getFuelRequired())*petrolPerLitre));
		}
			
		
		user.setFuelRequired(user.getFuelRequired());
		
		
		
		
		return user;
		
	
		
		
	}



}
