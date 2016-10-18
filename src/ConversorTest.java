import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {

	@Test
	public void testToDegrees() {
		Conversor c=new Conversor();
		double output=c.toDegrees(2.0);
		assertEquals(114.5,output,2);
		
		
	}
	@Test
    public void testToRadians (){
		Conversor c=new Conversor();
		double output=c.toRadians(20.0);
		assertEquals(0.4,output,2);
		
	}

}
