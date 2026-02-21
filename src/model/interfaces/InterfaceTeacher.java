package model.interfaces;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

public interface InterfaceTeacher {
    
     public List<Subject> subjects = new ArrayList<>();


    void addSubject(model.enums.Subject subject);

     List< model.enums.Subject> GetSubjectsTeached();




    


   
}
