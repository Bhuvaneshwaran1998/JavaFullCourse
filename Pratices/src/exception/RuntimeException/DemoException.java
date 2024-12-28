package exception.RuntimeException;

class A{
    public String checkAgeLimit(int age)
    {
        if (age < 18){
            throw new ArithmeticException("underage customer");
        }
        return "welcome to you";
    }
}

public class DemoException {
    public static void main(String[] args) {
        A a = new A();
        try {
            System.out.println(a.checkAgeLimit(20));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }


}
