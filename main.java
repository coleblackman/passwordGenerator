package passwordGenerator;

import java.security.SecureRandom;

public class main {

	public static void main(String[] args) {
		System.out.println("Welcome to password generator");
		System.out.println("A random char is: " + alphaGen());
		
		// Requirement 1: Specify number of special characters, letters, capital letters, numbers, password length
		// Requirement 2: Hash passwords when storing them?
		// Requirement 3: Ensure that passwords are pronouncable?
		// Requirement 4: Give a strength estimate of the generated password
			// Requirement 4a: Specify number of days/months/years an average computer would require to break the password by brute force
			// Requirement 4b: Test password strength against JTR, RT, etc.
		// Requirement 5: Include a dictionary word
		// Requirement 6: Be able to store and come back to previously generated passwords?

		
	}
	
	public static char alphaGen () {
		// Write a test that generates random chars until it has generated every single possible char
		//https://docs.oracle.com/javase/6/docs/api/java/security/SecureRandom.html
	    SecureRandom random = new SecureRandom();
	    String alphabet = "abcdefghijklmnopqrstuvwxyz";
	    int ind = random.nextInt(26);
	    char alpha = alphabet.charAt(ind);
	    
		return alpha;
		
	}

}
