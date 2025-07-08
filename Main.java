import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        inventory inv = new inventory();
        Book book1 = new Book("123", "hallo_java", 2016, 100.5, "Paper book");
        Book book2 = new Book("124", "hallo_cpp", 2017, 200.5, "EBook");
        Book book3 = new Book("125", "hallo_c", 2018, 300.5, "Showcase");
        book1.setHave_stock(true);
        book1.setIs_shipped(true);
        book2.setFiletype(".pdf");
        book2.setSent_via_email(true);
        book3.setFor_sale(false);
        
        inv.add(book1);
        inv.add(book2);
        inv.add(book3);
        inv.add(book3);

        ArrayList<Book> arr = inv.remove(2017);
        for(int i = 0; i < arr.size(); ++i){
            System.out.print(arr.get(i).getYear() + " ");
        }
        System.out.println();
        System.out.println();


        double paid1 = inv.buy("124",2, "ahmed.com");
        if(paid1 == 0)
            System.out.println("The book not found");
        else
            System.out.println("The price is: " + paid1);



        double paid2 = inv.buy("125",2, "ahmed.com");
        if(paid2 == 0)
            System.out.println("The book not found");
        else
            System.out.println("The price is: " + paid2);
    }
}