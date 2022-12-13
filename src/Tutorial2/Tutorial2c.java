package Tutorial2;

import java.util.Scanner;

public class Tutorial2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);  
		System.out.print("Enter your favorite year : ");  
		//reading value from user  
		int year=scan.nextInt(); 
		
		if(year%4 ==0 && year%100 ==0 || year%400 ==0) {
			
			System.out.println(year + "is a leap year !! ");
			
		}
		else {
			
			System.out.println(year + " is not a leap year !! ");
			
		}
		
		

	}

}
