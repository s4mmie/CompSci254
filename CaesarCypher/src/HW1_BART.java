/*
* Homework 1
* Samuel Bartholomew
* Date: 8-23-24
* This is my own original work and complies with hands-free sharing
*/	


public class HW1_BART 
{
	/**
	 * Main function used to instantiate CaesarCypher classes
	 * @param args
	 */
    public static void main(String[] args) 
    {
        // Instantiate the CaesarCipher with a shift of 5
    	CaesarCypher cypher = new CaesarCypher(5);

    	// Get the old shift
    	int shift1 = cypher.getShift();
    	
        // Example text to encrypt and decrypt
        String originalText = "Hello, World!";
        
        // Call the encrypt method
        String encryptedText = cypher.encryptMessage(originalText);
        
        // Output the encrypted text
        System.out.println("Encrypted Text: " + encryptedText);
        
        // Call the decrypt method
        String decryptedText = cypher.decryptMessage(encryptedText);
        
        // Output the decrypted text
        System.out.println("Decrypted Text: " + decryptedText);
        
        // Second cypher instance
    	CaesarCypher cypher2 = new CaesarCypher(5);
        
        // Changed the shift to 10
        cypher2.setShift(10);
        
        // Get the new shift
        int shift2 = cypher.getShift();

        // Call the encrypt method
        encryptedText = cypher2.encryptMessage(originalText);
        
        // Output the encrypted text
        System.out.println("Encrypted Text: " + encryptedText);
        
        // Call the decrypt method
        decryptedText = cypher2.decryptMessage(encryptedText);
        
        // Output the decrypted text
        System.out.println("Decrypted Text: " + decryptedText);
        
        // Output both shifts
        System.out.println("Shift 1: " + shift1);
        System.out.println("Shift 2: " + shift2);
    }
}

/*
Encrypted Text: Mjqqt, Btwqi!
Decrypted Text: Hello, World!
Encrypted Text: Rovvy, Gybvn!
Decrypted Text: Hello, World!
Shift 1: 5
Shift 2: 5
*/
