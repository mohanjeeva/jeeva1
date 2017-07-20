import java.util.*;
class shufle
{
    public static void main(String args[])
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<args.length;i++)
        {
            al.add(Integer.parseInt(args[i]));
        }
        Collections.shuffle(al);
        System.out.println(al);
    }
}
