package animalkingdom;

public class Mammals extends AbstractAnimal {

    public Mammals(String name, int year) {
        super(name, year);

    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String reproduce() {
        return "live births";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    // @Override
    // public String toString(){
    // return "Mammal, " + "Name: "+ name +
    // }
}