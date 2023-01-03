package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC3_validemail {
	//First name Validation
    public static boolean checkValidName(String firstName) {
        String firstNameRegex= "^[A-Z]{1}[A-Za-z]{2,}$";
        Pattern obj= Pattern.compile(firstNameRegex);

        if(firstName==null) {
            return false;

        }
        Matcher obj2 = obj.matcher(firstName);
        return obj2.matches();
    }
 // Last Name Validation
    public static boolean checkValidLastName(String lastName) {
        String firstNameRegex= "^[A-Z]{1}[A-Za-z]{2,}$";
        Pattern obj= Pattern.compile(lastName);

        if(lastName==null) {
            return false;

        }
        Matcher obj2 = obj.matcher(lastName);
        return obj2.matches();
    }

    public static boolean checkValidemail(String email) {
        String emailRegex= "^[A-Za-z0-9]+[@][a-zA-Z]+[.][a-zA-Z]+[.]?[a-zA-Z]{2}$";
        Pattern obj= Pattern.compile(email);

        if(email==null) {
            return false;

        }
        Matcher obj3 = obj.matcher(email);
        return obj3.matches();
    }


    public static void main(String[] args) {

        String firstName ="Lavanya";
        String lastName = "Karunakaran";
        String email = "lavans243@gmail.com";

        boolean isfirstName = checkValidName(firstName);
        boolean islastName = checkValidLastName(lastName);
        boolean isemail = checkValidemail(email);

        if(isfirstName)
            System.out.println(firstName+" is a Valid firstName");
        else
            System.out.println(firstName+" is a Invalid firstName");

        if (isfirstName)
            System.out.println(lastName + " is a valid last name");
        else
            System.out.println(lastName + " is a valid last name");

        if (isemail)
            System.out.println(email + " is a valid Email ID");
        else
            System.out.println(email + " is a valid Email ID");
    }
}
