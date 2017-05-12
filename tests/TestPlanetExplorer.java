import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	/*@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void testOnceForwardWithoutObstacles(){
		
		PlanetExplorer explorer = new PlanetExplorer(3,3);
		//"("+trenutnaX+","+trenutnaY+","+facing+")"
		String ocekivano="(0,1,N)";
		assertEquals(ocekivano,explorer.executeCommand("f"));
		
	}
	@Test
	public void testOnceBackwardWithoutObstacles(){
		
		PlanetExplorer explorer = new PlanetExplorer(3,3);
		//"("+trenutnaX+","+trenutnaY+","+facing+")"
		String ocekivano="(0,0,N)";
		explorer.executeCommand("f");
		assertEquals(ocekivano,explorer.executeCommand("b"));
		
	}
	
	@Test
	public void testOverEdgeForward(){
		
		PlanetExplorer explorer = new PlanetExplorer(3,3);
		//"("+trenutnaX+","+trenutnaY+","+facing+")"
		String ocekivano="(0,0,N)";
		explorer.executeCommand("f");
		explorer.executeCommand("f");
		explorer.executeCommand("f");
		assertEquals(ocekivano,explorer.executeCommand("f"));
		
	}
	
	@Test
	public void testOverEdgeBackward(){
		
		PlanetExplorer explorer = new PlanetExplorer(3,3);
		//"("+trenutnaX+","+trenutnaY+","+facing+")"
		String ocekivano="(0,2,N)";
		assertEquals(ocekivano,explorer.executeCommand("b"));
		
	}
	@Test
	public void testFacingEast(){
		
		PlanetExplorer explorer = new PlanetExplorer(3,3);
		//"("+trenutnaX+","+trenutnaY+","+facing+")"
		String ocekivano="(0,0,E)";
		assertEquals(ocekivano,explorer.executeCommand("r"));
		
	}
	@Test
	public void testFacingWest(){
		
		PlanetExplorer explorer = new PlanetExplorer(3,3);
		//"("+trenutnaX+","+trenutnaY+","+facing+")"
		String ocekivano="(0,0,E)";
		assertEquals(ocekivano,explorer.executeCommand("r"));
		
	}
	
}
