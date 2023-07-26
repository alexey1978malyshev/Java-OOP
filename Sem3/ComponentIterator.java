package Seminars.Sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ComponentIterator implements Iterator<Component> {

    private int index;
    private Pharmacy pharmacy;

    public ComponentIterator(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

   //private List<Component> components = new ArrayList<>();

    @Override
    public boolean hasNext() {
        if (index < pharmacy.getComponents().size()) return true;
        return false;
        // return index < components.size();
    }

    @Override
    public Component next() {
        return pharmacy.getComponents().get(index++);
//        Component component = components.get(index);
//        index++;
//        return component;
    }
    //так работает for под капотом итератора
//    private  void  example(){
//        Pharmacy drug = new Pharmacy();
//        for (Iterator<Component> iterator = drug.iterator(); iterator.hasNext();){
//            Component c = iterator.next();
//        }
//    }


}
