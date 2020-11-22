/**
 *
 * @author Ciaran Corcoran - 17371636
 */

import org.joda.time.DateTime;
import org.junit.*;

public class JUnitTest {
    
    @Test
    public void JUnitTest() {
        Course ECE = new Course("ECE", new DateTime("2020-09-01"), new DateTime("2020-05-30"));
         
        Modules comps = new Modules("Comps", 387964);
                
        Student student1 = new Student("Mary", "Jo", "dob", 23, 1234);
        
        ECE.addModule(comps);  // adds module t course
        ECE.addStudent(student1);   // adds student to course
        
        System.out.println(ECE);
        System.out.println(comps);
        System.out.println(student1);
         
    }

}
