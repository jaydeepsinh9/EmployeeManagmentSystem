import java.util.Scanner;
public class Main {
    EmployeeService service=new EmployeeService();
    static boolean ordering =true;
    public static void menu()
    {
        System.out.println("Welcome to Employee managment System: Choose your option from following.\n1)Add Employee.\n2)View Employee.\n3)Update Employee.\n4)Delete Employee.\n5)View All Employee.\n6)Exit. ");
    }
    public static void main (String[] args)
    {
        EmployeeService service=new EmployeeService();
        Scanner sc=new Scanner(System.in);
        do
        {
            menu();
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    service.addEmployee();
                    break;
                case 2:
                    service.viewEmployeeById();
                    break;
                case 3:
                    service.updateEmployeeDetails();
                    break;
                case 4:
                    service.deleteEmployee();
                    break;
                case 5:
                    System.out.println("\nAll Employee List\n");
                    service.viewEmployee();
                    break;
                case 6:
                    System.out.println("Thank you for using the application.\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter valid choice.\n");
                    break;
            }
        }while(ordering);
    }
}
