package com.wipro.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/*
 * forEach() is an terminal operation
 */
public class StreamAPITester {

	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(10,20,25,16,9,48,21,57,80);
		stream1.forEach(System.out::println);
		/*
		 * Runtime error
		 * stream has already been operated upon or closed
		 */
//		stream1.forEach(System.out::println);
		
		System.out.println("---------------------------------");
		
		Integer[] marks = new Integer[] {10,20,25,16,9,48,21,57,80};
		
		Stream<Integer> marksStream = Arrays.stream(marks);
		marksStream.forEach(System.out::println);
		
		System.out.println("---------------------------------");
		Arrays.stream(marks).forEach(System.out::println);
		
		System.out.println("---------------------------------");
		//Integer[] -> ArrayList
		
		List<Integer> marksList = Arrays.asList(marks);
		System.out.println("Displaying: marksList.forEach()...");
		marksList.forEach(System.out::println);
		
//		Stream<Integer> marksListStream = marksList.stream();
//		marksListStream.forEach(System.out::println);
		System.out.println("Displaying: marksList.stream().forEach()...");
		marksList.stream().forEach(System.out::println);
	}

}
