package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;

/**
 * File을 읽어들이는 Util
 * @author DaeHyeonKim
 */
public class FileReadUtil {

	public static JSONObject readJSON(String path) throws IOException{
		return readJSON(new File(path));
	}//readJSON
	
	public static JSONObject readJSON(File target) throws IOException{
		JSONObject json = null;
		BufferedReader br=null;
		try {
			br = new BufferedReader(new FileReader(target));
			StringBuilder sb = new StringBuilder();
			String line="";
			while((line=br.readLine()) !=null) {
				sb.append(line);
			}//end while
			json = new JSONObject(sb.toString());
		}finally {
			if(br!=null) {
				br.close();
			}//end if
		}//end finally
		return json;
	}//readJSON
	
	public static byte[] readBinary(String path) throws IOException{
		return readBinary(new File(path));
	}//readBinary
	
	public static byte[]  readBinary(File target) throws IOException{
		byte[] bytes = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(target);
			
		}finally {
			if(fis!=null) {
				fis.close();
			}//end if
		}//end finally
		
		return bytes;
	}//readBinary
	
	
}//class