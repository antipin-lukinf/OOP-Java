package SEMINARI.sem2;

public class Cat extends Animal implements Speakeble{

    public Cat(String nickname, String owner, int legs) {
        super(nickname, owner, legs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return "Mew";
    }

    
}
