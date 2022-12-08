package MyProject1;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // initializing variables
        int num1 = 10, num2 = 20, sum = 0,sub=0,mult=0,div=0,mod=0;
  
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
  
        // adding num1 and num2
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
        
        //subtracting num1 and num2
        sub = num1 - num2;
        System.out.println("The subtracting result  = " + sub);
        
        //multiplying num1 and num2
        mult = num1 * num2;
        System.out.println("The multiplying result  = " + mult);
        
        //dividing num1 and num2
        div = num2 / num1;
        System.out.println("The dividing result  = " + div);
        
        //modulus num1 and num2
        mod = num1 / num2;
        System.out.println("The modulus result  = " + mod);
        

	}

}
