public class Demo extends Book{
    public Demo(String ISBN ,String title ,int year){
        super(ISBN, title, year, 0.0);
    }
    @Override
    public boolean isAvailable(int quantity){
        return false;
    }
    @Override
    public double buy(int quantity,String email,String address){
        throw new RuntimeException("Demo books are not for sale");
    }
    @Override
    public boolean isSellable(){
        return false;
    }
}