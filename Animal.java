public class Animal {

    public static String getDefaultGreeting(){
        return "Hello";
    }

    public static String getBirdGreeting(){
        return "Bird";
    }

    public static void main(String[] args) {
        String value = args[0];
        if (value.equalsIgnoreCase("bird"))
            System.out.println(getBirdGreeting());
    }
}