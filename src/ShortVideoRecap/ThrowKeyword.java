package ShortVideoRecap;

public class ThrowKeyword {



    public static void main(String [] args) throws Exception {

        String str = "Henry";

        String str2 = "";


        for ( int i = 0; i <=0; i++){

            str2 = str.substring(i);

            if (str2.substring(0,1).equals(str2.substring(0,1).toLowerCase())){

                System.out.println("Expected: " + str2.substring(0,1).toUpperCase() + str2.substring(1));
                System.out.println("Actual: " + str2);

                throw new Exception("First letter from name must be uppercase");

            }else {
                System.out.println(str2 + "\n-SUCCESS, Assertion PASSED!");
            }

        }





    }

}
