import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {

	@Test
	public void testToDegrees() {
		Conversor c=new Conversor();
		double output=c.toDegrees(14.59);
		assertEquals(c.toDegrees(14.59),output,2);
		
		
	}
	@Test
    public void testToRadians (){
		Conversor c=new Conversor();
		double output=c.toRadians(3.0);
		assertEquals(c.toRadians(3.0),output,2);
		
	}

}
