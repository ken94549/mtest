package coverage2;

import org.testng.annotations.Test;

import coverage2.Home;
    
public class HomeTest {
    
    @Test(groups={"function"})
    public void testHome() {
        Home home = new Home("SF", "619", "94111");
        String address=home.getAddress();
        String city=home.getCity();
        home.setState("CA");
        home.setAddress(address);
        home.setCity(city);
    }

}