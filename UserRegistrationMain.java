package com.bridgelabz;

import java.util.Scanner;
/**
 * Purpose  - As a User need to enter a valid E-mail ID
 * Purpose  - As a User need to enter a mobile number in a pre-defined format.

 @@ public static void main(String[] args) {
        System.out.println("Enter 1 : to validate First Name ");
        System.out.println("Enter 2 : to validate Last Name ");
        System.out.println("Enter 3 : to validate E-mail Address ");
        System.out.println("Enter 4 : to validate Mobile Number ");
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validFirstName();
 @@ public static void main(String[] args) {
            case 3:
                UserRegistration.validEmailId();
                break;
            case 4:
                UserRegistration.validMobileNumber();
                break;
            default:
                System.out.println("Select a valid number");
        }
