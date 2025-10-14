public class Employee {
    int id;
    String firstName, lastName;
    int salary;

    public Employee(int id, String fn, String ln, int salary)
    {
        this.id = id;
        firstName = fn;
        lastName = ln;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return getFirstName()+" "+getLastName();
    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    public int getAnnualSalary()
    {
        return salary*12;
    }
    public int raiseSalary(int percent)
    {
        salary = (salary*percent)/100+salary;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

