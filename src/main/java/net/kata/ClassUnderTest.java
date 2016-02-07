package net.kata;

/**
 * 
 * @author Guillaume
 * @see http://easymock.org/user-guide.html
 */
public class ClassUnderTest {

	private Collaborator collaborator;

	public void setListener(Collaborator collaborator) {
		this.collaborator = collaborator;
	}

	public void removeDocument(String string) {
//		collaborator.display(string);
	}

}
