public class Demo {
    int total;
    public void sample(double num1, double num2)
    {
        double total=num1+num2;
        System.out.println(total);
    }

    public static void main(String[] args) {
     Demo d1=new Demo();
     d1.sample(6.7,6.7);
    }
}
