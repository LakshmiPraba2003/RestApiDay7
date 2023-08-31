package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Car;
import com.example.demo.Repository.CarRepo;
@Service

public class ApiService {
 
 @Autowired
 CarRepo cre;
 public Car addCar(Car c) {
 	return cre.save(c);
 }
 public List<Car> showinfo(){
 	   return cre.findAll();
 }
 public List<Car> showowners(int owners){
 return cre.getowners(owners)	;
 }
 public List<Car> showaddress(String address){
 	return cre.getaddress(address);
 }
 public List<Car> showcarname(String carName){
 	return cre.getcarName(carName);
 }
 public List<Car> showcarownerandtype(int owner,String type){
 	return cre.getownersandcartype(owner, type);
 }
 public Car changeinfo(Car c) {
 	   return cre.saveAndFlush(c);
 }

 
}
                                                                                                  