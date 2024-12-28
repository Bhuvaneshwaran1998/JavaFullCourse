package oops.inheritance;

class X {

    public String thathaName(String name){
        return name + " thatha";
    }
}

class Y extends X {
    public String fatherName(String name){
        return name + " father";
    }
}

class Z extends Y {

    public String sonName(String name){
        return name + " son";
    }
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        Z z = new Z();

        System.out.println(z.thathaName("samy"));
        System.out.println(z.fatherName("vel"));
        System.out.println(z.sonName("bhuvi"));



    }
}
