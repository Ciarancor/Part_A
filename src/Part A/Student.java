
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ciaran
 */
public class Student {
    
    private String fName;
    private String surname;
    private String dob;
    private int age;
    private int id;
    private String username;
    private String moduleString = "";
    private List<Modules> modules = new ArrayList<Modules>();

    public Student(String fName, String surname, String dob, int age, int id) {
        this.fName = fName;
        this.surname = surname;
        this.dob = dob;
        this.age = age;
        this.id = id;
        createUsername();
    }
    
    public String createUsername(){
        username = surname + age;
        return username;
    }
    
    public void addModules(List<Modules> modules){
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
    
    public String getModules(){
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
