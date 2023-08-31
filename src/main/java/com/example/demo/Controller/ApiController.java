package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Car;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService cser;
	@PostMapping("add")
	public Car add(@RequestBody Car c) {
	return cser.addCar(c);
	}
	@GetMapping("show")
	public List<Car> show(Car c){
		return cser.showinfo();

	}
	@GetMapping("owners/{owners}")
	public List<Car> showownsers(@PathVariable int owners){
		return cser.showowners(owners);
	}
	@GetMapping("address/{address}")
	public List<Car> showadddress(@PathVariable String address){
		return cser.showaddress(address);
	}
	@GetMapping("carName/{carName}")
	public List<Car> showname(@PathVariable String carName){
		return cser.showcarname(carName);
	}
	@GetMapping("owners/{owners}/cartype/{cartype}")
	public List<Car> showinfo(@PathVariable int owners,@PathVariable String cartype){
		return cser.showcarownerandtype(owners, cartype);
	}
	@PutMapping("update")
	public Car modify(@RequestBody  Car c) {
		return cser.changeinfo(c);
	}
}
