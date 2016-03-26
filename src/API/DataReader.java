package API;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String Path = "C:\\Users\\Syeda\\July2015 Selenium\\sample.text";
		FileReader fr = null;
		BufferedReader br = null;
		try{
			fr = new FileReader(Path);
		}
		catch(FileNotFoundException e){
			System.out.println("Fill is not found");
			e.printStackTrace();	
		}
		br = new BufferedReader(fr);
		String text = "";
		
		try{
			while((text = br.readLine())!=null){
			System.out.println(text);	
			}
		}
		catch(IOException e){
			e.printStackTrace();		
		}
		
		finally{
			try{
				if(fr!=null){
					fr.close();
				}	
			}catch(IOException e){
				e.printStackTrace();
			}
			try{
				if(br!=null){
					br.close();
				}	
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
