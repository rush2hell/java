import java.util.*;
class Booth
{
    public static void main(String args[])
    {
        int m,q,a=0,q1=0,mb,qb;
        //Binary Conversion
        Scanner sc=new Scanner(System.in);
        System.out.println();
        m=sc.nextLine();
        q=sc.nextLine();
        mb=Integer.toBinaryString(m);
        qb=Integer.toBinaryString(q);
        System.out.println("Binary for M is : " +mb);
        System.out.println("Binary for M is : " +qb);
    }
}