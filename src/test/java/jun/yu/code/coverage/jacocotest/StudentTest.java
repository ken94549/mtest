package jun.yu.code.coverage.jacocotest;

import org.testng.annotations.Test;
import jun.yu.code.coverage.jacocotest.Student;

public class StudentTest {
	
    @Test(groups={"function"})
    public void testStudent() {
    	Student home = new Student(1, "James", 619, "94111");
        String address=home.getAddress();
        String city=home.getCity();
        home.setState("94123");
        home.setAddress(address);
        home.setCity(city);
    }

}
