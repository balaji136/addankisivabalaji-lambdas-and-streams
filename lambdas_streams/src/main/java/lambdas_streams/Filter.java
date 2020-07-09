package lambdas_streams;
import java.util.*;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Filter {
	public static final Logger LOG2=LogManager.getLogger(Filter.class);
	public static void main2()
	{
		Scanner s2=new Scanner(System.in);
		try {
			
		
		
		List<String> strings=new ArrayList<String>();
		LOG2.info("Enter n:");
		int n=s2.nextInt();
		LOG2.info("Enter "+n+" strings:");
		for(int i=0;i<n;i++)
		{
			strings.add(s2.next());
		}
		List<String> Length3_startingWitha=strings.stream()
																   .filter(str->!str.isEmpty() && str.startsWith("a") && str.length()==3)
																   .collect(Collectors.toList());
		
		LOG2.info("Strings starting with 'a' and with length 3 : "+Length3_startingWitha);
		}
		catch(Exception E)
		{
			LOG2.info("Exception");
			
		}
	}
	
	
	
}
