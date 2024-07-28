package com.wipro.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<Integer> marksList = new ArrayList<>();

		marksList.add(89); marksList.add(59); marksList.add(99);
		marksList.add(65); marksList.add(89); marksList.add(90);

		System.out.println("Imperative Programming...");
		System.out.println("displaying the list through index-based... ");
		
		for(int i=0 ; i<marksList.size();i++){
		  System.out.println(marksList.get(i));
		}

		System.out.println("displaying the list using iterator... ");
		Iterator<Integer> iterator = marksList.iterator();
		while(iterator.hasNext() ){
		  System.out.println(iterator.next());
		}
		
		
		System.out.println("Declarative programming...using lambda");
		marksList.forEach(m->System.out.println(m)  )  ;
		
		
		System.out.println("Declarative programming...using method reference");
		marksList.forEach(System.out::println);
		
	

		
		
	}

}
