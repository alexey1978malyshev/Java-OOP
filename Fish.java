package Seminars;

public class Fish extends Animal{
    private int length;
    protected void swim(String animalName){
        System.out.println(animalName + " поплыл домой метать икру..");
    }

    public void swimToHome(){
        swim(nameAnimal);
    }

}
