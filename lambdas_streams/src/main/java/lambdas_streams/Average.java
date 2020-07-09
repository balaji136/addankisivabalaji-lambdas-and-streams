package lambdas_streams;

import java.util.*;
import java.util.function.Predicate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Average {
	public static final Logger LOG1=LogManager.getLogger(Average.class);
		public static void main1()
		
		{
			
			Scanner s1=new Scanner(System.in);
			LOG1.info("enter n:");
			try {	
			int n=s1.nextInt();
			LOG1.info("enter "+n+" integers:");
			List<Integer> numbers_list=new ArrayList<Integer>();
			for(int i=0;i<n;i++)
			{
				numbers_list.add(s1.nextInt());
			}
			
			
			float avg=findAverage(numbers_list,(Integer i)->	 { Optional<Integer> opt=Optional.ofNullable(i); return opt.isPresent();} );
			LOG1.info("Average :"+avg);
			}
			catch(Exception E)
			{
				LOG1.info("Exception");
			}
		}
		
		
		public static float findAverage(List<Integer> numbers_list,Predicate<Integer> p)
		{
			
			int res_sum=0;
			int count=0;
			for(Integer i: numbers_list)
			{
				if(p.test(i))
				{
					res_sum+=i;
					count+=1;
				}
			}
			if(count==0) 
				count=1;
			return ((float)res_sum/count);
		}
}


