/* Lab Exercise 5 Question 41
 * Zhaozhong (Alex) Wang
 */


public class TestMessage {
	public static void main(String[] Args) {
		System.out.println("The Message Class Testing"
				+ " ******************************"); //printing info
		
		
		//Instantiated with default constructor
		Message msg1 = new Message();
		Message msg2 = new Message();
		
		
		//Instantiated with parameter-taking constructor
		Message msg3 = new Message("hello ", "Johnson");
		
		
		System.out.println(msg1);
		
		
		//mutating author to "Johnson"
		msg1.setAuthor("Johnson");
		
		//mutating msg1 to "hello world"
		msg1.setMessage("hello world");
		System.out.println(msg1); //printing out message
		//println() uses shortcut to call toString()
		
		
		//testing author accessor (for message 2)
		System.out.println("\ntesting Message accessors:");
		System.out.println(msg2.getAuthor());
		
		
		//testing message accessor (for message 1)
		System.out.println("\n" + msg1.getMessage());
		
		
		//testing message mutators
		System.out.println("\ntesting Message mutators:\ntoo short (as expected)");
		msg2.setMessage("h"); //message too short which will not be accepted
		System.out.println(msg2); //printing out result (message is not changed)
		
		
		//testing with acceptable length
		System.out.println("\nacceptable length (should be)");
		msg2.setMessage("LONG STRING abcde abcde abcde abcde  abcde abcde"
				+ "abcde  abcde  abcde  abcde  abc\r\n"
				+ "de  abcde abcde  abcde abcde abcde\r\n"
				+ "-------------------------------------------------");
		//setting message to a string with acceptable length
		System.out.println(msg2);
		
	}
}
