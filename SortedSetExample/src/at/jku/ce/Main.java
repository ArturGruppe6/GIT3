package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */


	
	
	public static void main(String[] args) {



	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	Set<DomainObject> objectSet = new HashSet<DomainObject>();

	objectSet.add(DomainFactory.createDomainObject("Helga")); 
	objectSet.add(DomainFactory.createDomainObject("Walter")); 
	objectSet.add(DomainFactory.createDomainObject("Hannah")); 
	objectSet.add(DomainFactory.createDomainObject("Paul")); 
	objectSet.add(DomainFactory.createDomainObject("Claudia")); 

	for (DomainObject domainObject : objectSet) {
		LOGGER.debug(domainObject.id); 
	}

	}

}
