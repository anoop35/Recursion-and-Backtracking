import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        ArrayList res=gss(str);
        System.out.print(res);

    }

    public static ArrayList<String> gss(String str) {
       if(str.length()==0)
       {
           ArrayList bres=new ArrayList();
           bres.add("");
           return bres;
       }
       char ch=str.charAt(0);
       String ros=str.substring(1);
       ArrayList<String> res=gss(ros);
       ArrayList mres=new ArrayList();
       for(String st:res)
       {
           mres.add(""+st);
       }
       for(String st:res)
       {
           mres.add(ch+st);
       }
       return mres;
    }

}
