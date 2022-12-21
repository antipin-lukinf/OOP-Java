package SEMINARI.sem2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    
    public Zoo addAminal(Animal animal){
        animals.add(animal);
        return this;
    }

    @Override
    public String toString() {
        return "Zoo [animals=" + animals + "]";
    }
    public String talk(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Speakeble item:getSpeakable()) {
            stringBuilder.append(item.speak() + "\n");            
        }
        return stringBuilder.toString();
        
    }
    private List<Speakeble> getSpeakable (){
        List<Speakeble> result = new ArrayList<>();
        for(Animal item:animals){
            if(item instanceof Speakeble);{
                result.add((Speakeble) item);
            }
        }
        result.add(new Radio());
        return result;
    }

    public Zoo addAnimal(Swim swim) {
        animals.add(swim);
        return this;
    }
    
}
