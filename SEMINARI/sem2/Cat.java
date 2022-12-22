package SEMINARI.sem2;

public class Cat extends Animal implements Speakeble, Runable{

    public Cat(String nickname, String owner, int legs) {
        super(nickname, owner, legs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return "Mew";
    }

    @Override
    public Integer runSpeed() {
        // TODO Auto-generated method stub
        return 30;
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }

    
}
