package oprators;

public class Addition {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;  // division..........using (/) it will return qusionend value
        int g = a % b;  // using (%) it will return a remainder value
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        int num = 5;
//		num=num+5;
//		num+=5;
//		num-=2;
//		num*=2;
//		num++;
//		++num;
//        System.out.println(num);
        int	number=num++;     //it will first fatch the value and increment;
        int numbers=++num;    //it will first increment the value and fatch the data;
        System.out.println(number);
        System.out.println(numbers);

    }
}
