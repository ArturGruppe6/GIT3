package at.jku.ce;

public class DomainObject {

	public DomainObject() {
		super();
	}
	
	private String id;
	private String name;
	
	public DomainObject(String id) {
		
		super(); this.id = id;
		
	}

	public String getId() { 
		return id;
	}
	
	

}
