package animalKingdom;

 abstract class Animal 
{
//fields
private static int maxId = 0;
protected int id;
protected String name;
protected int yearNamed;

public Animal(String name, int yearNamed){
maxId++;
id = maxId;
this.name = name;
this.yearNamed = yearNamed;
}
//methods
abstract String move();
abstract String breath();
abstract String reproduce();

    int getYear()
   {
       return yearNamed;
   } 
   String getName()
   {
       return name;
   }

   @Override
   public String toString()
    {
        return "Animal{" + "id=" + id + "name=" + name + "yearNamed=" + yearNamed + "}";
    }
}