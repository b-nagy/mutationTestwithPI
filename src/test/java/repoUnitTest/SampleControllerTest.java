package repoUnitTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hunb.mutation_pi.SampleController;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleControllerTest {

/* vscode.dev */

	@DisplayName("Test negative result 1")
	@Test
	public void negativeResult1() {
		assertEquals(-1, new SampleController().sampleLogic(1, 0));
	}
	
	@DisplayName("Test negative result 2")
	@Test
	public void negativeResult2() {
		assertEquals(-2, new SampleController().sampleLogic(1, 1));
	}
	
	@DisplayName("Test positive result 1")
	@Test
	public void positiveResult1() {
		assertEquals(2, new SampleController().sampleLogic(2, 0));
	}
	
	@DisplayName("Test positive result 2")
	@Test
	public void positiveResult2() {
		assertEquals(1, new SampleController().sampleLogic(0, -1));
	}
	
	@DisplayName("Test positive result 3")
	@Test
	public void positiveResult3() {
		assertEquals(1, new SampleController().sampleLogic(-1, 0));
	}
	
	@DisplayName("Test zero result 1")
	@Test
	public void zeroResult1() {
		assertEquals(0, new SampleController().sampleLogic(0, 0));
	}
	
	@DisplayName("Test zero result 2")
	@Test
	public void zeroResult2() {
		assertEquals(0, new SampleController().sampleLogic(1, -1));
	}
}
