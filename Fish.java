package Seminars;

public class Fish extends Animal{
    private int length;
    protected void move(String animalName){
        System.out.println(animalName + " поплыл домой метать икру..");
    }


    public void swimToHome(){
        move(nameAnimal);
    }

}
