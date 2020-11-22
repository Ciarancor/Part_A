/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ciaran
 */
import java.util.*;
import org.joda.time.DateTime;

public class Course {
    private String name;
    private DateTime startDate;
    private DateTime endDate;
    private String moduleString = "";
    private String studentString = "";
    private List<Student> students = new ArrayList<Student>();
    private List<Modules> modules = new ArrayList<Modules>();

    public Course(String name, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public void addStudent(Student student){
        students.add(student);
        student.addModules(modules);
       
        for (int i=0; i<modules.size(); i++){
            modules.get(i).addStudent(student);
        }
    }
    
    public void addModule(Modules module){
        modules.add(module);
        module.addCourse(this);
    }

    public String getName() {
        return name;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public String getModuleString() {
        return moduleString;
    }

    public String getStudentString() {
        return studentString;
    }
    
    
    
    public String getModules(){
        for (int i=0; i<modules.size(); i++){
            moduleString += modules.get(i).getName()+ " ";
        }
        return moduleString;
    }
    public String getStudents(){
        for (int i=0; i<students.size(); i++){
            studentString += students.get(i).getUsername()+ " ";
        }
        return studentString;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", students=" + getStudents() + ", modules=" + getModules() + '}';
    }
    
    
    
    
    
}
