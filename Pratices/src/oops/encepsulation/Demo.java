package oops.encepsulation;
class Example {

    private int id;
    private String name;
    private int age;
    private String course;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

public class Demo {
    public static void main(String[] args) {

        Example example = new Example();
        Example example1 = new Example();
        example.setId(1);
        example.setName(null);
        example.setAge(22);
        example.setCourse("Java");
        System.out.println(example);

        System.out.println(example.getId() + " "+ example.getName() + " " + example.getAge() + " " + example.getCourse());

        for (int i=0; i<=example.getCourse().length(); i++){
            if(example.getName() != null ){
                System.out.println("name don't have a null character ");
            }else
                System.out.println("name have a null character");
        }

        example1.setId(3);
        example1.setName("");
        example1.setAge(22);
        example1.setCourse("Python");
        System.out.println(example1);

        System.out.println(example1.getId() + " "+ example1.getName() + " " + example1.getAge() + " " + example1.getCourse());

        for (int i=0; i<=example1.getCourse().length(); i++){
            if(example1.getName().isEmpty() ){
                System.out.println("name  have a empty character ");
            }
            else
                System.out.println("name don't have a null character");
        }

    }
}
