import java.util.Arrays;

class Library{

   public void checkAge(int age ) throws Exception{

       if(age<18)
           throw new Exception("You are teenager.");

       System.out.println("you are younger.");

   }

    void main() {

        int age = 1;
        try {
            checkAge(age);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }



}