//1.Write a Java program to swap two variables. 

package assignment2;

public class Swapping {

	public static void main(String[] args) {
		
		int a=25; 
		int b=35; 
		System.out.println("before swapping"+" a="+a+" b="+b);
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println("After swapping"+"  a="+a+"  b="+b);
	}

}
