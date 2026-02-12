import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();


    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil Painting",1350,"Black Coating"));

        storeProducts.add(new ArtObject("Mat Painting",1650,"blue Coating"));

        lisProducts();

    }

    public static void lisProducts()
    {
        for(var item :storeProducts)
        {
            item.showDetails();
        }

    }
}
