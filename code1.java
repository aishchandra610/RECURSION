import java.util.*;
class code1
{//tower of hanoi
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        toh(n,'A','C','B');
    }
    public static void toh(int n,char src,char hlp,char des)
    {
        if(n==0)
        {
            return;
        }
        toh(n-1,src,des,hlp);
        System.out.println("Moving ring "+n+" from "+src+" to "+des);
        toh(n-1,hlp,src,des);
    }
}