import java.util.Scanner;

public class countway {
     public static int count(int n)
    {
        if(n<=2)return n;
        return count(n-1)+count(n-2);
    }
     public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(count(n));
    }
    
}
