package StepDefinations;

import java.awt.List;

import io.cucumber.datatable.DataTable;

public class ActualCode {
	
	public static void openApp() {
		System.out.println("Opening App....");
	}
	public static void enterCredentials() {
		System.out.println("Entering Credentials....");
	}
	public static void enterCredentials(String username,String password) {
		System.out.println("username is: "+username);
		System.out.println("Password is: "+password);
	}
	public static void submit() {
		System.out.println("Submitting....");
	}
	public static void validating() {
		System.out.println("Validating....");
	}
	public static void dataTable(DataTable dataTable) {
		System.out.println(dataTable.asList());
		java.util.List<String> abc = dataTable.asList();
		System.out.println("Username is: "+ abc.get(2));
		System.out.println("Password is: "+ abc.get(3));
	}
}
