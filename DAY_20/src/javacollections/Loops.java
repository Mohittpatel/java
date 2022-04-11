package javacollections;

import java.util.ArrayList;
import java.util.Iterator;

public class Loops {

	public static void main(String[] args) {
	
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mohit");
		al.add("Ram");
		al.add("Shyam");
		al.add("Vishal");
		al.add("Rahul");
		
		System.out.println("forloop");
		for(int i=0; i<al.size();i++)
		{ 
			System.out.println(al.get(i));
		}
		
		
		System.out.println("Advanced forloop");
		for(String str:al)
		{
		  System.out.println(str);
	}
        
		
		System.out.println("while loop");
		int count=0;
		while(al.size()>count)
		{
			System.out.println(al.get(count));
			count++;
		}
		
		
		System.out.println("Iterator");
		Iterator it=al.iterator();
		while(it.hasNext())
		{ 
			System.out.println(it.next());
		}

	}

}
