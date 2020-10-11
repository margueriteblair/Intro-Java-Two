public class switchstatements {
    public static void main(String[] args) {
        String role = "admin";
        if (role == "admin") {
            System.out.println("You are an admin");
        } else if (role == "moderator") {
            System.out.println("You are a moderator");
        } else {
            System.out.println("You are a guest");
        }

        switch(role) {
            case "admin":
            System.out.println("You are an admin");
            break;
            case "moderator":
            System.out.println("You are a mod");
            break;
            default: 
            System.out.println("you are a guest");
 
        }
    }
}