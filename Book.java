public class Book extends Product {
    private String auther;
    public Book(){

    }

    public Book(String name, double price, String auther) {
        super(name, price);
        this.auther=auther;
    }

    //Discount = Original Price x Discount %/100
    @Override
    public double getDiscount() {
        double des=super.getPrice()*(10.0/100.0);
        return super.getPrice()-des;
    }
}
