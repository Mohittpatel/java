//Write a Java program to find the number of days in a month.

package assignment2;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int month;
		System.out.println("Please enter a Month number");
		month=sc.nextInt();
		
		switch(month)
		{
		case 1:
			System.out.println("31 Days in this Month");
			break;
		case 2:
			System.out.println("28 Days in this Month");
			break;
		case 3:
			System.out.println("31 Days in this Month");
			break;
		case 4:
			System.out.println("30 Days in this Month");
			break;
		case 5:
			System.out.println("31 Days in this Month");
			break;
		case 6:
			System.out.println("30 Days in this Month");
			break;
		case 7:
			System.out.println("31 Days in this Month");
			break;
		case 8:
			System.out.println("31 Days in this Month");
			break;
		case 9:
			System.out.println("30 Days in this Month");
			break;
		case 10:
			System.out.println("31 Days in this Month");
			break;
		case 11:
			System.out.println("30 Days in this Month");
			break;
		case 12:
			System.out.println("31 Days in this Month");
			break;
		default:
			System.out.println("please enter valid Number");
		}
		
	}

}
