import java.util.Scanner;

public class sumofnumber {
    public static int sum(int n)
    {
        if(n==1)return 1;
        return n+(sum(n-1));
    }
     public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sum(n));


    }
    
}
