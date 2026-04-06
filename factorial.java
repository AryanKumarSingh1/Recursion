import java.util.Scanner;
public class factorial
{
    public static int factor(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        return n*factor(n-1);
    }
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(factor(n));

    }
}
