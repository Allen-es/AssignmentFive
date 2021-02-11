package edu.cgcc.cs161;
//HEADER
//Program Name: Week 5 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 2/11/2021
//Description: This main class is the controller to person. 
import java.time.LocalDate;
import java.time.Period;
public class Main {

	public static void main(String[] args) {
		
		
	
	Person p = new Person();
	System.out.println(p.getFirstName()+" "+p.getLastName());
	
	Person t = new Person();
	 System.out.println(t.getFirstName()+" "+t.getLastName()+ " "+"is"+ " " +t.getAge());
	
	 LocalDate today = LocalDate.now();
	 LocalDate birthdate = LocalDate.of(2002, 5, 26);
	 int years = Period.between(birthdate, today).getYears();
	 System.out.println(years);
		

}
}
