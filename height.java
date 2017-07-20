import java.util.*;
class height
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int n[]=new int[args.length];
        for(int i=0;i<args.length;i++)
        {
            n[i]=Integer.parseInt(args[i]);
        }
        Arrays.sort(n);
        System.out.println("4th tallest student is "+n[n.length-4]);
        System.out.println("Kth tallest student is "+n[n.length-k]);
    }
}
