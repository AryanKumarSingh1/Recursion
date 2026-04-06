import java.util.Scanner;

public class power {
    public static int pow(int a,int b)
    {
        if(b==0)return 1;
        //return a*pow(a,b-1);
        int res = pow(a,b/2);
        if(b%2==0)
            return res*res;
        else
            return a*res*res;
    }
     public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(pow(a,b));


    }
}
