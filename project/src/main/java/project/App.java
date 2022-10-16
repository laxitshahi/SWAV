package project;

public class App {

	public static void main(String[] args) {
		String aCountry, dataType, startYear, endYear;
		
		aCountry = "CAN";
		dataType = "SP.POP.TOTL";
		startYear = "2000";
		endYear = "2001";
		
		System.out.println(Controller.getYearlyPopulation(aCountry, dataType, startYear, endYear));
		
	}
}
