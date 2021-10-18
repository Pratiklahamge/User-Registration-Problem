package com.bridgelabz;

import java.util.Scanner;
import java.util.Scanner;
/**
 * Purpose  - Should have at least 1 numeric number in the password
 * Purpose  - Should have atleast 1 Special Character in the password

@@ -23,6 +23,7 @@ public static void main(String[] args) {
        System.out.println("Enter 5 : to validate Password Rule 1 ");
        System.out.println("Enter 6 : to validate Password Rule 2 ");
        System.out.println("Enter 7 : to validate Password Rule 3 ");
        System.out.println("Enter 8 : to validate Password Rule 4 ");
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validFirstName();
@@ -45,8 +46,11 @@ public static void main(String[] args) {
            case 7:
                UserRegistration.validPassRule3();
                break;
            case 8:
                UserRegistration.validPassRule4();
                break;
            default:
                System.out.println("Select a valid number");
                System.out.println("Invalid! Select a valid number");
        }
    }
}