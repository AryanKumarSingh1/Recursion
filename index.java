import java.util.Scanner;
public class index {
    public static void function(int arr[],int n)
    {
        if(n==arr.length)return;
        System.out.println(arr[n]);
        function(arr,n+1);
    }
    public static void main(String[] args)
    {
        System.out.println("enter size of array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
           arr[i]= input.nextInt();
        }
        function(arr,0);
    }
}