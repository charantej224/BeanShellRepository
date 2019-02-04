import java.util.Random;

public class RandomString {

	public static void main(String[] args) {
		System.out.println(generateRandomStringUsingSecureRandom());
		System.out.println(generateRandomStringUsingSecureRandom());
		System.out.println(generateRandomStringUsingSecureRandom());
		System.out.println(generateRandomStringUsingSecureRandom());
		System.out.println(generateRandomStringUsingSecureRandom());
		System.out.println(generateRandomStringUsingSecureRandom());
		System.out.println(generateRandomStringUsingSecureRandom());
		System.out.println(generateRandomStringUsingSecureRandom());
		System.out.println(generateRandomStringUsingSecureRandom());
		System.out.println(generateRandomStringUsingSecureRandom());
		System.out.println(generateRandomStringUsingSecureRandom());
		System.out.println(generateRandomStringUsingSecureRandom());
	}
	
	
	public static String generateRandomStringUsingSecureRandom(){
	       String CHAR_LIST =
	            "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        Random rand = new Random();
	        StringBuffer randStr = new StringBuffer(24);
	        for( int i = 0; i < 24; i++ ) {
	        	int value = rand.nextInt(62);
	        	randStr.append( CHAR_LIST.charAt(value) );
	        }
	        return randStr.toString();
	    }
	
}
