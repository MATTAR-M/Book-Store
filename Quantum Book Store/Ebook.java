public class Ebook extends Book {
    private String filetype;
    public Ebook(String ISBN ,String title ,int year ,double price,String filetype){
        super(ISBN, title, year, price);
        this.filetype=filetype;

    }
    @Override
    public boolean isAvailable(int quantity){
        return true;
    }
    @Override
    public double buy(int quantity,String email,String address){
        MailService.send(this.title+"."+filetype, email);
                return price*quantity;
    }
    @Override
    public boolean isSellable(){
        return true;
    }
}
