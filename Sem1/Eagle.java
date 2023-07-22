package Seminars.Sem1;

public class Eagle extends Animal{
    private int wingspan;

    protected void move(String name){
        System.out.println(nameAnimal + " полетел в степь за сусликами..");
    }
    public void toFly(){
        move(nameAnimal);
    }
}
