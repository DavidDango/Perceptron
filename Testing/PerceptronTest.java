package Testing;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Neural.*;

public class PerceptronTest {
	Percept pAND = new AndPerceptron();
	Percept pOR = new OrPerceptron();
	Percept pNAND = new NAndPerceptron();
	SummingPerceptron pSum = new SummingPerceptron(pNAND);
	static int[] result;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		result = new int[2];
	}

	@Test
	public void testAnd() {
		assertEquals(pAND.process(0,0), 0);
		assertEquals(pAND.process(0,1), 0);
		assertEquals(pAND.process(1,0), 0);
		assertEquals(pAND.process(1,1), 1);
	}
	
	@Test
	public void testOr() {
		assertEquals(pOR.process(0,0), 0);
		assertEquals(pOR.process(0,1), 1);
		assertEquals(pOR.process(1,0), 1);
		assertEquals(pOR.process(1,1), 1);
	}
	
	@Test
	public void testNand() {
		assertEquals(pNAND.process(0,0), 1);
		assertEquals(pNAND.process(0,1), 1);
		assertEquals(pNAND.process(1,0), 1);
		assertEquals(pNAND.process(1,1), 0);
	}
	
	@Test
	public void testSum() {
		result[0] = 0;
		result[1] = 0;
		assertArrayEquals(pSum.sum(0,0), result);
		result[0] = 1;
		result[1] = 0;
		assertArrayEquals(pSum.sum(1,0), result);
		result[0] = 1;
		result[1] = 0;
		assertArrayEquals(pSum.sum(0,1), result);
		result[0] = 0;
		result[1] = 1;
		assertArrayEquals(pSum.sum(1,1), result);
	}
}
