import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int fact=factorial(n);
        System.out.print(fact);
    }

    public static int factorial(int n){
        if(n==1)
        {
            return 1;
        }
        int nm1=factorial(n-1);
        int fn=n*nm1;
        return fn;
    }

}
