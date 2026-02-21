package model.entities;


import java.util.Comparator;
import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

import model.enums.Salas;
import model.enums.Subject;
import model.interfaces.InterfaceStudent;

public class Student implements InterfaceStudent, Comparable<Student>{
    private Integer ID;
    private String Name;
    private Salas salas;
    
     Set<Subject> subject=new HashSet<>();
    
     public Student(Integer iD,String name, Salas salas) {
        ID = iD;
       this.salas =salas;
       Name=name;
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

    
     public Salas getSalas() {
        return salas;
    }


     public void setSalas(Salas salas) {
         this.salas = salas;
     }


     @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ID == null) ? 0 : ID.hashCode());
        return result;
    }


     @Override
     public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (ID == null) {
            if (other.ID != null)
                return false;
        } else if (!ID.equals(other.ID))
            return false;
        return true;
     }

    
     @Override
    public Set<Subject> materias(){
        return new TreeSet<>(subject);//passando para garantir ordenação e ainda ultilizar hash antes;
    }
    @Override
    public void addSubject(Subject subject) {
    this.subject.add(subject);
   }

   @Override
    public void removeSubject(Subject subject) {
    this.subject.remove(subject);
   }
   
    @Override
    public int compareTo(Student other) {
         return Comparator
            .comparing(Student::getName)
            .thenComparing(Student::getID)
            .compare(this, other);
        //return this.Name.compareTo(other.Name);
    }


}
