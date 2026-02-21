package application;


import java.util.Set;
import java.util.TreeSet;

import model.entities.Student;
import model.entities.Teacher;
import model.enums.Salas;
import model.enums.Subject;
import model.services.EntitiesService;

public class Main {
    public static void main(String[] args) {
        EntitiesService<Teacher> entitiesService=new EntitiesService<>();

        Teacher T1=new Teacher("Geovanna", 1, 4, 1900.00);
        Teacher T2=new Teacher("Gabriella", 2, 7, 2500.00);
        Teacher T3=new Teacher("Giomar", 3, 1, 1500.00);
        
        entitiesService.add(T1);
        entitiesService.add(T2);
        entitiesService.add(T3);
    
        T3.addSubject(Subject.MATEMATICA);
        T3.addSubject(Subject.POO);

        System.out.println("Disciplinas de " + T3.getName() + ":");
        for (Subject s : T3.getSubjectsTaught()) {
            System.out.println(s);
        }
           
        T3.addClasses(Salas.SALA_A);
        T3.addClasses(Salas.SALA_B);

         System.out.println("\nSalário calculado:");
        System.out.println(T3.SalaryEmployee());

        Student s1 = new Student(1, "Ana", Salas.SALA_A);
        Student s2 = new Student(2, "Carlos", Salas.SALA_B);
        Student s3 = new Student(3, "Bruno", Salas.SALA_C);
        Student s4 = new Student(1, "Ana", Salas.SALA_C);

         Set<Student> hashSet = new TreeSet<>();
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);

         for (Student s : hashSet) {
            System.out.println(s.getName() + " - ID: " + s.getID());
        }

        s1.addSubject(Subject.MATEMATICA);
        s1.addSubject(Subject. HARDWARE);
        s1.addSubject(Subject. SOFTWARE);

         System.out.println("\nMatérias de " + s1.getName() + ":");
        for (Subject sub : s1.materias()) {
            System.out.println(sub);
        }

        s1.removeSubject(Subject.MATEMATICA);

        for (Subject sub : s1.materias()) {
            System.out.println(sub);
        }
}}
