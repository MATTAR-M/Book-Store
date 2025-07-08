public abstract class Book {
    protected String ISBN;
    protected String title;
    protected int year;
    protected double price;
    public Book(String ISBN ,String title ,int year ,double price){
        this.ISBN=ISBN;
        this.title=title;
        this.year=year;
        this.price=price;
    }
    public String getISBN(){
        return ISBN;
    }
    public int getyear(){
        return year;
    }
    public double getprice(){
        return price;
    }
    public abstract boolean isAvailable(int quantity);
    public abstract double buy(int quantity,String email,String address);
    public abstract boolean isSellable();
}
