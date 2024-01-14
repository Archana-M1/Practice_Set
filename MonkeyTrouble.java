/**
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
 */
package operators;
import java.util.Scanner;

public class MonkeyTrouble {
	
	public static boolean monkeyTrouble(boolean aSmile,boolean bSmile)
	{
//	return (aSmile && bSmile)||(!aSmile && !bSmile)	;
		
		   if(aSmile ==true && bSmile== true ||aSmile ==false && bSmile== false  )
		   return true;
		   else
		   return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		boolean aSmile , bSmile;
		aSmile=sc.nextBoolean();
		bSmile=sc.nextBoolean();
		System.out.println(monkeyTrouble(aSmile,bSmile));
		sc.close();
	}
}


/***
 * 	Time Complexity:O(1)
 * 	Space Complexity:O(1)
 * */
