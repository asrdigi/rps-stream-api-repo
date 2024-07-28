package com.wipro.service;

import java.util.Comparator;
import java.util.List;

import com.wipro.model.Car;


// write the code using Stream API
public class CarService {
//returns sum of prices of all the cars in the list
public double getSumOfPrices(List<Car> carList) {
	return carList.stream().mapToDouble(c->c.getPrice()).sum();

}

  //returns list of all car names
public List<String> getCarNames(List<Car> carList) {
	return carList.stream().map(c->c.getCarName()).toList();
}

//returns Cars within the given range
public List<Car> getCarsInRange(List<Car> carList, Double lower, Double upper) {
	return carList.stream()
			.filter( c -> (c.getPrice()>lower && c.getPrice() <upper))
			.toList();
}

//returns car which has least price
public Car getLowestCar(List<Car> carList) {
	return carList.stream().sorted(Comparator.comparing(c->c.getPrice())).toList().get(0);
}

//returns List of Cars in the descending order of price
public List<Car> getSortedCars(List<Car> carList){
	return carList.stream().sorted((c1,c2)->c2.getPrice().compareTo(c1.getPrice())).toList();
}
}
