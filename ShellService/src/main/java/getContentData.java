import java.io.FileWriter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

public class getContentData {

	static String requestMessage = "{\n" + 
			"    \"data\": [\n" + 
			"        \n" + 
			"        {\n" + 
			"            \"name\": \"adapter_config_json\",\n" + 
			"            \"category\": \"PRODUCT\"\n" + 
			"        }\n" + 
			"    ]\n" + 
			"}";
	
	static String mustacheRequestMessage = "{\n" + 
			"    \"data\": [\n" + 
			"        \n" + 
			"        {\n" + 
			"            \"name\": \"adapter_config_request\",\n" + 
			"            \"category\": \"PRODUCT\"\n" + 
			"        }\n" + 
			"    ]\n" + 
			"}";
	
	public static void main(String[] args) {
		getMustache();
	}
	
	public static void getJsonConfigs() {
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.postForObject("https://apili.sit.income.com.sg/wcms/api/getContent", requestMessage, String.class);
		JSONArray jsonArray = new JSONArray(response);
		for(int i = 0;i<jsonArray.length();i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
				for(String key: jsonObject.keySet()) {
					writeFile(key,jsonObject.getString(key));
				}
		}
	}
	
	public static void getMustache() {
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.postForObject("https://apili.sit.income.com.sg/wcms/api/getContent", mustacheRequestMessage, String.class);
		JSONArray jsonArray = new JSONArray(response);
		for(int i = 0;i<jsonArray.length();i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
				for(String key: jsonObject.keySet()) {
					writeMustacheFileFile(key,jsonObject.getString(key));
				}
		}
	}
	
	public static void writeFile(String fileName,String fileContent) {
		 try{    
	           FileWriter fw=new FileWriter(fileName + ".json");    
	           fw.write(fileContent);    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }   
	
	public static void writeMustacheFileFile(String fileName,String fileContent) {
		 try{    
	           FileWriter fw=new FileWriter("/Users/Charan_Thota/Documents/mustache/"+fileName + ".mustache");    
	           fw.write(fileContent);    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     } 
	
}
