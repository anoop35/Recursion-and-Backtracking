import java.util.ArrayList;
import java.util.Scanner;

public class Keypad {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        String str=scn.next();
        ArrayList<String> comb=getKey(str);
        System.out.print(comb);
        scn.close();
    }
    static String key[]={".;","abc","def","ghi","jkl","mon","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKey(String  str)
    {
        if(str.length()==0)
        {
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char chcode=str.charAt(0);
        String rstr=str.substring(1);
        ArrayList<String> res=getKey(rstr);
        ArrayList<String> mres=new ArrayList<>();
        String cod=key[chcode-'0'];
        for(int i=0;i<cod.length();i++)
        {
            char ch=cod.charAt(i);
            for(String strs:res)
            mres.add(ch+strs);
        }
        return mres;
    }
}
