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
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Add Employee\n");
                    break;
                case 2:
                    System.out.println("View Emoloyee\n");
                    break;
                case 3:
                    System.out.println("Update Employee\n");
                    break;
                case 4:
                    System.out.println("Delete Employee\n");
                    break;
                case 5:
                    System.out.println("View all Employee\n");
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
