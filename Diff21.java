/**
 * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0

 */
package operators;
import java.util.Scanner;

public class Diff21 
{
	public static int diff21(int n)
	{
		return (n<21)?(21-n):((n-21)+(n-21));
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(diff21(n));
		sc.close();
	}
}

/**
 * Space Complexity : O(1)
 * Time Complexity :O(1)
 */
