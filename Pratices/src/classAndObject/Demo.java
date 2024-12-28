package classAndObject;

class Example {

    String name ="Bhuvi";
    int age =18;

    public void printName() {
        System.out.println(name);
    }

    public void printAge() {
        System.out.println(age);
    }

    public int add(int a, int b) {
        int c = 0;
        if (a != 0 || b != 0) {
            c = a + b;
        }
        return c;
    }

    public String printName1(String a) {
        return a;
    }

    int[]  nums = {1,2,3,4,5};




}
public class Demo {
    public static void main(String[] args) {

        Example obj = new Example();
        obj.printName();
        obj.printAge();
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.add(1,2));
        System.out.println(obj.printName1("Bhuvi"));

        for (int i = 0; i < obj.nums.length; i++) {
            if(obj.nums[i] == 1)
            System.out.println(obj.nums[i]);
            else
                System.out.println(obj.nums[i]);
        }

    }


}
