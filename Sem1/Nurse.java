package Seminars.Sem1;

public class Nurse extends Medic implements Servisable{


    public Nurse(String name, String spetiality) {
        super(name, spetiality);
    }

    @Override
    public void meetPatients() {

    }

    @Override
    public void prepareDocuments() {

    }

    @Override
    public void makeInjection() {

    }

    @Override
    public void putOnDrip() {

    }

    @Override
    public String toString() {
        return "Nurse{" +
                "name='" + getName() + '\'' +
                ", spetiality='" + getSpetiality() + '\'' +
                '}';
    }
}
