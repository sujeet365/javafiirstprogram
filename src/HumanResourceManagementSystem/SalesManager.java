package HumanResourceManagementSystem;

import java.util.Objects;
import java.util.Scanner;

 class Employee {
    String First_Name;
    String last_Name;
    int Regis_No;
    int Age;
    int Days_work;
    int vacation_days_taken;
    double salary;
    int worked_years;
    public Employee(String fName,String lName,int RegNo,int Age,int DayWork,int vacdaystaken,double sal,int workyear){
        this.First_Name=fName;
        this.last_Name=lName;
        this.Regis_No=RegNo;
        this.Age=Age;
        this.Days_work=DayWork;
        this.vacation_days_taken=vacdaystaken;
        this.salary=sal;
        this.worked_years=workyear;
    }
    int time_to_retire(int retire,int Age){
        return retire-Age;
    }
    int vacation_time_left(){
        return 10-this.vacation_days_taken;
    }
    double calculatebonus(){
        return (salary + (salary)*0.12);
    }
}

class Sales_Rep extends Employee{
    double salesmade;
    public Sales_Rep(String fName, String lName, int RegNo, int Age, int DayWork, int vacdaystaken, double sal, int workyear,double salesmade) {
        super(fName, lName, RegNo, Age, DayWork, vacdaystaken, sal, workyear);
        this.salesmade=salesmade;
    }
    double commission(){
        return (salesmade *200);
    }

}

class Sales_Manager {
    public static void main(String[] args) {
        System.out.println(" Welcome To HR ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of HR");
        String name=sc.nextLine();
        System.out.println("Enter the name of password");
        String password=sc.nextLine();
        String pass="112233";
        if(Objects.equals(password, pass)){
            System.out.print("Enter the First Name:");
            String first=sc.nextLine();
            System.out.print("Enter the last Name:");
            String last=sc.nextLine();
            System.out.print("Enter the Registration Number:");
            int regno=sc.nextInt();
            System.out.print("Enter the Age:");
            int age=sc.nextInt();
            System.out.print("Enter the Total days:");
            int tdays=sc.nextInt();
            System.out.print("Enter the Vacation days:");
            int vdays=sc.nextInt();
            System.out.print("Enter the salary:");
            double sal=sc.nextDouble();
            System.out.print("Enter the year worked:");
            int yearwrk=sc.nextInt();
            Employee emp = new Employee(first,last,regno,age,tdays,vdays,sal,yearwrk);
            System.out.println("Time to retirement:"+emp.time_to_retire(60,age));
            System.out.println("Vacation days left:"+emp.vacation_time_left());
            System.out.println("Bonus is :"+emp.calculatebonus());
            System.out.print("Sales made is:");
            int salesmade=sc.nextInt();
            Sales_Rep salesrep=new Sales_Rep(first,last,regno,age,tdays,vdays,sal,yearwrk,salesmade);
            System.out.println("Commission is:"+salesrep.commission());

        }
        else{
            System.out.println("Wrong Input or Incorrect Password");
        }
    }
}