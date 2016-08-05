package jun.yu.maven.test.PowerMockito;

import static org.junit.Assert.fail;

import org.testng.annotations.Test;

public class KenTest {
  @Test(groups={"function"})
  public void testKenGet() {
      Ken k = new Ken();
      k.setName("kk");
      //john.buyPuppy("Gatsby");
  }
}