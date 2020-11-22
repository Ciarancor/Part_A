/**
 *
 * @author Ciaran Corcoran - 17371636
 */

import java.util.ArrayList;
import java.util.List;

public class Modules {
    private String name;
    private int id;
    private String associatedModules = "";  // strings for printing arrays
    private String studentString = "";
    private String coursesString = "";
    private List<Student> students = new ArrayList<Student>();  // array of students taking the module
    private List<Course> courses = new ArrayList<Course>();  // array of courses this module is in

    public Modules(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void addStudent(Student student){  // used by Course to auto add students to module
        students.add(student);
    }
    
    public void addCourse(Course course){  // used by Course to auto add itself to module
        courses.add(course);
    }
    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAssociatedModules() {  // Course gives it modules also in the course
        return associatedModules;
    }
    
    public String getCourses(){  // converts cours array to string and returns it
        for (int i=0; i<courses.size(); i++){
            coursesString += courses.get(i).getName()+ " ";
            associatedModules += courses.get(i).getModuleString();
        }
        return coursesString;
    }
    public String getStudents(){  // converts student arry to string and returns it
        for (int i=0; i<students.size(); i++){
            studentString += students.get(i).getUsername()+ " ";
        }
        return studentString;
    }
    
    @Override
    public String toString() {
        return "Modules{" + "name=" + name + ", id=" + id + ", courses=" + getCourses()+ ", associatedModules=" + associatedModules + ", students=" + getStudents() + '}';
    }
    
}
