package oops.polymorphism;

public class MethodOverLoading {

    public int add1(int a, int b){
        return a+b;
    }

    public void add(double a, double b){
        double c = a-b;
        System.out.println(c);
    }

    public String printName1(String name){
        return name;
    }

    public void printName(String name, String name2){
      String  fullName = name+" "+name2;
     System.out.println( fullName );
    }



    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        obj.add(2,5);
        System.out.println(obj.add1(1,3));
        obj.printName("bhuvi","lalith");
        System.out.println(obj.printName1("Bhuvanesh"));
    }
}
