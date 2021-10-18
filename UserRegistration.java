package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Purpose  - Should have at least 1 numeric number in the password
 * Purpose  - Should have atleast one spcial character in the password
 */

public class UserRegistration {
@@ -75,6 +75,7 @@ public static void validMobileNumber(){
    }
    /*
     Created a method to enter valid Password according to rule 1
     It should have minimum 8 characters
     */
    public static void validPassRule1(){
        Scanner scanner = new Scanner(System.in);
@@ -91,6 +92,7 @@ public static void validPassRule1(){
    }
    /*
    Created a method to enter valid Password according to rule 2
    It should have atleast one Upper Case
    */
    public static void validPassRule2(){
        Scanner scanner = new Scanner(System.in);
@@ -107,12 +109,30 @@ public static void validPassRule2(){
    }
    /*
     Created a method to enter valid Password according to rule 3
     It should have atleast one number in the password
     */
    public static void validPassRule3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the PassWord");
        String passWord2 = scanner.nextLine();
        String regex6 = "^[A-Z]{1}+[a-zA-Z].+[0-9].{8,}$";
        String regex6 = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";
        Pattern p6 = Pattern.compile(regex6);
        Matcher m6 = p6.matcher(passWord2);
        boolean r6 = m6.matches();
        if (r6)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }
    /*
     Created a method to enter valid Password according to rule 4
     It should have atleast one special character
     */
    public static void validPassRule4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the PassWord : ");
        String passWord2 = scanner.next();
        String regex6 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
        Pattern p6 = Pattern.compile(regex6);
        Matcher m6 = p6.matcher(passWord2);
        boolean r6 = m6.matches();