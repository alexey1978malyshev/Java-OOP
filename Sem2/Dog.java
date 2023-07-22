package Seminars.Sem2;

public class Dog extends Animal implements Soundable, Runnable, Swimable {

    private int runSpeed;
    private  int swimSpeed;
    public Dog(String name, String owner) {
        super(name, owner);
    }


    @Override
    public void sound() {
        System.out.println("Gawgaw!!!");
    }

    @Override
    public void toRun(int speed) {
        System.out.println(getName() + " бежит");


    }
        @Override
    public void toSwim(int swimSpeed) {

    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
}
