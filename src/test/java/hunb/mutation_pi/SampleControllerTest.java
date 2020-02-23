package hunb.mutation_pi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleControllerTest {

	@DisplayName("Test negative result 1")
	@Test
	public void negativResult1() {
		assertEquals(-1, new SampleController().sampleLogic(1, 0));
	}
	
	@DisplayName("Test negative result 2")
	@Test
	public void negativResult2() {
		assertEquals(-2, new SampleController().sampleLogic(1, 1));
	}
	
	@DisplayName("Test positive result 1")
	@Test
	public void positivResult1() {
		assertEquals(2, new SampleController().sampleLogic(2, 0));
	}
	
	@DisplayName("Test positive result 2")
	@Test
	public void positivResult2() {
		assertEquals(1, new SampleController().sampleLogic(0, -1));
	}
	
	@DisplayName("Test positive result 3")
	@Test
	public void positivResult3() {
		assertEquals(1, new SampleController().sampleLogic(-1, 0));
	}
	
	@DisplayName("Test positive result 4")
	@Test
	public void positivResult4() {
		assertEquals(2, new SampleController().sampleLogic(-1, -1));
	}
	
	@DisplayName("Test null result 1")
	@Test
	public void nullResult1() {
		assertEquals(0, new SampleController().sampleLogic(0, 0));
	}
	
	@DisplayName("Test null result 2")
	@Test
	public void nullResult2() {
		assertEquals(0, new SampleController().sampleLogic(1, -1));
	}
	
}
