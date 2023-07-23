package Seminars.Sem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;

    public VetClinic() {
        this.animals = new ArrayList<>();
    }

    public VetClinic addNewAnimal(Animal animal){
        animals.add(animal);
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Animal> getFlyingAnimals(){
        List<Animal> result = new ArrayList<>();
        for (Animal a :
                animals) {
            if (a instanceof Flyable)
                result.add(a);
        }
        return result;
    }

    public List<Animal> getSwimingAnimals(){
        List<Animal> result = new ArrayList<>();
        for (Animal a :
                animals) {
            if (a instanceof Swimable)
                result.add(a);
        }
        return result;
    }
    public List<Animal> getRunningAnimals(){
        List<Animal> result = new ArrayList<>();
        for (Animal a :
                animals) {
            if (a instanceof Runnable)
                result.add(a);
        }
        return result;
    }

    public List<Animal> getTalkingAnimals(){
        List<Animal> result = new ArrayList<>();
        for (Animal a :
                animals) {
            if (a instanceof Soundable)
                result.add(a);
        }
        return result;
    }




//    public List<Flyable> getFlyingAnimals(){
//        List<Flyable> result = new ArrayList<>();
//        for (Animal a :
//                animals) {
//            if (a instanceof Flyable)
//                result.add((Flyable) a);
//        }
//        return result;
//    }



}



