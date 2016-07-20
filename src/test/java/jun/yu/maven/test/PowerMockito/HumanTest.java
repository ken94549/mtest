package jun.yu.maven.test.PowerMockito;

import static org.junit.Assert.fail;

import org.testng.annotations.Test;

public class HumanTest {
  @Test(groups={"function"})
  public void testHuman() {
      Human john = new Human("John");
      //john.buyPuppy("Gatsby");
  }
  
  @Test
  public void testAge() {
      Human john = new Human("John");
      john.setAge(10);
      john.getAge();
  }
  
  @Test
  public void testAddress() {
      Human john = new Human("John");
      john.setAddress("san francisco");
      john.getAddress();
  }
  
  @Test(enabled=false)
  public void testTelephone() {
      Human john = new Human("John");
      john.setTelephone("925");
      john.getTelephone();
  }
}
