import java.util.ArrayList;
import java.util.Scanner;

public class Get_Stair_path {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String> stairpaths=printStairPaths(n);
        System.out.print(stairpaths);
        scn.close();
    }
    public static ArrayList<String> printStairPaths(int n)
    {
        if(n==0)
        {
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(n<0)
        {
            ArrayList<String> bres=new ArrayList<>();
            return bres;
        }
        ArrayList<String> path1=printStairPaths(n-1);
        ArrayList<String> path2=printStairPaths(n-2);
        ArrayList<String> path3=printStairPaths(n-3);
        ArrayList<String> paths=new ArrayList<>();
        for(String p1:path1)
        {
            paths.add(1+p1);
        }
        for(String p2:path2)
        {
            paths.add(2+p2);
        }
        for(String p3:path3)
        {
            paths.add(3+p3);
        }
        return paths;
    }
}
