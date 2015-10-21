package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

public class AddLineNumber {
	public static void main(String[] args)
	   {
	       String path = AddLineNumber.class.getResource("").getPath();
	       System.out.println(path);
	       int i=1;
	      try
	      {
	         BufferedReader inputStream = 
	               new BufferedReader(new FileReader(path+"original.txt"));
	         PrintWriter outputStream = 
	               new PrintWriter(new FileOutputStream(path+"numbered.txt"));
	         String line = null;
		 		while((line = inputStream.readLine())!=null)
		 		{
		 			
		 			System.out.print(i);
		 			System.out.println(line);
		 			i=i+1;
		 			
		 		};
		 		
		 	outputStream.print(inputStream.readLine());
	         inputStream.close( );
	         outputStream.close( );
	      }
	      catch(Exception e)
	      {
	    	  System.out.println("asdf");
	      }
	      
	    

	   }


}
