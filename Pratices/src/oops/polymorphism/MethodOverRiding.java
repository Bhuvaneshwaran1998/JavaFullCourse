package oops.polymorphism;

class Example {

    public String printName(String name){
        return name.toUpperCase();
    }

    public int findAge(int age){
        return age;
    }

}

class Demo extends Example{
    public String printName(String name){
        return name.toLowerCase();
    }

}


public class MethodOverRiding {
    public static void main(String[] args) {

        Example example = new Example();
        Demo obj = new Demo();
        Example obj2 = new Demo();
       System.out.println(example.printName("John"));
       System.out.println(obj.printName("John"));
       System.out.println(obj2.printName("John"));
       System.out.println(obj2.findAge(25));


    }
}
