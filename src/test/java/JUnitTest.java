/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.joda.time.DateTime;
import org.junit.*;

/**
 *
 * @author Ciaran
 */
public class JUnitTest {
    
    @Test
    public void JUnitTest() {
        Course ECE = new Course("ECE", new DateTime("2020-09-01"), new DateTime("2020-05-30"));
         
        Modules comps = new Modules("Comps", 387964);
        Modules elec = new Modules("elec", 182787);
         
        Student student1 = new Student("Mary", "Jo", "dob", 23, 1234);
        Student student2 = new Student("Bren", "Fag", "dob", 23, 1234);
        Student student3 = new Student("Ciaran", "Legend", "dob", 23, 1234);
         
        ECE.addModule(comps);
        ECE.addModule(elec);
        ECE.addStudent(student1);
        ECE.addStudent(student2);
        ECE.addStudent(student3);
         
        
        System.out.println(ECE);
        System.out.println(comps.toString());
        System.out.println(student1.toString());
         
    }

}
