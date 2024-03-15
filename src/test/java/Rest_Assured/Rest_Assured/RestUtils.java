package Rest_Assured.Rest_Assured;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String getname() {
		String generateName = RandomStringUtils.randomAlphabetic(1);
		return("Dheeraj"+generateName);
	}
	
	public static String getjob() {
		String generateName = RandomStringUtils.randomAlphabetic(1);
		return("jobname"+generateName);
	}

}
