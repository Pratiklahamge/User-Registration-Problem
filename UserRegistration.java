package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Purpose  - As a User need to enter a valid Email Address
 * Purpose  - As a User need to enter a mobile number in a pre-defined format.
 */

public class UserRegistration {
@@ -57,4 +57,20 @@ public static void validEmailId(){
        else
            System.out.println("Email Address is Invalid");
    }
    /*
     Created a method to validate Mobile Number
     */
    public static void validMobileNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number : ");
        String phoneNo = scanner.nextLine();
        String regex3 = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(phoneNo);
        boolean r3 = m3.matches();
        if (r3)
            System.out.println("Phone number is Valid");
        else
            System.out.println("Phone number is Invalid");
    }
}