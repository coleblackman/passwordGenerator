package passwordGenerator;
import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;
import java.security.SecureRandom;

public class main {

	public static void main(String[] args) {
		int passwordLength = 10;

		JFrame frame = new JFrame("Password Generator");
	    JButton button = new JButton("Generate");
	    JTextField password = new JTextField();
	    password.setBounds(125, 50, 150, 30); // set the size and position of the text field
	      
	    button.setFont(new Font("Arial", Font.PLAIN, 7)); // set the font of the button

	    button.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		password.setText(newPasswordGen(passwordLength));
	    	}
	    });

	    button.setBounds(150, 200, 100, 30); // set the size and position of the button
	    frame.setLayout(null);
	    frame.add(password);
	    frame.add(button);
	    frame.setSize(400, 300);

	    frame.setVisible(true);
	    
	    
		
	
		
		
		for(int i = 0; i < passwordLength; i++)
		{
			
		}
		
		// Requirement 1: Specify number of special characters, letters, capital letters, numbers, password length
		// Requirement 2: Hash passwords when storing them?
		// Requirement 3: Ensure that passwords are pronouncable?
		// Requirement 4: Give a strength estimate of the generated password
			// Requirement 4a: Specify number of days/months/years an average computer would require to break the password by brute force
			// Requirement 4b: Test password strength against JTR, RT, etc.
		// Requirement 5: Include a dictionary word
		// Requirement 6: Be able to store and come back to previously generated passwords?

		
	}
	
	public static String newPasswordGen (int length) {
		String pass = "";
		for(int i = 0; i < length; i++)
		{
			pass = pass + alphaGen();
		}
		
		return pass;
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
