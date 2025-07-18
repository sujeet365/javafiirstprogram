import java.util.Scanner;

// Parent class Employee
class Employee {
    private String firstName;
    private String lastName;
    private int regNo;
    private int age;
    private int daysWorked;
    private int vacationDaysTaken;
    private double salary;
    private int workYear;

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setRegNo(int regNo) { this.regNo = regNo; }
    public void setAge(int age) { this.age = age; }
    public void setDaysWorked(int daysWorked) { this.daysWorked = daysWorked; }
    public void setVacationDaysTaken(int vacationDaysTaken) { this.vacationDaysTaken = vacationDaysTaken; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setWorkYear(int workYear) { this.workYear = workYear; }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getRegNo() { return regNo; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
    public int getVacationDaysTaken() { return vacationDaysTaken; }

    public int timeToRetire() {
        return 60 - age;
    }

    public int vacationTimeLeft() {
        return 40 - vacationDaysTaken;
    }

    public double calculateBonus() {
        return salary * 0.12;
    }

    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Reg No: " + regNo);
        System.out.println("Age: " + age);
        System.out.println("Years to Retire: " + timeToRetire());
        System.out.println("Vacation Days Left: " + vacationTimeLeft());
        System.out.println("Bonus: ₹" + calculateBonus());
    }
}

// Child class SalesRep
class SalesRep extends Employee {
    private double salesMade;

    public void setSalesMade(double salesMade) {
        this.salesMade = salesMade;
    }

    public double getSalesMade() {
        return salesMade;
    }

    public double calculateCommission() {
        return salesMade * 0.07;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sales Made: ₹" + salesMade);
        System.out.println("Commission: ₹" + calculateCommission());
    }
}

// Child class SalesManager (polymorphic override of displayInfo)
class SalesManager extends SalesRep {
    @Override
    public void displayInfo() {
        super.displayInfo();
        double extraCommission = getSalesMade() * 0.09; // 7% + 2%
        System.out.println("Extra Commission (Manager): ₹" + extraCommission);
    }
}

// Main driver class
public class HRMSApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalesManager manager = new SalesManager();

        System.out.println("===== Enter Employee Details =====");

        System.out.print("First Name: ");
        manager.setFirstName(sc.nextLine());

        System.out.print("Last Name: ");
        manager.setLastName(sc.nextLine());

        System.out.print("Registration No: ");
        manager.setRegNo(sc.nextInt());

        System.out.print("Age: ");
        manager.setAge(sc.nextInt());

        System.out.print("Days Worked: ");
        manager.setDaysWorked(sc.nextInt());

        System.out.print("Vacation Days Taken: ");
        manager.setVacationDaysTaken(sc.nextInt());

        System.out.print("Salary: ");
        manager.setSalary(sc.nextDouble());

        System.out.print("Work Year: ");
        manager.setWorkYear(sc.nextInt());

        System.out.print("Sales Made: ");
        manager.setSalesMade(sc.nextDouble());

        System.out.println("\n===== Sales Manager Info =====");
        manager.displayInfo();

        sc.close();
    }
}
