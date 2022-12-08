package MyProject1;

public class ShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//LeftShift <<
        int number = 2;
        
        // 2 bit left shift operation
        int Ans = number << 2;
 
        System.out.println("LeftShift Result : " + Ans);
        
        
        
        //RightShift >>
        int number1 = 8;
        
        // 2 bit signed right shift
        int Ans1 = number >> 2;
       
        System.out.println("RightShift Result : " + Ans1); 
        
        
        //Right >>>
        byte num1 = 8;
        byte num2 = -8;
      
        System.out.println(num1 >>> 2);   
        System.out.println(num2 >>> 2);
        

	}

}
