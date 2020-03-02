package hunb.mutation_pi.systemTest.feature;

import hunb.mutation_pi.Integrataion;
import io.cucumber.java.hu.*;

import static org.junit.jupiter.api.Assertions.*;

public class SystemTest {

	Integrataion group = new Integrataion();
	
	@Adott("egy üres csoport")
	public void newEmptyGroup() {
		assertEquals(0, group.getSize());
	}
	
	@Amennyiben("hozzáadok egy főt")
	public void addOnePersonToTheGroup() {
		assertEquals("The group size is: 1", group.newHuman(16, 0, "Wiki"));
	}
	
	@Akkor("a csoport létszáma egy")
	public void groupSize1() {
		assertEquals(1, group.getSize());
	}
}
