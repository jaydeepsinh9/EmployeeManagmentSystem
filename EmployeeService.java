import java.util.Scanner;
import java.util.HashSet;
public class EmployeeService {
    HashSet<Employee> empset= new HashSet<Employee>();
    Employee emp1= new Employee(101,"Jaydip",21,"Devloper",80000);
    Employee emp2= new Employee(102,"Dilavar",29,"IT",70000);
    Employee emp3= new Employee(103,"Smit",22,"Devloper",85000);
    Employee emp4= new Employee(104,"Rajdeep",27,"Sales",60000);
    Employee emp5= new Employee(105,"Yuvraj",29,"Sales",60000);

    Scanner s= new Scanner(System.in);
    int id,age,next;
    String name,department;
    double salary;
    boolean foundEmployee=false,temp=true;
    public EmployeeService()
    {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
        empset.add(emp5);
    }
    //checking all the Employee
    public void viewEmployee()
    {
        for(Employee emp:empset)
        {
            System.out.println(emp);
        }
    }
    public void viewEmployeeById() 
    {
        next=1;
        do {
            if(next==1)
            {
                System.out.println("Please enter the Id:");
                id = s.nextInt();
                s.nextLine(); // Consume the newline character
                foundEmployee = false; // Initialize foundEmployee to false for each search
                for (Employee emp : empset) 
                {
                    if (emp.getId() == id) 
                    {
                        System.out.println(emp);
                        foundEmployee = true;
                        break;
                    }
                }
                if (!foundEmployee) 
                {
                    System.out.println("No employee with this ID");
                }  
            }
            System.out.println("If you wish to view another employee please Enter 1 otherwise enter 0 to Exit.");
            next = s.nextInt();
            s.nextLine(); // Consume the newline character
            if (next == 0)
            {
                temp = false;
            }
            if(next!=1 && next!=0)
            {
                System.out.println("Please enter valid input");
            }
        } while (temp);
    }
    
    public void updateEmployeeDetails()
    {
        System.out.println("Please enter the Id:");
        id =s.nextInt();
        for (Employee emp : empset) {
        if (emp.getId() == id) {
            foundEmployee = true;
            do {
                System.out.println("Please tell us what you would like to update?\n1)Id\n2)Name\n3)Age\n4)Department\n5)Salary\n6)Exit");             
                next=s.nextInt();
                switch(next)
                {
                    case 1:
                        boolean idExists = false;
                        do 
                        {
                            System.out.println("Please enter the new unique employee ID:");
                            id = s.nextInt();
                            // Check if the new ID already exists
                            for (Employee emptemp : empset) 
                            {
                                if (emptemp.getId() == id) 
                                {
                                    idExists = true;
                                    System.out.println("Please enter a unique employee ID; this ID already exists.");
                                    break;
                                }
                                else
                                {
                                    idExists=false;
                                }
                            }
                            if (!idExists) 
                            {
                                emp.setId(id);
                                System.out.println("Employee ID updated successfully.");
                                temp=false;
                            }
                        } while (temp); // Keep prompting until a unique ID is provided
                        break;
                    case 2:
                        System.out.println("Please enter the Name that you want it to get updated to.");
                        name=s.nextLine();
                        emp.setName(name);
                        System.out.println("Record updated.\n");
                        break;
                    case 3:
                        System.out.println("Please enter the Age that you want it to get updated to.");
                        age=s.nextInt();
                        emp.setAge(age);
                        System.out.println("Record updated.\n");
                        break;
                    case 4:
                        System.out.println("Please enter the Department that you want it to get updated to.");
                        department=s.nextLine();
                        emp.setDepartment(department);
                        System.out.println("Record updated.\n");
                        break;
                    case 5:
                        System.out.println("Please enter the Salary that you want it to get updated to.");
                        salary=s.nextDouble();
                        emp.setSalary(salary);
                        System.out.println("Record updated.\n");
                        break;
                    case 6:
                        System.out.println("Thank you for updating employee information.");
                        foundEmployee=false;
                        break;
                    default:
                        System.out.println("Please enter valid choice.");
                }    
            } while (foundEmployee);
            break;
        }
        }
        if(foundEmployee!=true)
        {
            System.out.println("No employee with this ID");
        }
    }
    public void deleteEmployee()
    {
        next=1;
    do {
        switch(next)
        {
            case 1:
                System.out.println("Please enter the Id:");
                id =s.nextInt();
                for (Employee emp : empset)
                {
                    if (emp.getId() == id) 
                    {
                        foundEmployee = true;
                        empset.remove(emp);
                        break;
                    }
                }
                if (foundEmployee==false) 
                {
                    System.out.println("No employee with this ID");
                }
                break;
            case 0:
                System.out.println("Thank you for updating records.");
                temp=false;
                break;
            default:
                System.out.println("Please enter valid choice.");    
        }
        if(temp)
            {
            System.out.println("If you wish to delete another employee please Enter 1 otherwise enter 0 to Exit.");
            next = s.nextInt();
            s.nextLine(); // Consume the newline character
            }
    } while (temp);
    }
    public void addEmployee() {
        next = 1;
        boolean temp = true; // Initialize temp to true
        
        do {
            switch (next) {
                case 1:
                    temp=true;
                    System.out.println("Let's add another Employee.");
                    System.out.println("Please enter the id of the new Employee:");
                    id = s.nextInt();
                    while (temp==true) 
                    {
                        for (Employee emp : empset)
                        {
                            if (emp.getId() == id) 
                            {
                                System.out.println("Please enter unique employee id this employee id already exits.");
                                id=s.nextInt();
                            }
                            else
                            {
                                temp=false;
                            }
                        }
                    }
                    s.nextLine(); // Consume the newline character
                    System.out.println("Please enter the name of the new Employee:");
                    name = s.nextLine(); // Read the entire line
                    System.out.println("Please enter the age of the new Employee:");
                    age = s.nextInt();
                    s.nextLine(); // Consume the newline character
                    System.out.println("Please enter the department of the new Employee:");
                    department = s.nextLine(); // Read the entire line
                    System.out.println("Please enter the salary of the new Employee:");
                    salary = s.nextDouble();
                    s.nextLine(); // Consume the newline character
                    
                    Employee newEmployee = new Employee(id, name, age, department, salary);
                    empset.add(newEmployee);
                    break; // Add this break statement
    
                case 0:
                    System.out.println("Thank you for updating the Employee list.");
                    temp = false;
                    break;
                default:
                    System.out.println("Please enter valid choice.");
            }
            if(temp)
            {
            System.out.println("If you wish to enter another employee please Enter 1 otherwise enter 0 to Exit.");
            next = s.nextInt();
            s.nextLine(); // Consume the newline character
            }
            }while (temp);
    }
    
}