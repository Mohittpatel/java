package com.lambdaexpression;

interface inf
{ 
	public void add (int i, int j, int k);
}

public class LambdaExp {

	public static void main(String[] args) {
		inf a=(int i,int j ,int k)->System.out.println(i+j+k);
       a.add(400,900,555);

	}

}
