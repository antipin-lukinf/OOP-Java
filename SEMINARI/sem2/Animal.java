package SEMINARI.sem2;

public abstract class Animal {

    private String nickname;
    private String owner;
    private int legs;
    private float speed;
    
    public float getSpeed() {
        return speed;
    }
    public Animal(String nickname, String owner, int legs) {
        this.nickname = nickname;
        this.owner = owner;
        this.legs = legs;
    }
    public String getNickname() {
        return nickname;
    }
    
    public String getOwner() {
        return owner;
    }
    
    
    public int getLegs() {
        return legs;
    }

    @Override
    public String toString() {
        return "Animal [nickname=" + nickname + ", owner=" + owner + ", legs=" + legs + "]";
    }

    //public abstract String speak();
    
    
}
