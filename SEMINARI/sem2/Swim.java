package SEMINARI.sem2;

public class Swim extends Animal implements Speakeble, SwimSpeed{

    public Swim(String nickname, String owner, int legs) {
        super(nickname, owner, legs);
    }

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return "bolBol";
    }

    @Override
    public Integer swimSpeed() {
        // TODO Auto-generated method stub
        return 18;
    }
    @Override
    
    public String toString() {
        // TODO Auto-generated method stub
        return "Kit" + super.toString();
    }

    

   

   
}
