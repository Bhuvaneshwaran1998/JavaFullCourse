package oops.abstraction;


abstract class R15_V2 {

    abstract void printName(String name);
    abstract int printAge(int age);
    public String lastName(String lastName) {
        return lastName;
    }
}

class R15_V3 extends R15_V2 {

    @Override
    void printName(String name) {
        System.out.println(name);
    }

    @Override
    int printAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid age");
        }
        return age ;
    }

    public String qulification(String qulification) {
        return qulification;
    }

    public static void main(String[] args) {
        R15_V2 obj = new R15_V3();
        R15_V3 obj2 = new R15_V3();
       System.out.println(obj.printAge(0));
       obj.printName("Bhvui");
       obj2.lastName("v");
    }
}
