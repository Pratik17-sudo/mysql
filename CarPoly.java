//Polymorphism Course Challenge Code

public class CarPoly {
    private String desc;

    public CarPoly(String desc) {
        this.desc = desc;
    }


    public void startEngine()
    {
        System.out.println("Car Engine Starts>>>>>>>");
    }

    public void drive()
    {
        System.out.println("Car Driving>>>>>>>>"+getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine()
    {
        System.out.println("Engine running>>>>>>>");
    }

}

class GasPoweredCar extends CarPoly
{
    private double avgkmliter;
    private  int cylinders=6;

    public GasPoweredCar(String desc) {
        super(desc);
    }

    public GasPoweredCar(String desc, double avgkmliter, int cylinders) {
        super(desc);
        this.avgkmliter = avgkmliter;
        this.cylinders = cylinders;

        System.out.println("Description: " +desc);
        System.out.println("Average per liter: "  +avgkmliter);
        System.out.println("Cylinders: "+cylinders);

    }

    @Override
    public void startEngine() {
        System.out.println("Gas>>> All cylinders are fire up: "+cylinders);

    }

    @Override
    protected void runEngine() {
        System.out.println("Gas>>>> usage exceeds the average: "+avgkmliter);
    }

}



class ElectricCar extends CarPoly
{
    private double avgpercharge;
    private  int batteries=6;

    public ElectricCar(String desc) {
        super(desc);
    }

    public ElectricCar(String desc, double avgpercharge, int batteries) {
        super(desc);
        this.avgpercharge = avgpercharge;
        this.batteries = batteries;

        System.out.println("Description: " +desc);
        System.out.println("Average per charge: "  +avgpercharge);
        System.out.println("Total Batteries: "+batteries);

    }

    @Override
    public void startEngine() {
        System.out.println("Electric>>> All the batteries are charged and ready: "+batteries);

    }

    @Override
    protected void runEngine() {
        System.out.println("Electric>>>> usage exceeds the average: "+avgpercharge);
    }

    public static void runrace(CarPoly car)
    {
        car.startEngine();
        car.drive();
    }

    public static void main(String[] args) {
        ElectricCar ec=new ElectricCar("Sample Car", 45.6,10);
        runrace(ec);
    }
}



