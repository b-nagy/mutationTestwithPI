package hunb.mutation_pi.systemTest.groupSearchFeature;

import hunb.mutation_pi.*;
import io.cucumber.java.hu.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class GroupSearchSteps {

	Group group;
	
	@BeforeEach
	@Adott("egy öt fős csoport")
	public void newGroupWithFivePerson() {
		group = new Group();
		assertEquals("The group size is: 1", group.newHuman(16, 0, "Wiki"));
		assertEquals("The group size is: 2", group.newHuman(18, 0, "Joe"));
		assertEquals("The group size is: 3", group.newHuman(14, 0, "Adam"));
		assertEquals("The group size is: 4", group.newHuman(14, 0, "Eva"));
		assertEquals("The group size is: 5", group.newHuman(15, 0, "Mike"));
	}
	
	@Amennyiben("a csoport második tagját keresem")
	public void searchId_2() {
		// ?
	}
	
	public String returnMessage;
	@Amennyiben("név és kor alapján eltávolítok egy főt: {string}-{int}")
	public void removeGetNameAndAge(String rName, int rAge) {
		returnMessage = group.removeHuman(rAge, rName);
	}
	
	@Test
	@Akkor("visszakapom a nevét és életkorát")
	public void getNameAndAge() {
		assertEquals("Joe", group.getHuman(1).getName());
		assertEquals(18, group.getHuman(1).getAge());
	}
	
	@Akkor("kiírja, hogy: {string}")
	public void removeReturnMessage(String expectedMessage) {
		assertEquals(expectedMessage, returnMessage);
	}

}
