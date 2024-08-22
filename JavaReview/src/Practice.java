////////////////////////////////////////
//	Java Review
//	8-21-24
//	CompSci254
//

import java.util.Scanner;

public class Practice 
{
	public static void main(String[] args)
	{
		int[] data = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < data.length; i++)
		{
			System.out.print("Please enter an integer: ");
			data[i] = scan.nextInt();		
		}
		
		for(int i = 0; i < data.length; i++)
		{
			System.out.print(data[i]);
		}
	}
}
