import java.util.Scanner;

public class Print_Maze_Path_with_Jump {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        printMazePathWithJump(1,1,m,n,"");
        scn.close();
    }
    public static void printMazePathWithJump(int sr,int sc,int dr,int dc,String psf){
        if(sr==dr && sc==dc)
        {
            System.out.println(psf);
            return;
        }
     {
         printMazePathWithJump(sr, sc+j, dr, dc, psf + "h"+j);
     }
     for(int j=1;j<=dr-sr;j++){
      printMazePathWithJump(sr+j, sc, dr, dc, psf+"v"+j);
     }
     for(int j=1;j<=dr-sr && j<=dc-sc;j++)
     {
       printMazePathWithJump(sr+j, sc+j, dr, dc, psf+"d"+j);
     }
    }
}
