public class Employee 
{
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getDepartment()
    {
        return department;
    }
    public void setDepartment(String department)
    {   
        this.department=department;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public String toString()
    {
        return "Empolyee Details\nId:"+id+"\nName: "+name+"\nAge: "+age+"\nDepartment:"+department+"\nSalary:"+salary+"\n";
    }
    public Employee(int id, String name,int age, String department,double salary)
    {
        super();
        this.id=id;
        this.name=name;
        this.age=age;
        this.department=department;
        this.salary=salary;
    }
}