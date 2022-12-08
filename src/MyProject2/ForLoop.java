package MyProject2;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner number1 = new Scanner(System.in); 
		    System.out.println("Enter your favorite number : ");
		    int num1 = number1.nextInt(); 
		    Scanner number2 = new Scanner(System.in); 
		    System.out.println("How many times do yo want to see it ? ");
		    int num2 = number2.nextInt();
		    
		    for(int i=0 ; i <= num2 ;i++ ) {
		    	
		    	System.out.println("My fovorite number is : " + num1);
		    	
		    }

	}

}
