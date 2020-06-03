package animalkingdom;

import java.util.*;

public class Main {
    // private static List<AbstractAnimal> filteredList = new ArrayList<>();

    private static List<AbstractAnimal> filteredAnimals = new ArrayList<>();

    private static void filteranimals(List<AbstractAnimal> animals, CheckAnimal tester) {
        filteredAnimals.clear();
        for (AbstractAnimal a : animals) {
            if (tester.test(a)) {
                filteredAnimals.add(a);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Lambda day 3 Animal Kingdom");

        // Mamals
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);
        // Birds
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("parrot", 1824);
        Birds swan = new Birds("Swan", 1758);
        // Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        List<AbstractAnimal> myList = new ArrayList<>();
        myList.add(panda);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);
        myList.add(pigeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);
        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);

        // sort list by year named
        System.out.println("*List animals in decending order by year*\n");
        myList.sort(Comparator.comparing(a -> a.getYear(), Comparator.reverseOrder()));
        myList.forEach(a -> System.out.println(a));

        // sort list alphebetically by animal name
        System.out.println("\n*Sort all alphabetically*\n");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        myList.forEach(a -> System.out.println(a));

        // Sort by how the animals move
        System.out.println("\n*Sort by how animals move*\n");
        myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        myList.forEach(a -> System.out.println(a.getName() + " | " + a.move()));

        // List only animals that breathe with lungs
        System.out.println("\n*Only Lungs**\n");
        filteranimals(myList, a -> a.breath().equals("lungs"));
        filteredAnimals.forEach(a -> System.out.println(a.getName() + " | " + a.breath()));

        // List only animals that breathe with lungs and were named in 1758
        System.out.println("\n**Breathe with lungs, named 1758**");
        filteranimals(myList, a -> a.breath().equals("lungs") && a.getYear() == 1758);
        filteredAnimals.forEach(a -> System.out.println(a.getName() + " | " + a.breath() + " | " + a.getYear()));

        // basically just list the birds
        System.out.println("\n**Breathe with lungs, lays eggs**");
        filteranimals(myList, a -> a.breath().equals("lungs") && a.reproduce().equals("eggs"));
        filteredAnimals.forEach(a -> System.out.println(a.getName() + " | " + a.breath() + "|" + a.reproduce()));

        // List alphabetically only those animals that were named in 1758
        System.out.println("\n**List alphabetically only those animals that were named in 1758**");
        filteranimals(myList, a -> a.getYear() == 1758);
        filteredAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredAnimals.forEach(a -> System.out.println(a.getName() + "|" + a.getYear()));

        // System.out.println("\n*** The List");
        // System.out.println(myList);
        // for (AbstractAnimal aa : myList) {
        // System.out.println(
        // "Name :" + aa.getName() + "| Breaths with:" + aa.breath() + "| reproduces: "
        // + aa.reproduce());
        // }

        // System.out.println();
        // myList.sort((v1, v2) -> v1.getYear() - (v2.getYear()));
        // myList.forEach((v) -> System.out.println(v.getName() + "was name in year " +
        // v.getYear()));

        // System.out.println("\n Alphabetically");
        // myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        // myList.forEach((v) -> System.out.println("Name: " + v.getName()));

        // System.out.println("\n By how they move");
        // myList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        // myList.forEach((v) -> System.out.println("Name: " + v.getName() + "moves: " +
        // v.move()));

        // System.out.println("\n Breathes with lungs");
        // List<AbstractAnimal> Lungs = new ArrayList<>();
        // for (AbstractAnimal bl : myList) {
        // if (bl.breath() == "lungs") {
        // System.out.println(bl.getName() + " breaths with " + bl.breath());
        // }
        // Lungs.add(bl);
        // }
        // System.out.println("\n Breathes with lungs and year is 1758");
        // List<AbstractAnimal> LungsAndYear = new ArrayList<>();
        // for (AbstractAnimal bly : myList) {
        // if ((bly.breath() == "lungs") && (bly.getYear() == 1758)) {
        // System.out
        // .println(bly.getName() + " breaths with " + bly.breath() + "and was born in "
        // + bly.getYear());
        // }
        // LungsAndYear.add(bly);
        // }

        // System.out.println("\n lay eggs and breath with lungs");
        // List<AbstractAnimal> EggsandLungs = new ArrayList<>();
        // for (AbstractAnimal enl : myList) {
        // if ((enl.breath() == "lungs") && (enl.reproduce() == "eggs")) {
        // System.out.println(enl.getName() + " breaths with " + enl.breath() + " and
        // lays " + enl.reproduce());
        // }
        // EggsandLungs.add(enl);
        // }
        // System.out.println("\n Born in 1758 alphabetically");
        // List<AbstractAnimal> selectiveYear = new ArrayList<>();
        // for (AbstractAnimal bs : myList) {
        // if (bs.getYear() == 1758) {
        // selectiveYear.add(bs);
        // }
        // }
        // selectiveYear.sort((v1, v2) ->
        // v1.getName().compareToIgnoreCase(v2.getName()));
        // selectiveYear.forEach((v) -> System.out.println("Name: " + v.getName() +
        // "named in year " + v.getYear()));

    }

}