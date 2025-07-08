import java.util.*;
public class Inventory {
    private Map<String ,Book>books = new HashMap<>();
    public void addBook(Book book){
        books.put(book.getISBN(),book);
    }
    public void removeoutdatedbook(int currentyear,int maxage){
        books.values().removeIf(book-> currentyear - book.getyear() > maxage);
    }

    public double buybook(String ISBN,int quantity,String email,String address){
        Book book = books.get(ISBN);
        if(book==null) throw new RuntimeException("this book does not exists");
        if(!book.isSellable()) throw new RuntimeException("this book is not for sale");
        return book.buy(quantity, email, address);
    }
}
