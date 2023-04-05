package ShortVideoRecap.oop.inheritance;

public class Animal {

    /*
    Animal Class is Parent class
    all classes -> Cat / Dog / Fish will "Inherit" our "Instance Variables" from below.
    WHY? -> Because they all have these fields in common and to avoid creating the same fields per class.
    Subclass can also create more additional unique fields that were NOT provided by the super class
     */

    public String name;
    public String breed;
    public char gender;
    public String size;
    public int age;
    public String color;

    public void sleep(){
        System.out.println(name + " is sleeping");
    }







    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }




}
