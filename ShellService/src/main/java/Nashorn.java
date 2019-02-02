
import javax.script.ScriptEngineManager;

import java.util.Arrays;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Nashorn {

    static String formattedDate;
    static String dateSeperator;
    
	public static void main(String args[]) {
		String value = convertDateformat("10.12.2018");
		convertDateformat(value);
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

		String name = "Mahesh";
		Integer result = null;

		try {
			nashorn.eval("print('" + name + "')");
			result = (Integer) nashorn.eval("10 + 2");

		} catch (ScriptException e) {
			System.out.println("Error executing script: " + e.getMessage());
		}
		System.out.println(result.toString());
	}
	
	public static boolean hasValue(String value) {
		if (null == value) return false;
        else if ("".equalsIgnoreCase(value)) return false;
        else return true;
	}
	public static String convertDateformat(String date) {
        formattedDate = "";
        dateSeperator = "";
        
        if (hasValue(date)) {
            Arrays.asList(date.split("\\.")).forEach(value -> {
                formattedDate = value + dateSeperator + formattedDate;
                if (!hasValue(dateSeperator)) {
                    dateSeperator = "-";
                }
            });
        }
        System.out.println(formattedDate);
        return formattedDate;
    }
}
