package model.interfaces;

import java.util.Set;

import model.entities.Student;
import model.enums.Subject;

public interface InterfaceStudent {

   Set<Subject> materias();
    int compareTo(Student other);
  
    void addSubject(Subject subject);

    public void removeSubject(Subject subject);
}
