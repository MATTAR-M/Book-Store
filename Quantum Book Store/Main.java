public class Main {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        inventory.addBook(new PaperBook("ISBN001", "Java Basics", 2018, 150.0, 5));
        inventory.addBook(new Ebook("ISBN002", "Effective Java", 2020, 100.0, "pdf"));
        inventory.addBook(new Demo("ISBN003", "Rare Manuscript", 1943));
        try{
            double paid = inventory.buybook("ISBN001", 2, "example@example.com", "Cairo");
            System.out.println("Paid: "+paid);
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        try{
            double paid = inventory.buybook("ISBN002", 4,"example@exmaple.com", "Giza");
            System.out.println("Paid: "+paid);
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        try {
            inventory.buybook("ISBN003", 1, "example@example.com", "6 octuber");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        inventory.removeoutdatedbook(2025,8);
    }
}
