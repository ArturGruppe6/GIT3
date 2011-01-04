package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */


	
	
	public static void main(String[] args) {



	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	Set<DomainObject> objectSet = new HashSet<DomainObject>();

	objectSet.add(new DomainObject("Helga")); 
	objectSet.add(new DomainObject("Walter")); 
	objectSet.add(new DomainObject("Hannah")); 
	objectSet.add(new DomainObject("Paul")); 
	objectSet.add(new DomainObject("Claudia")); 

	for (DomainObject domainObject : objectSet) {
		LOGGER.debug(domainObject..getUuid()); 
	}

	}

}
