package SEMINARI.sem2;

public class Swim extends Animal implements Speakeble{

    public Swim(String nickname, String owner, int legs, float speed) {
        super(nickname, owner, legs);
        this.setSpeed(speed);

    }
    private void setSpeed(float speed2) {
    }
    //private void setSwim(float speed2) {
    //}
    private Float speed;

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return "BulBul";
    }

    public float getSpeed() {
        return speed;
    }

    // public String toString(){
    //     return String.format("%s - %s - %i - %f", super.toString(), speed);
    // }

    
}
