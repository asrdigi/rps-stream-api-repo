package com.wipro.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
/*
 *  The Stream API methods min(), max(), reduce() methods return Optional object.
 *  
 *  Optional is a wrapper class which wraps the result into it. This class has methods
 *  to check if the stream API method has returned result or not
 */
public class IntermediateDemo {

	public static void main(String[] args) {
		Integer[] marks = new Integer[] {10,20,25,16,9,48,21,57,80};
		List<Integer> marksList = Arrays.asList(marks);
		
		marksList.stream().map(m->m*m).forEach(System.out::println);
		
		System.out.println("--------------------------");
		
//		List<Integer> squaredList = marksList.stream()
//									.map(n->n*n)
//									.collect(Collectors.toList());
		
		List<Integer> squaredList = marksList.stream()
									.map(n->n*n)
									.toList();
		squaredList.forEach(System.out::println);
		
		System.out.println("-------------------------------------");
		List<String> courseList= new ArrayList<>();
		courseList.add("Java");courseList.add("java ee");
		courseList.add("JavaScript");courseList.add("Spring");
		courseList.add("Java");courseList.add("java ee");
		
		//convert & collect the above course names to upper-case letter into another list and display
		List<String> courseNewList = courseList.stream()
									 .map(s->s.toUpperCase())
									 .toList();
		courseNewList.forEach(System.out::println);
		
		System.out.println("----------------------------");
		//display the courses with java in it	
		courseList.stream()
		.map(s->s.toUpperCase())
		.filter(s->s.contains("JAVA"))
		.forEach(System.out::println);
		
		System.out.println("Distinct courses...");
		courseList.stream().distinct().forEach(System.out::println);
		
		System.out.println("Display first 3 courses..");
		courseList.stream().limit(3).forEach(System.out::println);
		
		
		System.out.println("Skip first 3 courses..");
		courseList.stream().skip(3).forEach(System.out::println);
		
		System.out.println("Sorted list of courses..");
		// display the courses in an order
		courseList.stream().sorted().forEach(System.out::println);
		
		
		/*
		 * Optional<Integer> java.util.stream.Stream.min(
													   Comparator<? super Integer> comparator
													)

		  Comparator<Integer> : int compare(Integer, Integer)
		  The compare() has to be implemented using lambda,
		  						(a,b)->a.compareTo(b)
		 */
		Optional<Integer> optional = marksList.stream().min((a,b)->a.compareTo(b));
		//get() extract the result from the Optional object
		if(optional.isPresent()) {
			System.out.println("Minimum mark: "+optional.get());
		}else {
			System.out.println("No min value");
			
		}
		
		int maxMark = marksList.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println("Maximum mark: "+ maxMark);
		
		/*
		Optional<Integer> java.util.stream.Stream.reduce(
				BinaryOperator<Integer> accumulator
				)
		*/
		Optional<Integer> optional1 = marksList.stream()
									.reduce((n1,n2)->n1+n2);
		System.out.println("Total marks: "+ optional1.get());
		
		List<String> namesList= new ArrayList<>();
		namesList.add("Ravi Kumar"); namesList.add("Lavanya");
		namesList.add("Bhavana"); namesList.add("Vinod");
		
		System.out.println("Total number of  characters in all names..");
		int totalCharacters = namesList.stream()
							  .map(s->s.length())
							  .reduce((a,b)->a+b).get();
		System.out.println(totalCharacters);
							   
		
	}

}
