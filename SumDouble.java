/**
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
 */

package operators;
import java.util.Scanner;
public class SumDouble
{
	public static int sumDouble(int a,int b)
	{
//		return (a!=b)?(a+b):(a+a+b+b);
		
		   if(a!=b)
		   return a+b;
		   else
		   return a+b+a+b;
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println(sumDouble(a,b));
	sc.close();
	}
}
