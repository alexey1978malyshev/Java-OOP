package Seminars.Sem2;

public class Duck extends Animal implements Illable,Soundable,Flyable, Swimable{

    private int swimSpeed;
    private  int flySpeed;
    public Duck(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getName() + " is flying");
    }

    @Override
    public void sound() {
        System.out.println("Kryakrya...");

    }

    @Override
    public void toSwim(int swimSpeed) {
        System.out.println(getName() + " плывет");
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }
}
