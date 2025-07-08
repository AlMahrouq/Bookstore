public class Book {
    private String ISBN;
    private String title;
    private int year;
    private double price;
    private String type;
    private String filetype;
    private boolean have_stock;
    private boolean is_shipped;
    private boolean sent_via_email;
    private boolean for_sale;


    public Book(String ISBN, String title, int year, double price, String type){
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.price = price;
        this.type = type;
        this.filetype = "";
        this.have_stock = false;
        this.is_shipped = false;
        this.sent_via_email = false;
        this.for_sale = false;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setHave_stock(boolean have_stock) {
        this.have_stock = have_stock;
    }

    public boolean getHave_stock() {
        return this.have_stock;
    }

    public void setIs_shipped(boolean is_shipped) {
        this.is_shipped = is_shipped;
    }

    public boolean getIs_shipped() {
        return this.is_shipped;
    }

    public void setSent_via_email(boolean sent_via_email) {
        this.sent_via_email = sent_via_email;
    }

    public boolean getSent_via_email() {
        return this.sent_via_email;
    }

    public void setFor_sale(boolean for_sale) {
        this.for_sale = for_sale;
    }

    public boolean getFor_sale() {
        return this.for_sale;
    }
}
