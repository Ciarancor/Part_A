
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ciaran
 */
public class Modules {
    private String name;
    private int id;
    private String associatedModules = "";
    private String studentString = "";
    private String coursesString = "";
    private List<Student> students = new ArrayList<Student>();
    private List<Course> courses = new ArrayList<Course>();

    public Modules(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void addStudent(Student student){
        students.add(student);
    }
    
    public void addCourse(Course course){
        courses.add(course);
    }
    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAssociatedModules() {
        return associatedModules;
    }
    
    public String getCourses(){
        for (int i=0; i<courses.size(); i++){
            coursesString += courses.get(i).getName()+ " ";
            associatedModules += courses.get(i).getModuleString();
        }
        return coursesString;
    }
    public String getStudents(){
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
