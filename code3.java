import java.util.*;
public class code3
 {
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ans=path(0,n,m,"");
        System.out.println();
        System.out.println(ans);
    }
    public static int path(int h,int k,int m,String a) {
		if(h==k) {
			System.out.print(a+" ");
			return 1;
		}
		if(h>k) {
			return 0;
		}
        int c=0;
        for(int i=1;i<=m;i++)
        {
		    c+=path(h+i,k,m,a+i);
        }
        return c;
	}
}