/*Write a Java method to find the smallest number among three numbers 
using scanner class.*/

package assignment2;
import java.util.*;
public class Question2 {

	public static void main(String[] args)
    {
	 
	 Scanner obj=new Scanner(System.in);
	 System.out.print("Enter the number of elements in an array:");
	 
	 int n=obj.nextInt();
	
	 int arr[]=new int[n]; 
	 int min;
	 for(int i=0; i<n; i++){
	    System.out.print("Enter the element "+(i+1)+"=");
	    arr[i]=obj.nextInt();
	    }
	    min=arr[0];
	    for(int i=0; i<n; i++){
	      if(min>arr[i]){
	      min=arr[i];
	    }
	    }
	    System.out.print("\nThe smallest value is: "+min);
	 }

}
