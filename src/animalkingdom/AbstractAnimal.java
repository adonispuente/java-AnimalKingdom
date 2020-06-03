package animalkingdom;

public abstract class AbstractAnimal {
    private static int maxId = 0;
    private int id;
    private String name;
    private int year;

    public AbstractAnimal(String name, int year) {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;

    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public abstract String move();

    public abstract String reproduce();

    public abstract String breath();

    // public abstract String toString();

}