package oops.inheritance;

class A{
    public String fatherName(String name){
        return name + " Father";
    }
}

class B extends A{
    public String sonName(String name){
        return name + " Son";
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.fatherName("vel"));
        System.out.println(b.sonName("Bhuvi"));
    }

}
