package edu.cgcc.cs161;
//HEADER
//Program Name: Week 5 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 2/11/2021
//Description: This class holds the information to the person. 
import java.time.LocalDate;
public class Person {

	 
		
		private String firstName;
		private String lastName;
		private int age;
		LocalDate birthdate;
		LocalDate today;

		
		
		 public Person() {
			 firstName="Garry";
			 lastName="Sexton";
			 age=18;
			

			 if (firstName == null)
		        {
		            throw new IllegalArgumentException("firstName can't be null");
		        }           
		     if (lastName == null)
		        {
		            throw new IllegalArgumentException("lastName can't be null");
		        }
		        
		     if (firstName=="") {
		    	 throw new IllegalArgumentException("firstName can't be empty");
		     }
		     if (lastName=="") {
		    	 throw new IllegalArgumentException("lastName can't be empty");
		     }
		    	 
		     if (age > 125 || age < 0) {
						throw new IllegalArgumentException("Invalid integer");
		    	 }
		     
		     /*
		      * Restrict String input from user to alphabetic and numerical values. 
		      * Retrieved from:
		      * https://stackoverflow.com/questions/3090795/restrict-string-input-from-user-to-alphabetic-and-numerical-values
		      */
		     while (!lastName.matches("^[a-zA-Z]+$")) {
			        System.out.print("Nope, the following is invalid: ");
		break; }
		     while (!firstName.matches("^[a-zA-Z]+$")) {
			        System.out.print("Nope, the following is invalid: ");
			        break;}
		     
		    
		 }
		
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String fN) {
			this.firstName =fN;
		}
		
		public String getLastName() {
	
			return lastName;
		}
		public void setLastName(String lN) {
			this.lastName = lN;
			}
		
		public int getAge() {
			return age;
			     
		}


		public void setAge(int A) {
		
			if (age > 125 || age < 0) {
				throw new IllegalArgumentException("Invalid integer");
			      } else {
			         this.age = A;
		}
		
		}
		
		
}
		
/*FOOTER
 * Garry Sexton
 * Garry Sexton is 18
 * 18
 */

