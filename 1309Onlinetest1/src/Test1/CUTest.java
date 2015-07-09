package Test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CUTest {
CU c=new CU();
	@Test
	public void testEnablePolling() {
		assertEquals(false, c.enablePolling(true));
	}

	@Test
	public void testCheckTotal() {
		assertEquals("**",2, c.checkTotal());
	}

}
