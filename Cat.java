package Seminars;

public class Cat extends Animal{
    private int numberOfPaws;
    private String name;

    public Cat(){
        this("Васька",null,null,false,4);
    }
    public Cat(String nameAnimal, String ownerName, String diagnosis, Boolean isVactinated, int numberOfPaws) {
        super( nameAnimal,  ownerName,  diagnosis,  isVactinated);
        this.numberOfPaws = numberOfPaws;
    }
    private void wakeUp(){
         System.out.println("Кот проснулся");
     }
    private void findFood(){
         System.out.println("Кот нашел еду");
     }
    private void eat(){
         System.out.println("Кот поел");
     }
    private void sleep(){
        System.out.println("Кот уснул");
    }
    public void huntFood(){
//        wakeUp();
//        findFood();
//        eat();
//        sleep();
        toGo(nameAnimal);
    }


}
