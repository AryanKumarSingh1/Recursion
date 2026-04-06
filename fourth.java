import java.util.Scanner;
public class fourth
{
    public static void digit(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        digit(n-1);
        System.out.println(n);
    }
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        digit(n);
    } 
}
