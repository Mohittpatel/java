package com.lambdaexpression;

import java.util.LinkedList;

public class ForEach {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("mohit");
		l.add("rahul");
		l.add("srajan");
		l.forEach((n)->{System.out.println(n);});
	}

}
