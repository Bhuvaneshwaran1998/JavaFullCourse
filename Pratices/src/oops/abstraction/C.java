package oops.abstraction;

interface A{

    void a();
    String b();
    void c();


}

abstract class B implements A {

    public void a() {
        System.out.println("I am A");
    }

    public String b() {
        return "I am B";
    }

    abstract void d();


}




public class C extends B {
    @Override
    void d() {
        System.out.println("I am D");
    }

    @Override
    public void c() {
        System.out.println("I am C");
    }

    public static void main(String[] args) {

        C c = new C();
        c.d();
        c.c();
        System.out.println(c.b());
        c.a();

    }

}
