package SEMINARI.sem2;

public class Dog extends Animal implements Speakeble{

    public Dog(String nickname, String owner, int legs) {
        super(nickname, owner, legs);
    }

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return "Waw";
    }
    
}
