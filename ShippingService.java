import java.util.ArrayList;

public class ShippingService {
    ArrayList<Book> products = new ArrayList<>();

    public ShippingService(ArrayList<Book> arr){
        this.products = arr;
    }
}
