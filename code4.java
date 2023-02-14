import java.util.*;
public class code4 
{//Maze_path( Count, Print)
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int f=board(r,c,"",1,1);
        System.out.println();
        System.out.print(f);
    }
    public static int board(int r,int c,String ans,int cr,int cc)
    {
        if(r==cr && c==cc)
        {
            System.out.print(ans+" ");
            return 1;
        }
        if(cr>r ||cc>c)
        {
            return 0;
        }
        int a=board(r,c,ans+"V",cr+1,cc);
        int b=board(r,c,ans+"H",cr,cc+1);
        return a+b;
    }
}
