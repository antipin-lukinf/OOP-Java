package SEMINARI.sem2;

public class Duck extends Animal implements Speakeble, Runable, Flyable{

    public Duck(String nickname, String owner, int legs) {
        super(nickname, owner, legs);
    }

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return "Kry";
    }

    @Override
    public Integer runSpeed() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public int flySpeed() {
        // TODO Auto-generated method stub
        return 45;
    }
    @Override
    public String toString() {
        return "Duck" + super.toString();
    }

    
}
