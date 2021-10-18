package com.bridgelabz;

import java.util.Scanner;
/**
 * Purpose  - As a User need to enter a valid First Name

 */
@@ -17,10 +17,16 @@ public static void main(String[] args) {
    UserRegistration user = new UserRegistration();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 1 : to validate First Name ");
    System.out.println("Enter 2 : to validate Last Name ");
    switch (scanner.nextInt()){
        case 1:
            UserRegistration.validFirstName();
            break;
        case 2:
            UserRegistration.validLastName();
            break;
        default:
            System.out.println("Select a valid number");
    }
}
}