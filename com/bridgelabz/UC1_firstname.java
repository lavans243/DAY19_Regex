package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC1_firstname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern pat = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher m = pat.matcher("Regex");
		
		if(m.matches())
			System.out.println("Valid first name!");
		else
			System.out.println("Invalid first name!");
	}

	
}
