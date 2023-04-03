package SALARY;

import javax.print.attribute.standard.PrinterState;

public class Employee {
    int salary;
    String name;
    int workHours;
    int hireYear;
    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public  double tax(){
        if(this.salary>=1000){
            return this.salary*3/100;
        }
        return 0;
    }
    public int bonus(){
        if (this.workHours>40){
            return (workHours-40)*30;
        }
        return 0;
    }
    public double raiseSalary(){
        int year=2023;
        if (year-this.hireYear<10){
            return this.salary*5/100;
        } else if (year-this.hireYear<20&&year-this.hireYear>9) {
            return this.salary*10/100;
        }
        else if (year-this.hireYear>19){
            return this.salary*15/100;
        }
        return 0;
    }
    public String toString(){
        System.out.println("--------------------");
        return "Name: " + this.name + "\nSalary: " + this.salary +
        "\nWork Hours: " + workHours + "\nHire Year: " + hireYear +
                "\nTax: " + tax() + "\nBonus: " + bonus() + "\nsalary increase: " + raiseSalary() +
                "\nSalary including tax and bonus: " + (this.salary + bonus() - tax()) +
                "\nNet Salary: " + (this.salary + raiseSalary());
    }
}
