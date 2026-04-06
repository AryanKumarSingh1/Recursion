import java.util.Scanner;
public class uniqepath {
    public static int function(int a,int b)
        {
            if(a==1||b==1)return 1;
            return function(a-1,b)+function(a,b-1);
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
