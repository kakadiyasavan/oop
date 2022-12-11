import java.util.Scanner;

public class member {

    public static void main(String[] args) {
        
      Employee c = new Employee();
      c.SetId(10);
      c.SetName("savan");
      c.Setdesignationa("CEO");
      c.Setsalay(900000000);

      System.out.println("Employee ID : "+c.getId());
      System.out.println("Employee Nmae : "+c.getName());
      System.out.println("Employee designationa : "+c.getdesignationa());
      System.out.println("Employee salary : "+c.getsalary());
    }
    
}

class Employee{

    int emp_id;
    String emp_name;
    String emp_designationa;
    int emp_salary;

    public void SetId(int Id){
        this.emp_id=emp_id;
    }
    public int getId(){
        return emp_id;
    }

    public void SetName(String Id){
        this.emp_name=emp_name;
    }
    public String getName(){
        return emp_name;
    }
    
    public void Setdesignationa(String designationa){
        this.emp_designationa=emp_designationa;
    }
    public String getdesignationa(){
        return emp_designationa;
    }

    public void Setsalay(int Salary){
        this.emp_salary=emp_salary;
    }
    public int getsalary(){
        return emp_salary;
    }
}
