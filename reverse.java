import java.util.Scanner;

public class reverse {
    public static int function(int a,int b)
    {
        if(a==0)return b;
        return function(a/10,b*10+a%10);
    }
     public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(function(a,b));


    }
}
