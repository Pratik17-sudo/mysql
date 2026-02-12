import java.util.Scanner;

public class Main {
    static void mymethod(int test) {
        if(test%2==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }


    static void evenodd(int num){
        if(num<0)
        {
            System.out.println("The number "+num+" Negative");
        }
        else if (num>0) {

            System.out.println("The number "+num+" Postive");
        }
        else
        {
            System.out.println("Equal to Zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        mymethod(num);
        evenodd(num);
    }
}
