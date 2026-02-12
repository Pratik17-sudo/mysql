public abstract class ProductForSale{

    protected String type;
    protected double price;
    protected String desc;

    public ProductForSale(String type, double price, String desc) {
        this.type = type;
        this.price = price;
        this.desc = desc;
    }

    public double getSalesPrice(int qty)
    {
        return qty*price;
    }
    public void printPricedItem(int qty)
    {
        System.out.println("The total Price is: "+price);
    }

    public abstract void showDetails();
}
