public class Ice extends Product{ //наследник класса Product
    
    public Ice(String name, double price, String taste) {
        super(name, price);
        this.setTaste(taste);               
    }
    private String taste;

    public String getTaste() {
        return taste;
    }
    private void setTaste(String taste) {
        this.taste = taste;
    }

    public String toString() {
        return String.format("%s - %s", super.toString(), taste);
    }  
    
}
