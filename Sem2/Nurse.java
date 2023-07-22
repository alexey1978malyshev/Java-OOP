package Seminars.Sem2;

public class Nurse extends Medic implements Service {


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
