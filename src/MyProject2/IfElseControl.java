package MyProject2;
import java.util.Scanner;

public class IfElseControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner number1 = new Scanner(System.in); 
		    System.out.println("Enter a first number: ");
		    int num1 = number1.nextInt(); 
		    Scanner number2 = new Scanner(System.in); 
		    System.out.println("Enter a second number: ");
		    int num2 = number2.nextInt();
		    
		    if(num1 > num2) {
		    	System.out.println("The first number is greater than the second number !!! ");
		    }
		    else if(num1 < num2) {
		    	System.out.println("The first number is less than the second number !!!!");
		    }
		    else {
		    	System.out.println("The first and second numbers are the same!!!!!");
		    }
		    
		     
		

		
		
		
		

	}

}
