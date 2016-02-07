package net.kata;

import static org.easymock.EasyMock.*;
import org.junit.*;

public class EasyMockTest {

	private ClassUnderTest classUnderTest;
	private Collaborator mock;
	
	@Before
	public void setUp() {
	  mock = mock(Collaborator.class); // 1
	  classUnderTest = new ClassUnderTest();
	  classUnderTest.setListener(mock);
	}

	@Test
	public void testRemoveNonExistingDocument() {
	  // 2 (we do not expect anything)
	  replay(mock); // 3
	  classUnderTest.removeDocument("Does not exist");
	}
	
}
