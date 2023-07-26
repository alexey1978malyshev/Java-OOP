package Seminars.Sem3;

/*Создайте класс Component (лекарственный компонент) с полями String name, String weight, int power,  класс Pharmacy с полями List<Component> components, int index.
в классе Pharmacy создайте метод addComponent(Component component) и имплементируйте ему интерфейс Iterator<Component>,  переопределив методы hasNext() и next().
Создайте класс DogPharmacy , унаследовав его от Pharmacy , еще раз обратите внимание на те удобства, которые дает программисту наследование.
Создайте несколько классов, наследников Component
В Main классе создайте экземпляр DogPharmacy , добавьте в лекарство для собачек несколько компонентов, и, при помощи итератора (обратите внимание на полиморфизм) выведите список компонентов на экран.
Можете ли вы предложить другой способ решения такой задачи? Что Вам кажется неудобным?
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponent(new Component("Penicilin", "0.3 mg", 17))
                .addComponent(new Component("Water", "1.2", 4));

//        while (pharmacy.hasNext()){
//            System.out.println(pharmacy.next());
//        }
//        for (Component c :
//                pharmacy1) {
//            System.out.println(c);
//        }

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponent(new Component("ALbucid", "0.2 mg", 34))
                .addComponent(new Component("Water", "1.2", 5));

        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponent(new Component("Penicilin", "0.5 mg", 17))
                .addComponent(new Component("Water", "1.2", 22));
        Pharmacy pharmacy4 = new Pharmacy();
        pharmacy4.addComponent(new Component("Penicilin", "0.5 mg", 17))
                .addComponent(new Component("Water", "1.2", 22));

        List<Pharmacy> pharmacyes = new ArrayList<>();
        pharmacyes.add(pharmacy1);
        pharmacyes.add(pharmacy2);
        pharmacyes.add(pharmacy3);
        pharmacyes.add(pharmacy4);
       // System.out.println(pharmacyes);
        Collections.sort(pharmacyes);
        System.out.println(pharmacyes);


       // System.out.println(pharmacy3.equals(pharmacy4)); //false

        Set<Pharmacy> pharmacySet = new HashSet<>();

        pharmacySet.addAll(pharmacyes);

        System.out.println(pharmacySet);

    }

}
