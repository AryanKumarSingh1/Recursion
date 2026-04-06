import java.util.Scanner;

public class hcf {
     public static int factor(int a,int b)
    {
        if(a==0)return b;
        return factor(b%a,a);
    }
     public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(factor(a,b));
    }
}
