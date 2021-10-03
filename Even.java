package and;

import java.util.*;
public class Even {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int n = s.nextInt();
		
		if((n|1)>n)
			
		{
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		   s.close();
	}      
	   
} 
   