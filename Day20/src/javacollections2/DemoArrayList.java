package javacollections2;
import java.util.*;
public class DemoArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mohit");
		al.add("Ram");
		al.add("Shyam");
		al.add("Vishal");
		al.add("Rahul");

		System.out.println(al);
		al.set(2, "Raj");
		System.out.println(al);
		al.add(2, "Shyam");
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		
		
	}

}
