package animalKingdom;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Animal Kingdom Project in java! Hi!");

        Mammals m1 = new Mammals("Panda", 1869);
        Mammals m2 = new Mammals("Zebra", 1778);
        Mammals m3 = new Mammals("Koala", 1816);
        Mammals m4 = new Mammals("Sloth", 1804);
        Mammals m5 = new Mammals("Armadillo", 1758);
        Mammals m6 = new Mammals("Raccoon", 1758);
        Mammals m7 = new Mammals("bigfoot", 2021);

        Birds b1 = new Birds("Pigeon", 1837);
        Birds b2 = new Birds("Peacock", 1821);
        Birds b3 = new Birds("Toucan", 1758);
        Birds b4 = new Birds("Parrot", 1824);
        Birds b5 = new Birds("Swan", 1758);

        Fish f1 = new Fish("Salmon", 1758);
        Fish f2 = new Fish("Catfish", 1817);
        Fish f3 = new Fish("Perch", 1758);

        List<Animal> animalKingdom = new ArrayList<>();
        animalKingdom.add(m1);
        animalKingdom.add(m2);
        animalKingdom.add(m3);
        animalKingdom.add(m4);
        animalKingdom.add(m5);
        animalKingdom.add(m6);
        animalKingdom.add(m7);
        animalKingdom.add(b1);
        animalKingdom.add(b2);
        animalKingdom.add(b3);
        animalKingdom.add(b4);
        animalKingdom.add(b5);
        animalKingdom.add(f1);
        animalKingdom.add(f2);
        animalKingdom.add(f3);

        System.out.println(animalKingdom);
        System.out.println(animalKingdom.size());

        System.out.println();
        System.out.println("\n*** Sort List ***");
        //LambdaExpressions

    }
}
