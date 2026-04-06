import java.util.Scanner;
public class second
{
    //static int n;
    public static void digit(int n,int m)
    {
        if(n>m)
        {
            return;
        }
        System.out.println(n);
        digit(n+1,m);
    }
     /*public static void digit(int res)
    {
        if(res > n)
        {
            return;
        }

        System.out.println(res);
        digit(res + 1);
    }*/
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        digit(n,m);
         /*n = input.nextInt();
        digit(1);*/
    }
}