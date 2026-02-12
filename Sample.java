import java.util.Arrays;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        int[] darray=new int[5];

        for(int i=0;i<darray.length;i++)
        {
            Scanner sc=new Scanner(System.in);
            darray[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(darray));
        for(int i=darray.length-1;i>=0;i--)
        {
            System.out.println(darray[i]);
        }
    }
}
