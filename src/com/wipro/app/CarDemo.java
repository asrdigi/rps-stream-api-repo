package com.wipro.app;

import java.util.ArrayList;
import java.util.List;

import com.wipro.model.Car;
import com.wipro.service.CarService;

public class CarDemo {

		private static List<Car> carList= new ArrayList<>();
		
		static {
			carList.add(new Car("Maruti","Swift DeZire",750000.00));
			carList.add(new Car("Maruti","Ciaz",1250000.00));
			carList.add(new Car("Hyundai","Verna",1350000.00));
			carList.add(new Car("Mercedes Benz","EQB",7500000.00));
			carList.add(new Car("BMW","X1",5500000.00));
		}
		
	public static void main(String[] args) {
		CarService service = new CarService();
		System.out.println("Total price of all the cars in the showroom..");
		System.out.println(service.getSumOfPrices(carList));
		
		System.out.println("List Car  Names..");
		service.getCarNames(carList).forEach(System.out::println);
		
		System.out.println("Cars in the given range..");
		service.getCarsInRange(carList, 800000.00, 1500000.00).forEach(System.out::println);
		
		System.out.println("Car with least price..");
		System.out.println(service.getLowestCar(carList));
		
		System.out.println("List of cars in descending order..");
		service.getSortedCars(carList).forEach(System.out::println);
	}

}
