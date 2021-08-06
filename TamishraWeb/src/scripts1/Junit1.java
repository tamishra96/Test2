package scripts1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit1 {

	@Before//pre-conditions
	public void setUp() throws Exception {
		
		System.out.println("before");
	}

	@After//post-conditions
	public void tearDown() throws Exception {
		
		System.out.println("after");
	}

	@Test//actual logic
	public void test() {
		
		System.out.println("test");
		
	}

}
