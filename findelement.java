import java.util.Scanner;
public class findelement {
    /*public static void findvalue(int arr[],int n)
    {
        if(n==arr.length)return;
        System.out.println(arr[n]);
    }*/
    public static boolean existvalue(int[] arr,int target,int n)
    {
        if(n==arr.length) return false;
        if(arr[n]==target) return true;
        return existvalue(arr,target,n+1);
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
        System.out.println("enter the element to find in array");
        int target = input.nextInt();
        System.out.println("element found "+existvalue(arr,target,0));
    }
}
