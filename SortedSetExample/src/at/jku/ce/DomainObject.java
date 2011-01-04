package at.jku.ce;

public class DomainObject {
/** * Default constructor */

	public DomainObject() {
		super();
	}
	

	public String uuid;

	private String name;
	
	public DomainObject(String id) {
		
		super(); this.uuid = id;
		
	}

	public String getUuid()() { 
		return uuid;
	}
	
	

}
