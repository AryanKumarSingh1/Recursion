import java.util.ArrayList;
import java.util.Scanner;

public class generate
{
    public static void result(int res,int l,int r,String n ,ArrayList<String> arr)
    {
        if(r==res)
        {
            arr.add(n);
            return;
         }
         if(l<res) result(res, l+1, r,n+"(", arr);
         if(r<l) result(res, l,r+1,n+")", arr);
         }
    public static void main(String[] args)
    {
        System.out.println("enter a string");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        result(n,0,0,"",arr);
        System.out.println(arr);
    }
}
