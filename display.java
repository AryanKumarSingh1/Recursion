import java.util.ArrayList;

public class display {
    public static void main(String[] args) {
        /*String [] arr = {"abc","def","ghi"};
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }*/
       ArrayList<String>al = new ArrayList<>();
       al.add("mobile");
       al.add("laptop");
       //System.out.println(al);
       result(al);
       System.out.println(al);
    }
    public static void result(ArrayList<String> al)
    {
        al.add("desktop");
    }
}
