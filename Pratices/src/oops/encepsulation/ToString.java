package oops.encepsulation;

class Demo2 {
    private int id;
    private String name;

    public Demo2(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Demo2 [id=" + id + ", name=" + name + "]";
    }
}

public class ToString {
    public static void main(String[] args) {
        Demo2 demo = new Demo2(1, "bhuvi");
        Demo2 demo2 = new Demo2(2, "lalith");
        System.out.println(demo);
        System.out.println(demo2);



    }
}
