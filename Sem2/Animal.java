package Seminars.Sem2;

public class Animal implements Illable {


    private String name;
     private String owner;


    public Animal(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void ill() {
        System.out.println("Жиотное болеет..");
    }




    @Override
    public String toString() {
        return "Animal = " + getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
