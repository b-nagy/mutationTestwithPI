package hunb.mutation_pi.systemTest.groupSizeManagementFeature;

import hunb.mutation_pi.Group;
import io.cucumber.java.hu.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GroupSizeManagementSteps {

	Group group;
	
	@BeforeEach
	@Adott("egy üres csoport")
	public void newEmptyGroup() {
		group = new Group();
		assertEquals(0, group.getSize());
	}
	
	@Test
	@Amennyiben("hozzáadok egy főt")
	public void addOnePersonToTheGroup() {
		assertEquals("The group size is: 1", group.newHuman(16, 0, "Wiki"));
	}
	
	@Test
	@Adott("egy három fős csoport")
	public void newGroupWithThreePerson() {
		group = new Group();
		assertEquals("The group size is: 1", group.newHuman(16, 0, "Wiki"));
		assertEquals("The group size is: 2", group.newHuman(18, 0, "Joe"));
		assertEquals("The group size is: 3", group.newHuman(14, 0, "Adam"));
	}
	
	@Amennyiben("egy főt elveszek belőle")
	public void onePersonLeavesTheGroup() {
		assertEquals("Adam:14 removed from group", group.removeHuman(14, "Adam"));
	}
	
	@Test
	@Amennyiben("a csoportot kiürítem")
	public void removeAllPersonFromTheGroup() {
		assertEquals(0, group.clearGroup());
	}
	
	@Amennyiben("hozzáadok öt főt")
	public void addFivePersonToTheGroup() {
		for (int i = 0; i < 5; i++) 
			assertEquals("The group size is: " + (i+1), group.newHuman(2, 0, "Wiki"));
	}
	
	
	@Akkor("a hatodik fő hozzáadásánál hibaüzenetet kapok")
	public void maximumLimitValidation() {
		assertEquals("The group is full", group.newHuman(2, 0, "Wiki"));
	}
	
	@Akkor("a csoport létszáma: {int}")
	public void groupSize(int size) {
		assertEquals(size, group.getSize());
	}
	
}
