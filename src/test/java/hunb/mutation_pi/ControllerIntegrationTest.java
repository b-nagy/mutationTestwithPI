package hunb.mutation_pi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControllerIntegrationTest {

	@DisplayName("integration Say : HELLO!")
	@Test
	public void intTestSayHello() {
		String message = new SampleController2().message(new SampleController().sampleLogic(2, 0));
		assertEquals(message, "HELLO!");
	}
	
	@DisplayName("integration Say : GOOD BYE!")
	@Test
	public void intTestSayGoodBye() {
		String message = new SampleController2().message(new SampleController().sampleLogic(2, 1));
		assertEquals(message, "GOOD BYE!");
	}
	
}
