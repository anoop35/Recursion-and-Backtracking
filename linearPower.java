import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int p=scn.nextInt();
        int pow=power(n,p);
        System.out.print(pow);
    }

    public static int power(int x, int n){
        if(n==0)
        {
            return 1;
        }
        int nm1=power(x,n-1);
        int power=x*nm1;
        return power;
    }

}
