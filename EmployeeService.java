import java.util.Scanner;
import java.util.HashSet;
public class EmployeeService {
    HashSet<Employee> empset= new HashSet<Employee>();
    Employee emp1= new Employee(101,"Jaydip",21,"Devloper",80000);
    Employee emp2= new Employee(102,"Dilavar",29,"IT",70000);
    Employee emp3= new Employee(103,"Smit",22,"Devloper",85000);
    Employee emp4= new Employee(104,"Rajdeep",27,"Sales",60000);
    Employee emp5= new Employee(101,"Yuvraj",29,"Sales",60000);

    Scanner s= new Scanner(System.in);
    int id,age;
    String name,department;
    double salary;
    public EmployeeService()
    {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
        empset.add(emp5);
    }
}