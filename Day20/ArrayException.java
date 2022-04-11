package Exception_handling;

public class ArrayException {
	
	public static void main(String[] args) {
		int arr[]=new int[5];
		try 
		{ 
			int num=arr[6];
			System.out.println(num);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("whatever you write here is execute");
		}
		
	}

}
