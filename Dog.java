package Seminars;

public class Dog extends Animal{

    protected void toGo(String animalname){
        System.out.println(animalname + " побежал на поиски друзей..");
    }
    protected void swim(String animalName){
        System.out.println(" .. а потом поплыл через реку, там веселее..");
        System.out.println();
    }
    public void goForWalk(){
        toGo(nameAnimal);
        swim(nameAnimal);
    }


}
