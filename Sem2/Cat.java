package Seminars.Sem2;

public class Cat extends Animal implements Soundable,Illable, Runnable {

    private int runSpeed;
    public Cat(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void sound() {
        System.out.println("Meow..!");

    }

    @Override
    public void toRun(int speed) {

    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }
}
