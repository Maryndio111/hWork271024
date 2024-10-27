public class Product {

    private String name;
    private int quantity;
    private double price;
    private double rating;

    public Product(String name, int quantity, double price, double rating) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.rating = rating;

    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public Product(String name, double v, double price, int rating) {
    }

    @java.lang.Override
    public java.lang.String toString() {
        return String.format("Product: %s, Price: %2f, Rating: %2f, Quantity: %d", name, price, rating, quantity);

    }
}

