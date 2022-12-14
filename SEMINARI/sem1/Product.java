public class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double name) {
        this.price = price;

    }

    public String toString() {
        return String.format("%s %f", name, price);
               
    }
    
    
}
