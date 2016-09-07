package coverage2;

import org.testng.annotations.Test;

import coverage2.Home;
    
public class HomeTest {
    
    @Test(groups={"function"})
    public void testHome() {
        Home home = new Home("my home", "619");
        String address=home.getAddress();
        String name=home.getName();
        home.setName(name);
        home.setAddress(address);
        home.setCity("SF");
    }

}