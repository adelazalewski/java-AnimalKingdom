package animalKingdom;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static void printAnimal(ArrayList<Animal> animals, CheckAnimal tester)
    {
        for (Animal a : animals)
        {
            if(tester.test(a))
            {
                System.out.println(a.getName() + " " + a.reproduce() + " " + a.breath() + " " + a.getYear());
            }
        }
    }
    
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

        Animal[] animalKingdom = {m1, m2, m3, m4, m5, m6, m7, b1, b2, b3, b4, b5, f1, f2, f3};
        
        System.out.println(animalKingdom.length);

        System.out.println();
        System.out.println("\n*** Sort List ***");
        //LambdaExpressions
        System.out.println();
        System.out.print("list animal in decending order by year named: ");
        Arrays.sort(animalKingdom, (a1, a2) -> a2.getYear() - a1.getYear());
        System.out.println(Arrays.toString(animalKingdom));
        System.out.println();

        System.out.println("list animals alphabatically");
        Arrays.sort(animalKingdom, (a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(Arrays.toString(animalKingdom));
        System.out.println();

        System.out.println("list animals ordered by how they move");
        Arrays.sort(animalKingdom, (a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(Arrays.toString(animalKingdom));

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(m1);
        animals.add(m2);
        animals.add(m3);
        animals.add(m4);
        animals.add(m5);
        animals.add(m6);
        animals.add(m7);
        animals.add(b1);
        animals.add(b2);
        animals.add(b3);
        animals.add(b4);
        animals.add(b5);
        animals.add(f1);
        animals.add(f2);
        animals.add(f3);

        System.out.println();
        System.out.println("List animals that breath with lungs");
        printAnimal(animals, (a) -> a.breath() == "Lungs");

        System.out.println();
        System.out.println("List animals that breath with lungs and were named in 1758");
        printAnimal(animals, (a) -> a.breath() == "Lungs" && a.getYear() == 1758);

        System.out.println();
        System.out.println("List animals that breath with lungs and lay eggs");
        printAnimal(animals, (a) -> a.breath() == "Lungs" && a.reproduce() == "Eggs");

        System.out.println();
        System.out.println("List animals that were named in 1758");
        printAnimal(animals, (a) -> a.getYear() == 1758);

        System.out.println();
        System.out.println("List animals that are mammals");
        printAnimal(animals, (a) -> a instanceof Mammals);
    }
}
