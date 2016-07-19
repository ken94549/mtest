package jun.yu.maven.test.PowerMockito;

import org.testng.annotations.Test;

public class HumanTest {
  @Test(groups={"function"})
  public void testHuman() {
      Human john = new Human("John");
      //john.buyPuppy("Gatsby");
  }
}
