package collection.map;

import java.util.HashMap;

class A{
    private String name;
    private int age;
    public A(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Name: " + name + " Age: " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




public class Demo {
    public static void main(String[] args) {
    A a1 = new A("Bob", 18);
    A a2 = new A("Bob", 19);
    A a3 = new A("Bob", 17);

    HashMap <Integer,A> map = new HashMap<>();
    map.put(a1.getAge(),a1);
    map.put(a2.getAge(), a2);
    map.put(a3.getAge(), a3);

    System.out.println(map);

    System.out.println(map.entrySet());
    System.out.println(map.keySet());


    }

}
