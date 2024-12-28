package oops.encepsulation;
class Demo1{
    private int id;
    private String name;
    private int age;
    private String course;

    public Demo1(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

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


}
public class Constructor {

    public static void main(String[] args) {
        Demo1 obj = new Demo1(1, "bhuvi", 20, "Java");
        System.out.println(obj);

        System.out.println(obj.getAge()+" "+obj.getName()+" "+obj.getCourse()+" "+obj.getId());

        for(int i=0; i<=1; i++){
            if(obj.getAge()<=18 ){
                System.out.println("Not ready to join a course");
            }else if(obj.getName().equals("bhuvi")){
                System.out.println("Ready to join a course of java");
            }else {
                System.out.println("Good night");
            }
        }

    }



}
