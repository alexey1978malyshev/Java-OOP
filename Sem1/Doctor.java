package Seminars.Sem1;

public class Doctor extends Medic implements Treatment, Servisable {


    public Doctor(String name, String spetiality) {
        super(name, spetiality);
    }

    @Override
    public String toString() {
        return "Medic{" +
                "name='" + getName() + '\'' +
                ", spetiality='" + getSpetiality() + '\'' +
                '}';
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
    public void makeDiagnostic() {

    }

    @Override
    public void writeReciept() {

    }
}