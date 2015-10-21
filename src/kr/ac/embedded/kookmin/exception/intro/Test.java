package kr.ac.embedded.kookmin.exception.intro;

import java.io.*;
public class Test{
	public static void main(String[] args){
		
		String fname="C:/Users/dltjxor/git/Mobile-Programming-2015/src/kr/ac/embedded/kookmin/exception/intro/a.text";
		try
		{
		File f = new File(fname);
		
		FileReader fileReader = new FileReader(f);
		BufferedReader reader = new BufferedReader(fileReader);
		
		String line = null;
		while((line = reader.readLine())!=null)
{
	System.out.println(line);
}reader.close();
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("무조건출력합니다");
		}
}
}

