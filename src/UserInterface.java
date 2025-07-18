import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Endowment Id");
        String id = sc.nextLine();

        System.out.println("Enter Holder Name");
        String name = sc.nextLine();

        System.out.println("Enter Endowment Type");
        String type = sc.nextLine();

        System.out.println("Enter Registration Date");
        String date = sc.nextLine();

        Endowment endowment;

        if (type.equalsIgnoreCase("educational")) {
            System.out.println("Enter Educational Institution");
            String institution = sc.nextLine();

            System.out.println("Enter Educational Division");
            String division = sc.nextLine();

            endowment = new EducationalEndowment(id, name, type, date, institution, division);
            double amount = endowment.calculateEndowment();
            System.out.printf("Endowment Amount %.2f", amount);

        } else if (type.equalsIgnoreCase("health")) {
            System.out.println("Enter Health Care Center");
            String center = sc.nextLine();

            System.out.println("Enter Holder Age");
            int age = sc.nextInt();

            endowment = new HealthEndowment(id, name, type, date, center, age);
            double amount = endowment.calculateEndowment();
            System.out.printf("Endowment Amount %.2f", amount);

        } else {
            System.out.println(type + " is an invalid endowment type");
        }

        sc.close();
    }
}
