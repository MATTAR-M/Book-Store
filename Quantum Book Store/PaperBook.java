public class PaperBook extends Book {
    private int stock;

    public PaperBook(String ISBN, String title, int year, double price, int stock) {
        super(ISBN, title, year, price);
        this.stock = stock;
    }

    @Override
    public boolean isAvailable(int quantity) {
        return stock >= quantity;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (!isAvailable(quantity)) {
            throw new RuntimeException("Not enough stock for PaperBook: " + ISBN);
        }
        stock -= quantity;
        ShippingService.send(this.title, address);
        return price * quantity;
    }

    @Override
    public boolean isSellable() {
        return true;
    }
}
