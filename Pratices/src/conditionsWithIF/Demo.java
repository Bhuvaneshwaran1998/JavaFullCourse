package conditionsWithIF;

public class Demo {
    public static void main(String[] args) {

        String name = "bhuvi";

        if(name.startsWith("bhuvi")) {
            System.out.println("Hello Bhuvi");
        }
        else {
            System.out.println("Hello World");
        }
////////////////////////////////////////////////////////////////
        if (name.length()>10){
            System.out.println("Hello Bhuvi");
        }else {
            System.out.println("Hello World");
        }
/////////////////////////////////////////////////////////////////
        if (name.length() < 10 && name.startsWith("b")){
            System.out.println("Hello Bhuvi");
        }else {
            System.out.println("Hello World");
        }
////////////////////////////////////////////////////////////////

        String time= "9am";

        if(time != null && time.equals("9am")){
            System.out.println("Good Morning");
        } else if (time.equals("1pm")) {
            System.out.println("Good Afternoon");
        } else if (time.equals("5pm")) {
            System.out.println("Good Evening");
        }else
            System.out.println("Good Night");

////////////////////////////////////////////////////
        String name1 ="lalith";
        String name2 ="lalitha";

        if(name1.equals("lalith")){
            System.out.println("Hello Lalith");
        }
        else if (name2.equals("lalitha")){
            System.out.println("Hello Lalitha");
        }

    }
}
