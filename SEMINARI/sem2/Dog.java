package SEMINARI.sem2;

public class Dog extends Animal implements Speakeble, Runable{

    public Dog(String nickname, String owner, int legs) {
        super(nickname, owner, legs);
    }

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return "Waw";
    }

    @Override
    public Integer runSpeed() {
        // TODO Auto-generated method stub
        return 29;
    }
    @Override
    public String toString() {
        return "Dog" + super.toString();
    }
    
}
