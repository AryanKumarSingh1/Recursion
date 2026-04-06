import java.util.Scanner;
public class tower {
    public static void disk(int n,char a,char b,char c)
    {
        if(n==0)return;
        disk(n-1,a,c,b);
        System.out.println(a+"->"+c);
        disk(n-1,b,a,c);
    }
    public static void main(String[] args) {
        System.out.println("enter number ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        disk(n,'a','b','c');
    }
}
