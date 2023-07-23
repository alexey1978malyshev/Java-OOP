package Seminars.Sem2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VetClinic clinic = new VetClinic();
        clinic.addNewAnimal(new Cat("BARSIK", "Petya")).addNewAnimal(new Dog("Bim", "Aelex"))
                .addNewAnimal(new Duck("Krepysh", "Ivan")).addNewAnimal(new Dog("Jack", "Petya"))
                .addNewAnimal(new Fish("Golden","Marusya")).addNewAnimal(new Duck("Belyi","Fedya"));

//        for (Animal a:clinic.getAnimals()) {
//            a.ill();
//        }

        System.out.println(clinic.getFlyingAnimals());
        System.out.println(clinic.getRunningAnimals());
        System.out.println(clinic.getSwimingAnimals());
        System.out.println(clinic.getTalkingAnimals());

        Cat cat2 = new Cat("Murka", "Pyotr");
        cat2.setRunSpeed(12);
        System.out.println(cat2.getRunSpeed() + "km/h");



    }
}
