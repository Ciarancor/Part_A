
/**
 *
 * @author Ciaran Corcoran - 17371636
 */

import java.util.*;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Course {
    private String name;
    private DateTime startDate;
    private DateTime endDate;
    private String moduleString = "";  // string array of modules arer added to
    private String studentString = "";  // string array of students arer added to
    private List<Student> students = new ArrayList<Student>();  // array of students in this course
    private List<Modules> modules = new ArrayList<Modules>();   // array modules in this course

    public Course(String name, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public void addStudent(Student student){  // adds student to this course
        students.add(student);  // adds student to student array
        student.addModules(modules);  // gives students its modules
       
        for (int i=0; i<modules.size(); i++){
            modules.get(i).addStudent(student);  // adds new student to each module
        }
    }
    
    public void addModule(Modules module){  // adds modules to this course
        modules.add(module);    // adds to courses module array
        module.addCourse(this);  // adds itself to modules array of courses
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
    
    public String getStartDateString() {
        return startDate.toString(DateTimeFormat.shortDate()); // changes format to only show date
    }

    public String getEndDateString() {
        return endDate.toString(DateTimeFormat.shortDate());  // changes format to only show date
    }

    public String getModuleString() {
        return moduleString;
    }

    public String getStudentString() {
        return studentString;
    }
    
    public String getModules(){
        for (int i=0; i<modules.size(); i++){          // converts module to string and returns
            moduleString += modules.get(i).getName()+ " ";
        }
        return moduleString;
    }
    public String getStudents(){    // converts student array to string and returns
        for (int i=0; i<students.size(); i++){
            studentString += students.get(i).getUsername()+ " ";
        }
        return studentString;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", startDate=" + getStartDateString() + ", endDate=" + getEndDateString() + ", students=" + getStudents() + ", modules=" + getModules() + '}';
    }  
}
