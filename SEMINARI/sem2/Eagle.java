package SEMINARI.sem2;

public class Eagle extends Animal implements Speakeble, Runable, Flyable{

    public Eagle(String nickname, String owner, int legs) {
        super(nickname, owner, legs);
    }

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return "bu";
    }

    @Override
    public Integer runSpeed() {
        // TODO Auto-generated method stub
        return 3;
    }

    @Override
    public int flySpeed() {
        // TODO Auto-generated method stub
        return 51;
    }

    @Override
    public String toString() {
        return "Eagle" + super.toString();
    }

    
}
