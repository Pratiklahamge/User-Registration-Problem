package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Purpose  - As a User need to enter a mobile number in a pre-defined format.
 * Purpose  - As a User need to enter a password with minimum 8 character.
 */

public class UserRegistration {
@@ -58,7 +58,7 @@ public static void validEmailId(){
            System.out.println("Email Address is Invalid");
    }
    /*
     Created a method to validate Mobile Number
     User need to enter a valid mobile number
     */
    public static void validMobileNumber(){
        Scanner scanner = new Scanner(System.in);
@@ -73,4 +73,20 @@ public static void validMobileNumber(){
        else
            System.out.println("Phone number is Invalid");
    }
    /*
     User need to enter a valid Password according to rule 1
     */
    public static void validPassRule1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Password according to rule 1 : ");
        String passWord = scanner.nextLine();
        String regex4 = "^[A-Z a-z 0-9]{8,}$";
        Pattern p4 = Pattern.compile(regex4);
        Matcher m4 = p4.matcher(passWord);
        boolean r4 = m4.matches();
        if (r4)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }
}


