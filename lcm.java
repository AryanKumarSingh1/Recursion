import java.util.Scanner;
public class lcm {
     public static int factor1(int a,int b)
    {
        if(a==0)return b;
        return factor1(b%a,a);
    }
    public static int factor(int a,int b)
        {
            return (a*b)/factor1(b%a,a);
        }
     public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(factor1(a,b));
    }
}
