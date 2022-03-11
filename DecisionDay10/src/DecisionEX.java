import java.util.*;

 class fact {
	 
	public int factorial(int num) {
		
		if(num==1) 
			return 1;
		
		return(num*factorial(num-1));
		
}
public class DecisionEX {
	


	public static void main(String[] args) {
	
      fact obj= new fact();
      
      System.out.println("please enter the number");
      
      Scanner input = new Scanner(System.in);
      
      int num1=input.nextInt();
      
      int result=obj.factorial(num1);
      
      System.out.println("Factorial of "+num1+"is"+result);
      
      
	}

}
}
