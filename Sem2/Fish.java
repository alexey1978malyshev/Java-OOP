package Seminars.Sem2;

public class Fish extends Animal implements Swimable {

    private int swimSpeed;
    public Fish(String name, String owner) {
        super(name, owner);
    }


    @Override
    public void toSwim(int swimSpeed) {
        System.out.println(getName() + " плывет");
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
}
