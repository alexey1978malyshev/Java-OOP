package Seminars;

public class Dog extends Animal{



    protected void move(String name){
        System.out.println(nameAnimal + " побежал на поиски друзей..");
    }

    public void goForWalk(){
        move(nameAnimal);
    }


}
