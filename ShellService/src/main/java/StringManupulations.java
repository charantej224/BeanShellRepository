import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringManupulations {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String myKey = "CCCC";
		byte[] key = myKey.getBytes("UTF-8");
		System.out.println(new String(key));
		for (byte B : key) {
			System.out.println(B + " ");
		}
		newMethods("x");
		int a = -1;
		System.out.println(a);
		
		LocalDate localDate = LocalDate.now();//For reference
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedString = localDate.format(formatter);
		System.out.println(formattedString);
		
	}
	
	public static void newMethods(String x) {
		class Local {}
		String name = Local.class.getEnclosingMethod().getName();
		System.out.println(name);
	}

}
