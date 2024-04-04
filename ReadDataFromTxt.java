package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ReadDataFromTxt {
	
	String str="";
	
	public void m() throws IOException
	{
		FileReader file=new FileReader("C:\\Users\\ANIL\\eclipse-workspace\\Selenium4\\TestData");
		BufferedReader br = new BufferedReader(file);
		
			while ((str=br.readLine())!=null)
			{
				//System.out.println(str);
				split();
			}
			
	}
	
	public void split()
	{
		String a[]=str.split(":");
		List<String> list=new ArrayList<String>();
		
		for (int i = 0; i < a.length; i++) {
			
			//System.out.println(a[i]);
			list.add(a[i]);
		
		}
		System.out.println(list);
		map();
		
	}
	public void map()
	{
		HashMap<String, String> map=new HashMap<String, String>();
		String [] keyvalue = null ;
		map.put(keyvalue[0], keyvalue[1]);
		
		
	}
	
		
	public static void main(String[] args) 
	{
		
		ReadDataFromTxt test= new ReadDataFromTxt();
		try {
			test.m();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
		

	}


