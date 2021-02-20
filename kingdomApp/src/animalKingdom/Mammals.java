package animalKingdom;

public class Mammals extends Animal {
    public Mammals(String name, int yearNamed)
    {
        super(name, yearNamed);
    }

    @Override
    public String move(){
        return "Walk";
    }
    @Override
    public String breath(){
        return "Lungs";
    }
    @Override
    public String reproduce(){
        return "Live birth";
    }
}
