package jun.yu.maven.test.easymock.test;

import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import jun.yu.maven.test.easymock.ICalcMethod;
import jun.yu.maven.test.easymock.IncomeCalculator;
import jun.yu.maven.test.easymock.Position;

import org.junit.Before;
import org.junit.Test;

public class IncomeCalculatorTest {
private ICalcMethod calcMethod;
private IncomeCalculator calc;

@Before
public void setup() throws Exception {
    calcMethod = createNiceMock(ICalcMethod.class);
    calc = new IncomeCalculator();    
}

@Test
public void testCalc1(){
    expect(calcMethod.calc(Position.BOSS)).andReturn(7000.00).times(2);
    expect(calcMethod.calc(Position.PROGRAMMER)).andReturn(5000.00);
    
    replay(calcMethod);
    calc.setCalcMethod(calcMethod);
    
    calc.setPosition(Position.BOSS);
    assertEquals(7000.0, calc.calc(), 0);
    assertEquals(7000.0, calc.calc(), 0);
    //assertEquals(7000.0, calc.calc(), 0);
    calc.setPosition(Position.PROGRAMMER);
    assertEquals(5000.0, calc.calc(), 0);
    //calc.setPosition(Position.SURFER);
    verify(calcMethod);

/*    try{
        calc.calc();
        fail("excpeiton did not occur");
    }catch(RuntimeException e){
        System.out.println("exception");
    }*/
}

}
