package com.charan.captcha;

import org.json.JSONArray;
import org.json.JSONObject;


public class mainClass {

	
	public static void main(String[] args ) throws Exception {
		
		String value = "{\n" + 
				"    \"key\":\"value\",\n" + 
				"    \"value\":\"something\",\n" + 
				"    \"something\":\"otherSomething\"\n" + 
				"}";
		System.out.println(value);
		JSONObject jsonObject = new JSONObject(value);
		jsonObject.put("newKey", "new value");
		System.out.println(jsonObject.toString());
		
		JSONArray ja = new JSONArray();
		ja.put(Boolean.TRUE);
		ja.put("lorem ipsum");
		 
		JSONObject jo = new JSONObject();
		jo.put("name", "jon doe");
		jo.put("age", "22");
		jo.put("city", "chicago");
		 
		ja.put(jo);
		ja.put(jo);
		System.out.println(ja);
		jsonObject.put("Array", ja);
		System.out.println(jsonObject);
	}
	
}

