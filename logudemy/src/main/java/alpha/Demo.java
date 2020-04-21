package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo 
{  
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) 
	{
		
		// BasicConfigurator.configure();
		log.error("this is error message");
		log.debug("this is debug message");
		log.warn("this is warn message");
		log.error("this is error message");
		log.error("this is error message");
	}
}
