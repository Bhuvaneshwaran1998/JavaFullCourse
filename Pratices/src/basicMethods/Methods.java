package basicMethods;



public class Methods {
    public static void main(String[] args) {

        String myName = "Bhuvi";
        String myWife = "lalith";
        System.out.println(myName);
        System.out.println(myWife);

        System.out.println("name to lower case "+myName.toLowerCase());
        System.out.println(" name to upper case  "+myName.toUpperCase());
        System.out.println(" Find a name length "+ myName.length());
        System.out.println(" Find the index place and get "+ myName.charAt(0));
        System.out.println(" name contains any latter are word  return only boolean value"+ myName.contains("bh"));
        System.out.println("join a String value "+myName.concat(myWife));
        System.out.println("find by name start with "+ myName.startsWith("s"));
        System.out.println("find by end with "+ myName.endsWith("i"));
        System.out.println("get any where word with help of index "+ myName.substring(2,5));
        System.out.println("get any where word with help of index "+ myName.substring(2));
        System.out.println("get any where word with help of index "+ myName.subSequence(2,4));
        System.out.println("find the equal contain "+myName.equals(myWife));





    }

}
