package lambdas_streams;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Play {
	public static final Logger LOG=LogManager.getLogger(Play.class);
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		try {
		BufferedReader breader =new BufferedReader(new InputStreamReader(System.in));
		LOG.info("1. Find average of given list of numbers: ");
		LOG.info("2. Filter Strings - Starting with 'a' and of length 3: ");
		LOG.info("3. Find palindromes from the given set of strings: ");
		LOG.info("4. Exit");
		LOG.info("Enter your choice : ");
		
		int i;
		
		i=Integer.parseInt(breader.readLine());
		do {
			
			
		switch(i) {
		case 1:
			LOG.info("Find average of given list of numbers: ");
			Average.main1();
			break;
			
		case 2:
			LOG.info("Filter Strings - Starting with 'a' and of length 3: ");
			Filter.main2();
			break;
			
		case 3:
			LOG.info("Find palindromes from the given set of strings: ");
			Palindrome.main3();
			break;
		
			
		default:  
			LOG.info("Enter a valid choice!");
		}
		LOG.info("1. Find average of given list of numbers: ");
		LOG.info("2. Filter Strings - Starting with 'a' and of length 3: ");
		LOG.info("3. Find palindromes from the given set of strings: ");
		LOG.info("4. Exit");
		LOG.info("Enter your choice : ");
		i=Integer.parseInt(breader.readLine());
		}while(i!=4);
		LOG.info("Exit");
		breader.close();
		}
		catch(Exception e) {
			LOG.info("Exception");
		}
	}

}
