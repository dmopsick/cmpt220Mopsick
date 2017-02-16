
import java.util.Scanner;

//Dan Mopsick
//CMPT 220L_112
public class ThreeDot5 {

	public static void main(String[] args) {
		//Initialize the scanner
		Scanner scanner = new Scanner(System.in);
		
		//Prompt the user to enter the current day
		//Sunday is 0, Monday is 1 and so on
		System.out.println("Enter today's day.");
		
		//Parse input from the user
		int currentDay = scanner.nextInt();
		
		//Prompt the user to find out how many days elapsed
		System.out.println("Enter the number of days elapsed since today.");
		
		//Parse input from the user
		int daysElapsed = scanner.nextInt();
		
		//Calculate future day
		int futureDay = (currentDay + daysElapsed) % 7;
		String day = "";
		
		//Determine the name of the day
		if(futureDay == 0){
			day = "Sunday";
		}
		else if(futureDay == 1){
			day = "Monday";
		}
		else if(futureDay == 2){
			day = "Tuesday";
		}
		else if(futureDay == 3){
			day = "Wednesday";
		}
		else if(futureDay == 4){
			day = "Thursday";
		}
		else if(futureDay == 5){
			day = "Friday";
		}
		else if(futureDay == 6){
			day = "Saturday";
		}
		
		//Display info to the user
		System.out.println("Today is " + currentDay + " and the futre day is " + day);
		System.out.println(31 % 6);

	}

}
