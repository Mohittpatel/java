/*Write a program in Java to display the multiplication table
  of a given integer.*/


package assignment2;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		int num,i;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=1;i<11;i++)
		{
			
			System.out.println(num +"*"+i+" = "+num*i);
			
		
		}

}}
