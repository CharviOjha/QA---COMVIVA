package com.junit;

public class EmailValidator {
	public boolean isValidEmail(String email) {
		 
		 return email != null && email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
		 }
		 public boolean isCorporateEmail(String email) {
		 
		 return email != null && email.endsWith("company.com");
		 }
}
