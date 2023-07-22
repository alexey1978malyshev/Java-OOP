package Seminars.Sem1;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        Animal barsic = new Animal("Барсик", "Алексей", "простуда", false);

//        System.out.println(barsic.isVactinated());
        barsic.setIsVactinated(true);
//        System.out.println(barsic.isVactinated());
//        System.out.println(barsic.getType());
        Cat cat = new Cat();

//        System.out.println(cat);
//
//        Animal musya = new Cat(); //пример полиморфизма на уровне класса
        Dog dog = new Dog();
        dog.nameAnimal = "ДжекКривойХвост";
        Eagle eagle = new Eagle();
        eagle.nameAnimal = "КривойКлюв";
        Fish salmon = new Fish();
        salmon.nameAnimal = "БольшойПлавник";
//        List<Animal> lstAnimals = new ArrayList<>();
//        lstAnimals.add(cat);
//        lstAnimals.add(barsic);
//        lstAnimals.add(dog);

//        System.out.println(lstAnimals);
//        System.out.println(musya.getType("с арг "));
//        cat.toGo();
//        dog.goForWalk();
//        eagle.toFly();
//        salmon.swimToHome();

        Doctor terapevt = new Doctor("Иван Иванович", "терапевт");
        System.out.println(terapevt.toString());
        Nurse nurse = new Nurse("Лариса Ивановна", "лаборант");
        System.out.println(nurse.toString());





    }
}
