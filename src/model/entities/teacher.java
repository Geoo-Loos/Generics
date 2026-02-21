package model.entities;

import java.util.ArrayList;
import java.util.List;

import model.enums.Salas;
import model.enums.Subject;
import model.interfaces.InterfaceTeacher;

public class teacher extends employee implements InterfaceTeacher {
 public List<Subject> subjects = new ArrayList<>();
  private List<Salas> sala=new ArrayList<>();

    public teacher(String name, Integer iD, Integer yearsOfService, Double salary) {
        super(name, iD, yearsOfService, salary);
      
    }

    public void addClasses(Salas salas){
        sala.add(salas);
    }

    @Override
     public double SalaryEmployee(){
       int total=0;
       for(Salas s: sala){
         total+=s.getAdicional();
       }
        if (this.YearsOfService>3) {
         return Salary+(0.40*this.Salary)+total;
        }
       
        return Salary+total;
    }
    
  
    @Override
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    @Override
    public List< Subject> GetSubjectsTeached() {
        return subjects;
    }

    
}
