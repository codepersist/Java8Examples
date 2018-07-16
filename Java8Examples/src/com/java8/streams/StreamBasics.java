package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasics {

		public static void main(String[] args) {

			List<String>  stringList = Arrays.asList(
					new String(""),
					new String(""),
					new String("Chandler"),
					new String("Joey"),
					new String("Phoebe"),
					new String("Rachael"),
					new String("Monica"),
					new String("Ross")
					);
			
			long countOfStrings = stringList.stream().filter(x -> (x.length() > 5)).count();
			System.out.println("Count of Strings with length more than 5:- "  + countOfStrings);
			
			long count = stringList.stream().filter(x -> x.isEmpty()).count();
			System.out.println("Count of Empty Strings:- " + count);
			
			List<String> filteredList = stringList.stream().filter(x -> x.isEmpty())
							   .collect(Collectors.toList());
		}
}
