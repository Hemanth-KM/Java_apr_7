package April22;

import java.util.Arrays;

public class EmployeeDetails {
    public static void main(String[] args) {
        String data = "1001-Seetha-10000,1002-Geetha-20000,1003-Sheela-30000,1004-Bala-40000,1005-Peru-50000";
        String[] empArr = data.split(",");
        Employee[] arr = new Employee[empArr.length];
        int i =0;
        for(String ele:empArr){
            String[] empdata = ele.split("-");
            int empno = Integer.parseInt(empdata[0]);
            String empname = empdata[1];
            double Salary = Double.parseDouble(empdata[2]);
            Employee emp = new Employee(empno,empname,Salary);
            arr[i++] = emp;

        }

        for(Employee emp:arr){
            emp.ShowDetails();
        }

    }
}
