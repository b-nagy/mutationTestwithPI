package hunb.mutation_pi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleController2Test {
	
	@DisplayName("Say : HELLO!")
	@Test
	public void sayHello1() {
		String message = new SampleController2().message(0);
		assertEquals(message, "HELLO!");
		
		String message2 = new SampleController2().message(2);
		assertEquals(message2, "HELLO!");
	}
	
	@DisplayName("Say : GOOD BYE!")
	@Test
	public void sayGoodBye1() {
		String message = new SampleController2().message(1);
		assertEquals(message, "GOOD BYE!");
	}

}
