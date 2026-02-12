import java.util.Scanner;



public class CalculateCalories {

    public int calculate(String name, int noofexercise, int weight)
    {
        Scanner sc = new Scanner(System.in);
        double walkingmet=3.3;
        double runningmet=9.8;
        double cyclingmet=7;
        int finalCalories=0;

        while (noofexercise>0)
        {
            System.out.println("Enter 1. Walking  >>>>> 2.Running >>>>> 3. Cycling ");
            int choice = sc.nextInt();
            System.out.println("Enter the duration of the exercise: ");
            int duration = sc.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.println();
                    double cal=walkingmet*weight*duration;
                    finalCalories= (int) (finalCalories+cal);
                }

                case 2:
                {
                    double cal=runningmet*weight*duration;
                    finalCalories=(int) (finalCalories+cal);

                }

                case 3:
                {
                    double cal=cyclingmet*weight*duration;
                    finalCalories=(int) (finalCalories+cal);
                }

            }
            noofexercise--;
        }
    return finalCalories;
    }

    public static void main(String[] args) {
        CalculateCalories cn=new CalculateCalories();
        System.out.println(cn.calculate("Pratik", 3,60));
    }
}
