import java.util.Scanner;

public class Calculator {

    public int add(int num1,int num2)
    {
        return num1+num2;
    }

    public int subtract(int num1,int num2)
    {
        return num1-num2;
    }

    public int multi(int num1,int num2)
    {
        return num1*num2;
    }

    public float div(int num1,int num2)
    {
        return (float) num1 /num2;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number (for divison enter dividend):");
        int num1=sc.nextInt();
        System.out.println("Enter the second number (for divison enter divisor):");
        int num2=sc.nextInt();
        System.out.println("Enter the choice");
        int choice=sc.nextInt();

        Calculator c=new Calculator();

        switch (choice){
            case 1:
                System.out.println("Sum: "+c.add(num1,num2));
                break;
            case 2:
                System.out.println("Difference: "+c.subtract(num1,num2));
                break;
            case 3:
                System.out.println("Product: "+c.multi(num1,num2));
                break;
            case 4:
                if(num2==0)
                {
                    System.out.println("cannot divide by zero");
                    break;
                }
                System.out.println("Quotient: "+c.div(num1,num2));
                break;
            default:
                System.out.println("Enter valid numbers");
        }

    }
}
