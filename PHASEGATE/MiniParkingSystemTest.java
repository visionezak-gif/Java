import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MiniParkingSystemTest{

	@Test
	public void testThatACarCanBeParkedInMySlot(){
	
		
		
		int actual = MiniParkingSystem.getASlot( int [] slots);
		int expected = 20 ;
	
	
		assertEquals(actual, expected);
	}		


}
