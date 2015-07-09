package Test1;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BUTest.class, CUTest.class })
public class AllTests {
	
		 public static Test suite() { 
	    TestSuite suite = new TestSuite("EV---->CU AND BU testing!!");
	    suite.addTest(suite);
	    return suite;
	}
	
}
