public class strings {
    public static void main(String[] args) {
        String message = "Hello world" + "!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        message = message.replace("!!","??");
        System.out.println(message);
    }
}