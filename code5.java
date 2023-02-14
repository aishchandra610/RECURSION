import java.util.*;
public class code5 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(twin(s));
    }
    public static int twin(String s){
        if(s.length()<=2){
            return 0;
        }
        int t=twin(s.substring(1));
        if(s.charAt(0)== s.charAt(2)){
           return t+1;
        }
        return t;
    }
}