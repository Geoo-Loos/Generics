package model.interfaces;

import java.util.Set;

import model.entities.student;
import model.enums.Subject;

public interface InterfaceStudent {

   Set<Subject> materias();
    int compareTo(student other);
  
    
}
