package animalkingdom;

public class Birds extends AbstractAnimal {

    public Birds(String name, int year) {
        super(name, year);

    }

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public String breath() {
        return "lungs";
    }
}