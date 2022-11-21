import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDetails {

    static void addEmployee(){
        Scanner sc = new Scanner(System.in);
        int n=1;
        ArrayList <Integer> empId = new ArrayList<Integer>();
        ArrayList <String> empName = new ArrayList<String>();
        ArrayList <String> des = new ArrayList<String>();
        ArrayList <Integer> sal = new ArrayList<Integer>();
        ArrayList <String> companyName = new ArrayList<String>();
        ArrayList <Integer> phone = new ArrayList<Integer>();
        ArrayList <String> email = new ArrayList<String>();

        System.out.println("Enter Employee ID");
        empId.add(sc.nextInt());
        System.out.println("Enter Employee Name");
        empName.add(sc.next());
        System.out.println("Enter Employee Designation");
        des.add(sc.next());
        System.out.println("Enter Employee Salary");
        sal.add(sc.nextInt());
        System.out.println("Enter Employee Company Name");
        companyName.add(sc.next());
        System.out.println("Enter Employee Phone");
        phone.add(sc.nextInt());
        System.out.println("Enter Employee Email");
        email.add(sc.next());
    }
    public static void main(String[] args) {
        int x=0;
        while (x==0){
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n){
                case 1:
                    addEmployee();
                    break;
                case 5:
                    x=1;
                    break;

            }
        }
    }
}
