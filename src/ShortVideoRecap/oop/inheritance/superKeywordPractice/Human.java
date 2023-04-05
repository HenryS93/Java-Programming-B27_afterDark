package ShortVideoRecap.oop.inheritance.superKeywordPractice;

public class Human extends ZooAnimals{


    public String person;
    public String jobTitle;

    public void personel(){
        System.out.println("is working with " + breed);
    }


    @Override
    public String toString() {
        return "Human{" +
                "person='" + person + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
