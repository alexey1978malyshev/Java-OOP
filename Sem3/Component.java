package Seminars.Sem3;

import java.util.Objects;

public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("%s { Название : %s, вес: %s, сила: %s}",getClass().getSimpleName(), this.name,this.weight,this.power);

    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Component component = (Component) o;
//        return getPower() == component.getPower() && name.equals(component.name) && weight.equals(component.weight);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, weight, getPower());
//    }
}

