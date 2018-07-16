package com.java8.lambdas;

public class LambdaWordCount {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over a lazy dog";
		
		WordCount<String,Integer> wordCount  =  s -> {
			String[] splittedStrings = s.split(" ");
			return splittedStrings.length;
		};
		
		int length = wordCount.count(str);
		System.out.println("No of words in the given string are: " + length);
	}

	@FunctionalInterface
	public interface WordCount<U,V> {
		V count(U value);
	}
}
