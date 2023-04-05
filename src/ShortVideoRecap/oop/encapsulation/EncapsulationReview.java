package ShortVideoRecap.oop.encapsulation;

public class EncapsulationReview {

    /*
    These two Instance Variables are SET -> "PUBLIC" it means that, they can be called and modified anywhere in our project.
    To AVOID this, We SET them to "PRIVATE", which means we can SET a "boundary" to this Class ONLY or accessed through our SETTERS & GETTERS.
     */
    public String name = "Henry";
    public double salary = 16_000;




    /*
    ONLY in this class we can modify our "PRIVATE" Instance Variables
     */
    private String name2 = "HENRY";
    private double salary2 = 18_000;


    /*
    Also, in this same class we MUST generate our GETTERS & SETTERS to "PUBLIC" if we ever want to modify or read the values of our Instance Variables
     */


    /** METHOD -> "getName2"
     ** Method returns a value for READ ONLY.
     * Getter MUST match the return type of "PRIVATE" Instance Variable
     */
    public String getName2(){
        return name2;
    }

    /**METHOD -> "setName2"
     * Method is used to Write ONLY.
     * Method always needs a parameter to be passed.
     * Method needs to match the return type of the "Private" Instance Variable in order to assign a new value.
     * @param name2
     */
    public void setName2(String name2){
        this.name2 = name2; // "this." - refers to the Instance variable
    }


    public double getSalary2() {
        return salary2;
    }

    public void setSalary2(double salary2) {
        this.salary2 = salary2;
    }

    @Override
    public String toString() {
        return "EncapsulationReview{" +
                "name2='" + name2 + '\'' +
                ", salary2=" + salary2 +
                '}';
    }
}
