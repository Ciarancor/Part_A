/**
 *
 * @author Ciaran Corcoran - 17371636
 */

import java.util.ArrayList;
import java.util.List;

public class Student {
    
    private String fName;
    private String surname;
    private String dob;
    private int age;
    private int id;
    private String username;
    private String moduleString = "";  // string to add moules to for printing
    private List<Modules> modules = new ArrayList<Modules>(); // array of modules that student takes

    public Student(String fName, String surname, String dob, int age, int id) {
        this.fName = fName;
        this.surname = surname;
        this.dob = dob;
        this.age = age;
        this.id = id;
        createUsername(); // generates username for student
    }
    
    public String createUsername(){
        username = surname + age;
        return username;
    }
    
    public void addModules(List<Modules> modules){ // function to add modules to student. used by Course when student is added 
        this.modules=modules;
    }

    public String getfName() {
        return fName;
    }

    public String getSurname() {
        return surname;
    }

    public String getDob() {
        return dob;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    
    public String getModules(){  // converts module array to string for printing
        for (int i=0; i<modules.size(); i++){
            moduleString += modules.get(i).getName()+ " ";
        }
        return moduleString;
    }

    
    @Override
    public String toString() {
        return "Student{" + "fName=" + fName + ", surname=" + surname + ", dob=" + dob + ", age=" + age + ", id=" + id + ", username=" + username + ", Modules= " + getModules() + '}';
    }  
}
