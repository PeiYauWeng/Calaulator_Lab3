package Calculator_OPT;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class CalculatorTest {

	private operation opt;
	
	@Before
	public void setup() {
		opt = new operation();
	}
	
	@Test
	public void Addition_test() {
		assertEquals("5+5=10.0", opt.evaluate("5+5"));
	}
	
	@Test
	public void Subtraction_test() {
		assertEquals("5-5=0.0", opt.evaluate("5-5"));
	}

}
