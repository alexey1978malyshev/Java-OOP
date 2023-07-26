package Seminars.Sem3;

import java.util.*;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Comparator<Pharmacy> {

   private final List<Component> components;
   private final int index;

    public List<Component> getComponents() {
        return components;
    }
    public Pharmacy() {
        this.components = new ArrayList<>();
        this.index = 0;
    }
    public Pharmacy addComponent(Component component) {
        components.add(component);
        return this;
    }

    private int getPharmacyPower(){
        int power = 0;
        for (Component c :
                components) {
            power += c.getPower();
        }
        return power;
        
    }
    @Override
    public String toString() {
        return String.format("%s  Состав : %s, сила: %s\n",getClass().getSimpleName(), this.components, this.getPharmacyPower());

    }
    @Override
    public Iterator<Component> iterator() {
        return new ComponentIterator(this);
    }
    @Override
    public int compareTo(Pharmacy o ) {

        if (o.getPharmacyPower() > this.getPharmacyPower()) return -1;
        else if (o.getPharmacyPower() < this.getPharmacyPower()) return 1;
        else return 0;
    }

    @Override
    public int compare(Pharmacy o1, Pharmacy o2) {
        if (o1.getPharmacyPower() > o2.getPharmacyPower()) return -1;
        else if (o1.getPharmacyPower() < o2.getPharmacyPower()) return 1;
        else return 0;
    }


    //  @Override
//    public Iterator<Component> iterator() {
//        return new Iterator(){
//
//            @Override
//            public boolean hasNext() {
//                if (index < components.size()) return true;
//                return false;
//                // return index < components.size();
//            }
//
//            @Override
//            public Component next() {
//                return components.get(index++);
////        Component component = components.get(index);
////        index++;
////        return component;
//            }
//
//        };
//
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        if (((Pharmacy) o).getPharmacyPower() == this.getPharmacyPower()) { //если сила лекарств равна
            StringBuilder sbComponents1 = new StringBuilder();//задаем два уникальных "имени" склеиванием  стринговых названий
            StringBuilder sbComponents2 = new StringBuilder();
            for (Component c :
                    this.getComponents()) {
                sbComponents1.append(c.getName());
            }
            for (Component c :
                    ((Pharmacy) o).getComponents()) {
                sbComponents2.append(c.getName());
            }
            return (sbComponents1.toString().equals(sbComponents2.toString())); //сравниваем два стрингбилдера
        }
        return getPharmacyPower()== pharmacy.getPharmacyPower();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPharmacyPower());
    }
}
