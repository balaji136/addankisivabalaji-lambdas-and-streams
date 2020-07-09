package lambdas_streams;


import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



	class Checker{
		static boolean isPalindrome(String s){
			return s.trim().equals(new StringBuilder(s).reverse().toString().trim());
		}
			
		
	}
    public class Palindrome{
    	public static final Logger LOG3=LogManager.getLogger(Palindrome.class);
		public static void main3()
		{
			Scanner s3=new Scanner(System.in);
			try {
			
			List<String> strings=new ArrayList<String>();
			LOG3.info("enter n:");
			int n=s3.nextInt();
			LOG3.info("enter "+n+" strings:");
			for(int i=0;i<n;i++)
			{
				strings.add(s3.next());
			}
			
			List<String> palindromes=strings.stream()
											.filter(str->! str.trim().isEmpty())
											.filter(Checker::isPalindrome)
											.collect(Collectors.toList());
			LOG3.info("palindromes : "+palindromes);
			}
			
			catch(Exception E)
			{
				LOG3.info("Exception");
				
			}
		}
		
	}


