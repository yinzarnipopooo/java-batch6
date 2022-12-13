package Tutorial2;

import java.util.Scanner;

public class Tutorial2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		//reading value from user  
		int num=scan.nextInt();  
		//method calling  
		findPosNeg(num);  
		}  
		//user defined method  
		public static void findPosNeg(int num)  
		{  
		//method body  
		if(num>=0)   
		System.out.println(num+" is positive!!");   
		else   
		System.out.println(num+" is negative!!");  
		} 

	}


