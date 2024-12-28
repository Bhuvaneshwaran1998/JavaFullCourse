package exception.RuntimeException;

public class Demo {
    public static void main(String[] args) {

        int a=10;
        int b=0;

        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("print final statement");
        }

        System.out.println("Hello World");
    }
}
