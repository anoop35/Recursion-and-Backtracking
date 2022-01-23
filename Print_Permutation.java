import java.util.Scanner;

public class Print_Permutation {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printPermutation(str,"");
        scn.close();
    }
    public static void printPermutation(String str,String psf)
    {
        if(str.length()==0)
        {
            System.out.println(psf);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String lstr=str.substring(0,i);
            String rstr=str.substring(i+1);
            String ros=lstr+rstr;
            printPermutation(ros, psf+ch);
        }
    }
}
