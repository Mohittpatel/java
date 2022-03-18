
import java.io.*;
 
class OverloadingEx {
 
    static int addition(int i, int j, int k)
    {
      return i + j + k;
    }
 
    static int addition(int i, int j, int k, int l)
    {
        return i + j + k + l;
    }
 
    public static void main(String args[])
    {
        System.out.println("Additoin function with 3 parameters");
        System.out.println(addition(4, 6, 9));
       
        System.out.println("Additoin function with 4 parameters");
        System.out.println(addition(4, 6, 7,8));
    }
}