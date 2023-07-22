package Seminars.Sem1;

public class Animal {
    protected String nameAnimal;
    protected String ownerName;
    protected String diagnosis;
    protected Boolean isVactinated;
    protected final String TYPE = getClass().getSimpleName();


    public Animal() {

    }

    public Animal(String nameAnimal, String ownerName, String diagnosis, Boolean isVactinated) {
        this.nameAnimal = nameAnimal;
        this.ownerName = ownerName;
        this.diagnosis = diagnosis;
        this.isVactinated = isVactinated;
    }

    public boolean isVactinated() {
        return this.isVactinated;
    }

    public void setIsVactinated(Boolean isVactinated) {
        this.isVactinated = isVactinated;
    }

    public String getType() {
        return TYPE;
    }
    @Override
    public String toString(){
        return String.format("%s{name = %s,owner = %s}",TYPE,nameAnimal,ownerName);
    }
    public String getType(String args) {
        return args + TYPE;
    }

//    protected void toGo(String animalname){
//        System.out.println(animalname + " пошел..");
//    }
//    protected void fly(String animalName){
//        System.out.println(animalName + " полетел..");
//    }
//    protected void swim(String animalName){
//        System.out.println(animalName + " поплыл..");
//    }

    protected void move(String nameAnimal){
        this.nameAnimal = nameAnimal;
        System.out.println(nameAnimal + "пошел");

    }
}
