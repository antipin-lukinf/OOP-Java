import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachine {
    private List<Product> prodList;

    private static List<Product> DEFAULT = new ArrayList<>(Arrays.asList(new Product("rock", 1)));
        
    

    public VendingMachine(List<Product> prodList) {
        this.prodList = prodList;
    }

    public VendingMachine() {
        this(DEFAULT);
        
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        prodList.forEach(i-> result.append(i.toString()+"\n"));
        return result.toString();
        
    }
    
}
