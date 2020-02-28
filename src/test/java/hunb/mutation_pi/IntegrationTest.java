package hunb.mutation_pi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest {
	
	@DisplayName("new Human with SampleController")
	@Test
	public void newHumanWithSampleController() {
		Integrataion integ = new Integrataion();
		Human testHuman = integ.newHuman(2, 0);
		assertEquals(testHuman.getAge(), 2);
	}

}
