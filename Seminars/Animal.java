package Seminars;

public class Animal{
    private String nameAnimal;
    private String ownerName;
    private String diagnosis;
    private Boolean isVactinated;
    private final String TYPE=getClass().getSimpleName();

    public Animal(){

    }
    public Animal(String nameAnimal, String ownerName,String diagnosis,Boolean isVactinated){
        this.nameAnimal = nameAnimal;
        this.ownerName = ownerName;
        this.diagnosis = diagnosis;
        this.isVactinated = isVactinated;
    }

    public boolean isVactinated(){
        return this.isVactinated;
    }
    public void setIsVactinated(Boolean isVactinated){
        this.isVactinated = isVactinated;
    }
    public String getType(){
        return TYPE;
    }

}
