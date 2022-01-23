import java.util.ArrayList;
import java.util.Scanner;

public class Print_Maze_Path {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int m=scn.nextInt();
    ArrayList<String> paths=printMazePath(1,1,n,m);
    System.out.print(paths);    
    scn.close();
    }
  public static ArrayList<String> printMazePath(int h,int v,int n,int m){
      if(h==m && v==n){
    ArrayList<String> bres=new ArrayList<>();
    bres.add("");
    return bres;  
    }
    if(h>m || v>n)
    {
        ArrayList<String> bres=new ArrayList<>();
        return bres;
    }
    ArrayList<String> path1=printMazePath(h+1, v, n, m);
    ArrayList<String> path2=printMazePath(h, v+1, n, m);
    ArrayList<String> paths=new ArrayList<>();
    for(String path:path1)
    {
        paths.add('h'+path);
    }  
    for(String path:path2)
    {
        paths.add('v'+path);
    }
    return paths;
  }
}
