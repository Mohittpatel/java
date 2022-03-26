package Exception_handling;

public class DemoException {

	public static void main(String[] args) {
	
		int num1=50/10;
		System.out.println(num1);
		try 
		{ 
			int num2=50/0;
			System.out.println(num2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		int num3=50/5;
		System.out.println(num3);

	}

}
