package jun.yu.maven.test.PowerMockito;

import static org.junit.Assert.fail;

import org.testng.annotations.Test;

public class Human2Test {
  @Test(groups={"function"})
  public void testHuman() {
      Human2 john = new Human2("John");
      //john.buyPuppy("Gatsby");
      //add comments
  }
  
  @Test
  public void testAge() {
      Human john = new Human("John");
      john.setAge(10);
      john.getAge();
  }
  
  
}
