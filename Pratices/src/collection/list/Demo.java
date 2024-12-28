package collection.list;

import java.util.ArrayList;

class Example{

    private String name;
    private int age;
    private String qulification;

    public Example(String name, int age, String qulification){
        this.name = name;
        this.age = age;
        this.qulification = qulification;
    }


    public String toString(){
        return name + " " + age + " " + qulification;
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

    public String getQulification() {
        return qulification;
    }

    public void setQulification(String qulification) {
        this.qulification = qulification;
    }
}


public class Demo {
    public static void main(String[] args) {
        Example example1 = new Example("Bhuvi1", 21, "B.E");
        Example example2 = new Example("Bhuvi2", 22, "B.Ed");
        Example example3 = new Example("Bhuvi3", 23, "B.Ed");
        Example example4 = new Example("Bhuvi4", 24, "M.E");
        Example example5 = new Example("Bhuvi4", 25, "M.E");

        ArrayList<Example> examples = new ArrayList<>();

        examples.add(example1);
        examples.add(example2);
        examples.add(example3);
        examples.add(example4);
        examples.add(example5);


        System.out.println(examples);

        examples.stream().distinct().forEach(System.out::println);


        for(Example example : examples){
            System.out.println(example);
        }

        for(Example example : examples){
            if ("bhuvi1".equalsIgnoreCase(example.getName())) { // Compare names
                System.out.println(example); // Print the example if the name matches
            }
        }





    }
}
