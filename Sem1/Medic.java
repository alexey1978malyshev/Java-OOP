package Seminars.Sem1;

public class Medic {

    private String name;
    private String spetiality;

    public Medic(String name, String spetiality) {
        this.name = name;
        this.spetiality = spetiality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpetiality() {
        return spetiality;
    }

    public void setSpetiality(String spetiality) {
        this.spetiality = spetiality;
    }

    @Override
    public String toString() {
        return "Medic{" +
                "name='" + name + '\'' +
                ", spetiality='" + spetiality + '\'' +
                '}';
    }
}
