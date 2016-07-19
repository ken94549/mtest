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
}
