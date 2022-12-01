import java.util.Scanner;
import java .util.ArrayList;
public class getSubsequence 
{
    public static ArrayList<String> gss(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> recAns = gss(ros);
        ArrayList<String> myAns = new ArrayList<>();
        for(String ele : recAns)
        {
            myAns.add(ele);
        }
        for(String ele : recAns)
        {
            myAns.add(ch+ele);
        }
        return myAns;
    }
    public static void main(String []args)
    {
        Scanner scn =new Scanner (System.in);
        String s= scn.next();
        ArrayList<String> ans = gss(s);
        System.out.println(ans);
    }
    

}
