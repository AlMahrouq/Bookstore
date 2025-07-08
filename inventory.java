import java.util.ArrayList;
import java.util.Iterator;

public class inventory {
    ArrayList<Book> arr = new ArrayList<>();

    public void add(Book book){
        arr.add(book);
    }

    public ArrayList<Book> remove (int since_year){
        ArrayList<Book> rmv = new ArrayList<>();
        Iterator<Book> it = arr.iterator();
        while(it.hasNext()){
            Book book = it.next();
            if(book.getYear() <= since_year){
                rmv.add(book);
                it.remove();
            }
        }
        return rmv;
    }

    public double buy(String ISBN, int quantity, String email){
        double paid = 0;
        ArrayList<Book> to_ShippingService = new ArrayList<>();
        ArrayList<Book> to_MailService = new ArrayList<>();

        Iterator<Book> it = arr.iterator();
        while(it.hasNext()){
            Book book = it.next();
            if(book.getISBN() == ISBN && quantity > 0){
                quantity -= 1;
                paid += book.getPrice();
                if(book.getIs_shipped()) {
                    to_ShippingService.add(book);
                }
                if(book.getSent_via_email()){
                    to_MailService.add(book);
                }
                it.remove();
            }
        }
        return paid;
    }
}
