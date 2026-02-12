public class ArtObject extends ProductForSale{

    public ArtObject(String type, double price, String desc) {
        super(type, price, desc);
    }

    @Override
    public void showDetails() {
        System.out.println("Type: "+type);
        System.out.println("Price: "+price);
        System.out.println("Description: "+desc);
    }
}
