package at.jku.ce;

public class DomainObject {
/** * Default constructor */

	public DomainObject() {
		super();
	}


	public String id = UUID.randomUUID().toString()


	public String uuid;

	private String name;

	
	public DomainObject(String name, String comment)s {
		
		super(); this.uuid = id;
		
	}

	public String getUuid()() { 
		return uuid;
	}
	
	

}
