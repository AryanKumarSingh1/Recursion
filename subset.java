import java.util.ArrayList;
import java.util.Scanner;
public class subset
{
    public static void result(String res,String n,int index)
    {
        if(index == n.length())
        {
            System.out.println(res);
            return;
         }
         char ch = n.charAt(index);
         result(res+ch,n,index+1);
         result(res,n,index+1);
    }
    public static void main(String[] args)
    {
        System.out.println("enter a string");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        result("",str,0);
    }
   /*public static void result(String res,String n,int index,ArrayList<String> arr)
    {
        if(index == n.length())
        {
            if(res.length()!=0)
            arr.add(res);
            return;
         }
         char ch = n.charAt(index);
         result(res+ch,n,index+1,arr);
         result(res,n,index+1,arr);
    }
    public static void main(String[] args)
    {
        System.out.println("enter a string");
        Scanner input = new Scanner(System.in);
         String str = input.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        result("",str,0,arr);
        System.out.println(arr);
    }*/
    
}
