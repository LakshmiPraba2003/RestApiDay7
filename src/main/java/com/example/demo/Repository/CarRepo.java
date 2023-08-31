package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Models.Car;

public interface CarRepo extends JpaRepository<Car, Integer>{
	@Query(value="select * from Cardetails where owners=:n",nativeQuery=true)
	public List<Car> getowners(@Param("n") int owners);
	@Query(value="select * from Cardetails where address=:n",nativeQuery=true)
	public List<Car> getaddress(@Param("n") String address);
	@Query(value="select * from Cardetails where car_name=:n",nativeQuery=true)
	public List<Car> getcarName(@Param("n") String carName);
	@Query(value="select * from Cardetails where owners=:n or car_type=:s",nativeQuery=true)
	public List<Car> getownersandcartype(@Param("n") int owners,@Param("s") String carType);
}
