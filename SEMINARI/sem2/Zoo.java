package SEMINARI.sem2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    
    public List<Animal> getAnimals() { //для сохранения в файл
        return animals;
    }

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

    // public Zoo addAnimal(Swim swim) {
    //     animals.add(swim);
    //     return this;
    // }
    public List<Runable> getRunables(){
        List<Runable> result = new ArrayList<>();
        for(Animal item:animals){
            if(item instanceof Runable);{
                result.add((Runable) item);
            }
        }
        return result;
    }

    public int getChampionSpeed(){
        int max = 0;
        for (Runable item:getRunables()) {
            if (item.runSpeed() > max){
                max = item.runSpeed();
            }            
        }
        return max;
    }
    public List<Flyable> getFlyables(){
        List<Flyable> flyables = new ArrayList<>();
        for(Animal item:animals){
            if(item instanceof Flyable);{
                if(item instanceof Flyable)
                    flyables.add((Flyable) item);
            }
        }
        return flyables;
    }
    public List<Swim> getSwimSpeed(){
        List<Swim> swims = new ArrayList<>();
        for(Animal item:swims){
            if(item instanceof SwimSpeed);{
                if(item instanceof SwimSpeed)
                    swims.add((Swim) item);
            }
        }
        return swims;
    }

   
}
