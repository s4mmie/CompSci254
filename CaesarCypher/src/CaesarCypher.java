/*
* Homework 1
* Samuel Bartholomew
* Date: 8-23-24
* This is my own original work and complies with hands-free sharing
*/
public class CaesarCypher 
{
		int shift = 5;
		
		//Constructor 
		/**
		 * Instantiate CaesarCypher
		 * @param shift
		 */
		public CaesarCypher(int shift)
		{
			this.shift = shift;
		}
		
		// Encrypt the string that is taken in
		/**
		 * Encrypt a string provided, return the encrypted string
		 * @param message
		 * @return
		 */
		public String encryptMessage(String message)
		{
			String encryptedString = "";
			for(int i = 0; i < message.length(); i++)
			{
				char letter = message.charAt(i);
				char encryptedChar = letter;
				 // Encrypt uppercase characters
	            if (Character.isUpperCase(letter)) 
	            {
	                encryptedChar = (char) ((letter + shift - 'A') % 26 + 'A');
	            }
	            // Encrypt lowercase characters
	            else if (Character.isLowerCase(letter)) 
	            {
	                encryptedChar = (char) ((letter + shift - 'a') % 26 + 'a');
	            }
                encryptedString += encryptedChar;
			}
			return encryptedString;
		}
		// Decrypt the string that is taken in
		public String decryptMessage(String message)
		{
			String decryptedString = "";
			for(int i = 0; i < message.length(); i++)
			{
				char letter = message.charAt(i);
				char decryptedChar = letter;
				 // Decrypt uppercase characters
	            if (Character.isUpperCase(letter)) 
	            {
	            	decryptedChar = (char) ((letter - shift - 'A' + 26) % 26 + 'A');
	            }
	            // Decrypt lowercase characters
	            else if (Character.isLowerCase(letter)) 
	            {
	                decryptedChar = (char) ((letter - shift - 'a' + 26) % 26 + 'a');
	            }
	            decryptedString += decryptedChar;
			}
			return decryptedString;
		}
		/**
		 * Set the shift of the cypher to a new value
		 * @param shift
		 */
		public void setShift(int shift)
		{
			this.shift = shift;
		}
		/**
		 * Return the current shift
		 * @return
		 */
		public int getShift()
		{
			return shift;
		}
}
