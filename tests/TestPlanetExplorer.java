import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	/*@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void testOnceForward(){
		
		PlanetExplorer explorer = new PlanetExplorer(3,3);
		//"("+trenutnaX+","+trenutnaY+","+facing+")"
		String ocekivano="(0,1,N)";
		assertEquals(ocekivano,explorer.executeCommand("f"));
		
		
		
		
	}
}
