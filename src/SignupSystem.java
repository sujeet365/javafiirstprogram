import java.util.Scanner;

class User {
    String name;
    String email;
    String mobile;
    String password;

    // Constructor
    public User(String name, String email, String mobile, String password) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }

    public void displayUser() {
        System.out.println("\n--- Sign Up Successful ---");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
    }
}

public class SignupSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ TATA STRIVE Sign-Up ------");

        System.out.print("Enter Full Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Create Password: ");
        String password = sc.nextLine();

        System.out.print("Confirm Password: ");
        String confirmPassword = sc.nextLine();

        if (!password.equals(confirmPassword)) {
            System.out.println("❌ Passwords do not match. Please try again.");
        } else {
            User newUser = new User(name, email, mobile, password);
            newUser.displayUser();
        }

        sc.close();
    }
}
