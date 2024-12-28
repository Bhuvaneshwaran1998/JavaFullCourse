package oops.inheritance;


class Thaththa {
    public String thaththaProperty(String property){
         return property;
    }
}

class Father extends Thaththa{
    public String fatherProperty(String property){
        return property;
    }
}

class Son extends Thaththa{
    public String sonProperty(String property){
        return property;
    }
}


public class HierarchicalInheritance {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.thaththaProperty("5lacks"));
        Father father = new Father();
        System.out.println(father.thaththaProperty("5lacks"));
    }
}
