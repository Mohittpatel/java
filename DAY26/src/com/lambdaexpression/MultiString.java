package com.lambdaexpression;
interface MultiSt
{
	String say (String message);
}
public class MultiString {

	public static void main(String[] args)
	{
		 MultiSt ms=(message)-> {String str1="Hello ";
         String str2=str1+message;
         return str2;};
     System.out.println(ms.say("Happy weekend"));
	}

}
