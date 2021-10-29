package com.sonata;

public class ReplaceVowelsWithDollarSymbol {
	public static void main(String arg[]) {
		String str = "Hello good morning";
		
		//replace vowels[AEIOUaeiou] with $ symbol
		
		str=str.replaceAll("A","\\$");  
		str=str.replaceAll("E","\\$");
		str=str.replaceAll("I","\\$");
		str=str.replaceAll("O","\\$");
		str=str.replaceAll("U","\\$");
		str=str.replaceAll("a","\\$");
		str=str.replaceAll("e","\\$");
		str=str.replaceAll("i","\\$");
		str=str.replaceAll("o","\\$");
		str=str.replaceAll("u","\\$");
		System.out.println(str);
		
		
	}
}