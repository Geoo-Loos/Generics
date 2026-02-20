package model.entities;


import java.util.Comparator;
import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

import model.enums.Salas;
import model.enums.Subject;
import model.interfaces.InterfaceStudent;

public class student implements InterfaceStudent, Comparable<student>{
    private Integer ID;
    private String Name;
     Salas salas;
    
     Set<Subject> subject=new HashSet<>();
    
     public student(Integer iD,String name, Salas salas) {
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
        student other = (student) obj;
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
    public int compareTo(student other) {
         return Comparator
            .comparing(student::getName)
            .thenComparing(student::getID)
            .compare(this, other);
        //return this.Name.compareTo(other.Name);
    }


}
