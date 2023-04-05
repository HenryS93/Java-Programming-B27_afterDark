package ShortVideoRecap.oop.inheritance.superKeywordPractice;

public class ZooAnimals {

    public String name;
    public String breed;
    public char gender;
    public String size;
    public int age;
    public String color;
    public String food;
    public void sleeps(){
        System.out.println(name+ " is Sleeping");
    }

    public void isEating(){
        System.out.println("is eating" + food);
    }


    @Override
    public String toString() {
        return "ZooAnimals{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
