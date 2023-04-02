import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.print(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.print(e);
        }
        catch(InputMismatchException e)
        {
            System.out.print("java.util.InputMismatchException");
        }
    }
}