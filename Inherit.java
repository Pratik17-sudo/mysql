import java.io.StringReader;
import java.util.Scanner;

class  Worker{
    String name;
    String birhtdate;
    int birthyear;
    String enddate;


    public void assign(String name, String birhtdate, int birthyear, String enddate)
    {
        this.name=name;
        this.birhtdate=birhtdate;
        this.birthyear=birthyear;
        this.enddate=enddate;

        System.out.println("Name: "+name);
        System.out.println("Birth Date: "+birhtdate);
        System.out.println("Birth Year: "+birthyear);
        System.out.println("End date: "+enddate);

    }

    public int getAge(int birthyear)
    {
       int age = 2026-birthyear;
       return  age;
    }

    public  double collectPay(double annualSalary)
    {
        double finalsalary=annualSalary-4500;

        return  finalsalary;
    }

    public void terminate(int choice)
    {
        if(choice==1)
        {
            System.out.println("Contract Terminated");
        }
        else
        {
            System.out.println("Continuing>>>>>>>");
        }
    }


}

class Employee extends Worker
{

    long employee_id;
    String hireDate;
    void assignE(long employee_id, String hireDate){
        this.employee_id=employee_id;
        this.hireDate=hireDate;

        System.out.println("Employee Id: "+employee_id);
        System.out.println("Hire Date: "+hireDate);
    }

}

class SalariedEmployee extends Employee{
    double annualSalary;
    boolean isRetired;
    public void assignS(double annualSalary) {
        this.annualSalary=annualSalary;
        System.out.println("Annual Salary: "+annualSalary);
    }

    void retire(boolean isRetired)
    {
        if(isRetired)
        {
            System.out.println("The Employee is retired");
        }
        else {
            System.out.println("The Employee is not retired");
        }
    }
}

class hourlyEmployee extends  Employee
{
    double hourlypayrate=50;


    void getDoublePay(int noofhours)
    {
        double finalrate = hourlypayrate*noofhours;
        System.out.println("Total Earning: "+finalrate);
    }
}

public class Inherit {

    public static void main(String[] args) {
        SalariedEmployee s=new SalariedEmployee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name=sc.nextLine();
        System.out.println("Enter the birth date: ");
        String birthdate=sc.nextLine();
        System.out.println("Enter the birth year: ");
        int  birthyear=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the end date: ");
        String enddate=sc.nextLine();


        System.out.println("Enter the Employee id: ");
        long empoyee_id=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the hire date: " );
        String hiredate=sc.nextLine();
        s.assignE(empoyee_id,hiredate);


        s.assign(name,birthdate,birthyear,enddate);

        System.out.println("The age is: " +s.getAge(birthyear));


        System.out.println("Enter the Salary: ");
        double salary= sc.nextDouble();
        s.assignS(salary);
        System.out.println("The final annual Salary after deduction: "+s.collectPay(salary));
        sc.nextLine();
        System.out.println("if retired enter true or else enter false: ");
        boolean isRetired=sc.nextBoolean();
        s.retire(isRetired);

        System.out.println("Do you want to terminate the contract Enter 1 >>>> To terminate else enter 0 >>>>>");
        int choice =sc.nextInt();
        s.terminate(choice);


        hourlyEmployee h=new hourlyEmployee();

        System.out.println("Enter the Name: ");
        String name1=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the birth date: ");
        String birthdate1=sc.nextLine();
        System.out.println("Enter the birth year: ");
        int  birthyear1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the end date: ");
        String enddate1=sc.nextLine();

        System.out.println("Enter the Employee id: ");
        long empoyee_id1=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the hire date: " );
        String hiredate1=sc.nextLine();

        h.assignE(empoyee_id1,hiredate1);
        h.assign(name,birthdate,birthyear,enddate);

        System.out.println("Enter the no of hours the employee worked: ");
        int hours=sc.nextInt();
        h.getDoublePay(hours);

        sc.close();
    }
}
