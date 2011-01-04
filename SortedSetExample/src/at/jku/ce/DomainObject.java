package at.jku.ce;

public class DomainObject {
/** * Default constructor */

	public DomainObject() {
		super();
	}


	public String id = UUID.randomUUID().toString()


	public String uuid;

	private String name;

	public String getName() { return name; }

	public void setName(final String name) { this.name = name; }


	
	public DomainObject(final String name, String comment)s {
		
		super(); this.uuid = id;
		
	}

	public String getUuid()() { 
		return uuid;
	}


	private String comment;

	public String getComment() {

		return comment;

	}

	public void setComment(String comment) {

		this.comment = comment;

	}
	
	public String toString() { return "DomainObject [name=" + name + ", comment=" + comment + ", uuid=" + uuid + "]"; }

public boolean equals(Object obj) { if (!(obj instanceof DomainObject)) { return false; } DomainObject domainObj = (DomainObject) obj; return uuid.equals(domainObj.getUuid()); }

}
