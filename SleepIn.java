/***
 * Question -01
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */


package operators;

import java.util.Scanner;

public class SleepIn {


	public static boolean sleepIn(boolean weekday, boolean vacation) {
		/* 
		 * METHOD -01
		 * 
		        return !weekday || vacation;
		        
		 */
		
		//METHOD -02
		if(weekday == false && vacation == true || weekday==true && vacation ==true ||weekday==false && vacation ==false)
		{
			return true;
		}
		else 

			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Is it a weekend? (true/false): ");
		boolean weekend = sc.nextBoolean();

		System.out.print("Are you on vacation? (true/false): ");
		boolean vacation = sc.nextBoolean();

		
		boolean canSleepIn = sleepIn(weekend, vacation);
		System.out.println("Can you sleep in? " + canSleepIn);
		sc.close();
	}
}



/***
 * LOGIC-01
 * 
 * 	space and time complexity 
 * 
 * The time complexity of this program is O(1) because the program only performs a fixed number of operations, regardless of the input size. The program prompts the user for input, calls the sleepIn method, and prints the result. These operations take a constant amount of time.

The space complexity of this program is also O(1) because the program does not use any additional space that grows with the input size. It only uses a fixed amount of space to store the boolean variables and the scanner object.

 * LOGIC -02
 * 
 * The time complexity of the sleepIn method is O(1) because it only performs a constant number of comparisons and returns a boolean value. The space complexity is also O(1) because it does not use any additional data structures that grow with the input size.

 * */
