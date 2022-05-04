package com.javacollections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args)
	{
		
				Stack<String> obj=new Stack<String>();
				obj.push("mohit");
				obj.push("mahi");
				obj.push("raj");
				obj.push("dev");
				
				System.out.println(obj);
				
				obj.pop();
				
				System.out.println(obj);

	}

}
