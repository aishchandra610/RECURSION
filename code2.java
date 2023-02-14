import java.util.*;
public class code2 
{//GENERATE PARENTHESIS
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        paren(n,0,0,"");

    }
    public static void paren(int n,int start,int end,String ans)
    {
        if(start==n && end==n)
        {
            System.out.println(ans);
            return;
        }
        if(start>end)
        {
            paren(n,start,end+1,ans+")");
        }
        if(start<n)
        {
            paren(n,start+1,end,ans+"(");
        }
        
    }

}