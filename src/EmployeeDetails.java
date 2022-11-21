import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDetails {
    static ArrayList <Integer> empId = new ArrayList<Integer>();
    static ArrayList <String> empName = new ArrayList<String>();
    static ArrayList <String> des = new ArrayList<String>();
    static ArrayList <Integer> sal = new ArrayList<Integer>();
    static ArrayList <String> companyName = new ArrayList<String>();
    static ArrayList <Integer> phone = new ArrayList<Integer>();
    static ArrayList <String> email = new ArrayList<String>();
    static Scanner sc;

    static void addEmployee(){

        int n=1;


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

    static void viewData(){
        for(int i=0;i< empId.size();i++){
            System.out.println(empId.get(i));
            System.out.println(empName.get(i));
            System.out.println(des.get(i));
            System.out.println(sal.get(i));
            System.out.println(companyName.get(i));
            System.out.println(phone.get(i));
            System.out.println(email.get(i));
        }

    }
    static void searchEmp(){
        System.out.println("Enter the name of the person to search");
        String name = sc.next();
        if(empName.contains(name)){
           int i = empName.indexOf(name);
            System.out.println("Found");
            System.out.println(empId.get(i));
            System.out.println(empName.get(i));
            System.out.println(des.get(i));
            System.out.println(sal.get(i));
            System.out.println(companyName.get(i));
            System.out.println(phone.get(i));
            System.out.println(email.get(i));
        }
        else {
            System.out.println("Not Found");
        }
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
                case 2:
                    viewData();
                case 3:
                    searchEmp();
                case 5:
                    x=1;
                    break;

            }
        }
    }
}
