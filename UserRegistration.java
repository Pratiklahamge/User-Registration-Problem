package com.bridgelabz;
/**
 * Purpose  - As a User need to enter a valid First Name
 */

public class UserRegistration {
	   public static final Scanner scanner = new Scanner(System.in);

	    /*
	    Created a method to validate first name
	     */
	    public static void validFirstName(){
	        System.out.print("Enter the First Name : ");
	        String name = scanner.next();
	@@ -22,4 +24,21 @@ public static void validFirstName(){
	        else
	            System.out.println("First name is !Invalid");
	    }
	    /*
	    Created a method to validate last name
	     */
	    public static void validLastName(){
	        System.out.println("Enter the Last Name");
	        String lname = scanner.next();

	        String regex1 = "^[A-Z]{1}[a-z]{2,}$";

	        Pattern p1 = Pattern.compile(regex1);
	        Matcher m1 = p1.matcher(lname);
	        boolean r1 = m1.matches();
	        if (r1)
	            System.out.println("Last name is Valid");
	        else
	            System.out.println("Last name is Invalid");
	    
	}
}
