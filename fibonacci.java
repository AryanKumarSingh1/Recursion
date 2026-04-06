import java.util.Scanner;

public class fibonacci {
    public static int function(int n)
    {
        if(n<=1)return n;
        return function(n-1)+function(n-2);
    }
     public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(function(n));
    }
}
