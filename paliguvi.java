import java.util.*;
class paliguvi
{
    public static void main(String args[])
    {
        String a="";
        for(int i=0;i<args.length;i++)
        {
            a+=args[0];
        }
        StringBuffer s=new StringBuffer(a);
        String ss=String.valueOf(s.reverse());
        System.out.println((a.equalsIgnoreCase(ss))?"Palindrome":"not a palindrome");
    }
}
