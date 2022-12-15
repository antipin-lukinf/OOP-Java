import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class VendingMachine {
    private List<Product> prodList;
    // конструктор Default
    private static List<Product> DEFAULT = new ArrayList<>(Arrays.asList(new Product("rock", 1)));
        
    

    public VendingMachine(List<Product> prodList) {
        this.prodList = prodList;
    }

    public VendingMachine() {
        this(DEFAULT); // вызов конструктора DEFAULT
        
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        prodList.forEach(i-> result.append(i.toString()+"\n"));
        return result.toString();
        
    }
    public List<Product> findByName(String name){
        List<Product> result = new ArrayList<>();
        prodList.forEach(i->{
            if (i.getName().equals(name))
            result.add(i);
        });
        return result;           
    }
    public List<Product> findByPrice(double price){
        List<Product> result = new ArrayList<>();
        prodList.forEach(i->{
            if (i.getPrice() == price)
                result.add(i);
        });
        return result;
    }
    
    public List<Product> findByPriceRange(double p1, double p2){
        List<Product> result = new ArrayList<>();
        // prodList.forEach(i->{
        //     if (i.getPrice()<p2 && i.getPrice()>p1) то же самое, что в return
        //         result.add(i);
        // });
        return finder(p->p.getPrice()<p2 && p.getPrice()>p1);
    }
    
    private List finder(Function<Product, Boolean> f){
        List<Product> result = new ArrayList<>();
        prodList.forEach(i->{
            if (Boolean.TRUE.equals(f.apply(i)))
                result.add(i);
        });
        return result;
        
    }
}
