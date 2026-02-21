package model.entities;


public class Employee {
    protected  String Name;
    protected Integer ID;
    protected Integer YearsOfService;
    protected Double Salary;
    
    public Employee(String name, Integer iD, Integer yearsOfService, Double salary) {
        Name = name;
        ID = iD;
        YearsOfService = yearsOfService;
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    public Integer getYearsOfService() {
        return YearsOfService;
    }

    public void setYearsOfService(Integer yearsOfService) {
        YearsOfService = yearsOfService;
    }

     public Double getSalary() {
        return Salary;
    }


    public void setSalary(Double salary) {
        Salary = salary;
    }

    public double SalaryEmployee(){
        if (this.YearsOfService>3) {
         return Salary+(0.20*this.Salary);
        }
        return Salary;
    }


   
}
