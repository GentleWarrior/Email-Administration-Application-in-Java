package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultpasswordlength = 10;
	private String alternateEmail;
	private String companySuffix = "cyusatech.com";
	
	
	//TO DO
	
	// CONSTRUCTOR TO RECEIVE THE FName and LName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		//Call a method to ask for the department. 
		this.department = setDepartment();
		
		
		//Call a method that returns a random Password
		this.password = randomPassword(defaultpasswordlength);
		System.out.println("Your Password is: " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."+ companySuffix;
		
	}
		
	
	// Ask for the department
	private String setDepartment(){
		System.out.print("Department Codes\n1 for Sales:\n2 for Accounting:\n3 for IT: \n4 for Development: \n0 for None: \n Enter Department Code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "Sales"; }
		else if(depChoice == 2) {return "Accounting";}
		else if(depChoice == 3) {return "IT";}
		else if(depChoice == 4) {return "Developmnent";}
		else if(depChoice == 0)	{return "None";}
		else {return "";}
		
	}
	
	//Generate Random Password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%&*";
		char[] password = new char[length];
		for (int i = 0; i<length; i++ ) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	
	// Set mailbox capacity
	public void SetMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		
	}
	
	//Set Alternate Email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void ChangePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity; }
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password; }

	public String showInfo() {
		return "DISPLAY NAME:" + firstName + " " + lastName + " " +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	

}
