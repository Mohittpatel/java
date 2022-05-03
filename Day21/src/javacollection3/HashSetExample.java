package javacollection3;
import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		System.out.println(hs);
		hs.add(30);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		//Hashset doesn't follow any order
		//It will not allow duplicates
		//accepts only one null value 
	}

}
