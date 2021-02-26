package CodingConvention;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Employee
{
    int id;
    double salary=0.0;

    public Employee(int id,double salary) {
        this.id = id;
        this.salary=salary;
    }

    public Employee() {

    }

    double calTax() {
        if (this.salary > 500000.00 && this.salary < 1000000)
            return this.salary * 0.1;

        else if (this.salary > 1000000.00 && this.salary < 1500000)
            return this.salary * 0.2;

        else
            return this.salary * 0.3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> empList =new LinkedList<>();
        for(int i=0;i<10;i++){
            int id =sc.nextInt();
            double salary = sc.nextDouble();
            empList.add(new Employee(id,salary));
        }
        empList.stream().forEach(obj-> System.out.println(obj.calTax()));
    }

}
