package MyProject2;

import java.util.Scanner;

public class SwitchControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner num = new Scanner(System.in); 
		    System.out.println("Enter a number between 1 t0 7 : ");
		    int n = num.nextInt();
		    
		    String strDay;
		    
		    switch (n) {
		    
	        // Case
	        case 1:
	            System.out.println("It is Monday");
	            break;
	        case 2:
	        	System.out.println("It is Tuesday");
	            break;
	        case 3:
	        	System.out.println("It is Wednesday");
	            break;
	        case 4:
	        	System.out.println("It is Thursday");
	            break;
	        case 5:
	        	System.out.println("It is Friday");
	            break;
	        case 6:
	        	System.out.println("It is Saturday");
	            break;
	        case 7:
	        	System.out.println("It is Sunday");
	            break;
	            
	            default:
	            	System.out.println("Your input number is invalid !! Try Again !!!");

	}

}
}
