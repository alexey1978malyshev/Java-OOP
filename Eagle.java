package Seminars;

public class Eagle extends Animal{
    private int wingspan;
    protected void fly(String name){
        System.out.println(name + " полетел в степь за сусликами..");
    }
    public void toTheHunt(){
        fly(nameAnimal);
    }
}
