package exception.userDefindException;

class A{

    public static final String NOT_YET_COMPLETED_18_AGE = "not yet completed  18 age";

    public String checkAge(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException(NOT_YET_COMPLETED_18_AGE);
        }
        return "welcome";
    }
}



public class Demo {
    public static void main(String[] args) {
        A a = new A();

        try {
            System.out.println(a.checkAge(17));
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }


    }
}
