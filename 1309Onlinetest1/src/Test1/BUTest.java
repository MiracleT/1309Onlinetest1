package Test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BUTest {
BU b=new BU();
	@Test
	public void testEnablePolling() {
		//fail("Not yet implemented");
		assertEquals(false, b.enablePolling(true));
	}


}
