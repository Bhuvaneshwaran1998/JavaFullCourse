package loop;

public class Demo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i=10; i > 0; i--) {
            System.out.println("reverce "+i);
        }

        String name = "Bhuvaneshwaran";

        for (int i=0 ; i<name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        for (int i=name.length()-1; i>=0; i--) {
            System.out.println(name.charAt(i));
        }

        String city = "malayalam";
        String temp = "";
        for (int i=city.length()-1; i>=0; i--) {
           temp=temp+city.charAt(i);
        }

        if(temp.equals(city)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }


        int count =0;
        for(int i=0; i<=city.length()-1; i++) {
            if(city.charAt(i)== 'm'|| city.charAt(i) == 'a') {
                count = count + 1;
            }
        }
        System.out.println(count);


    }
}
