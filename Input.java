import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name= sc.nextLine();
        System.out.println("The name is: "+name);

        System.out.println("Enter the age:");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("The age is: "+age);

        System.out.println("Enter the email:");
        String email = sc.nextLine();
        System.out.println("Email: "+email);

    }
}
