package April22;

public class Employee {
    private int empno;
    private String empname;
    private  double Salary;

    public Employee(int empno, String empname,double Salary){
        this.empno = empno;
        this.empname = empname;
        this.Salary = Salary;
    }
    public void ShowDetails()
    {
        System.out.println(empno +"," + empname +"," + Salary);
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
