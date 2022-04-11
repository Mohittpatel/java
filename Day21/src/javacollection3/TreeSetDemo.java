package javacollection3;
import java.util.TreeSet;
import java.util.Set;
public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> hs=new TreeSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		System.out.println(hs);
		hs.add(10);
		hs.add(60);	
		System.out.println(hs);

		//It will not allow duplicates
		//It will not accepts null value 
	}

}
