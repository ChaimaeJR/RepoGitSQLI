public class Animal {

    public static String getDefaultGreeting(){
        return "Hello";
    }

    public static String getCatGreeting(){
        return "Meow";
    }


    public static void main(String[] args) {
        String value = args[0];
        if (value.equalsIgnoreCase("cat"))
            System.out.println(getCatGreeting());
        
    }
}