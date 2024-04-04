package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapAssignmet {
	

	String str1="";

	
	public void m() throws IOException
	{
		FileReader file=new FileReader("C:\\Users\\ANIL\\eclipse-workspace\\Selenium4\\TestData");
		BufferedReader br = new BufferedReader(file);
		
			while ((str=br.readLine())!=null)
			{
				//System.out.println(str);
				
				HashMap<String, String> map=new HashMap<String, String>();
				String [] keyvalue = str.split(":");
				map.put(keyvalue[0], keyvalue[1]);
				
				System.out.println(map);
				
				/*for (Map.Entry<String, String> entry : 
		             map.entrySet()) { 
		            System.out.println(entry.getKey() + " : "
		                               + entry.getValue());
				
			}*/
			}
//code is added here
			
}
	public static void main(String[] args) {
		
		MapAssignmet ma= new MapAssignmet();
		try {
			ma.m();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	}


