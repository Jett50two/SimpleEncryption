import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class encryptionMain {
	private static final JFrame frame = new JFrame();
	private static JPanel panel = new JPanel();
	private static JTextField nameField = new JTextField(20);
	private static JButton button1 = new JButton();
	private static JTextArea inputValue = new JTextArea();
	// Encryption Text Areas
	private static JTextArea encryptValue = new JTextArea();
	private static JTextArea fullEncryptValue = new JTextArea();
	// Decryption TextAres
	private static JTextArea decryptValue = new JTextArea();
	private static JTextArea outputValue = new JTextArea();
	
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String args[]){
		display();
    }
	
	/**
	 * Display function for setting up the button, text field and text areas.
	 */
	private static void display(){
		// Set up the panel to be used in the frame.
		frame.add(panel);
		
		// add values to panel.
		panel.add(nameField);
		panel.add(button1);
		button1.setText("Encrypt");
		// Set the JTextAreas
		setTextAreas();
		
		frame.setVisible(true);
		frame.setSize(600,400); 

		// If button is pressed
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonPressed();
        	}
		});
	}
	
	private static void buttonPressed() {
		// original value
		inputValue.setText("Original Text: " + nameField.getText()); 
		inputValue.setVisible(true);
		
		// encryption
		String encryptedText = encryptText(nameField.getText());
		encryptValue.setText("Convert to Numbers: " + encryptedText); 
		encryptValue.setVisible(true);
		encryptedText = fullEncryptEquation(encryptedText);
		fullEncryptValue.setText("Simple Multiplication: " + encryptedText); 
		fullEncryptValue.setVisible(true);
		
		// decryption
		String decryptedText = fullDencryptEquation(encryptedText);
		decryptValue.setText("Simple Divide (Original Numbers): " + decryptedText); 
		decryptValue.setVisible(true);
		decryptedText = decryptText(decryptedText);
		outputValue.setText("Convert Back to Text: " + decryptedText); 
		outputValue.setVisible(true);
	}
	
	/**
	 * Set up the values for the textArea's.
	 */
	private static void setTextAreas(){
		panel.add(inputValue);
		// setBounds isn't really the best choice for this, but it works for the option of a quick UI. 
		inputValue.setBounds(0, 0, 500, 5);
		inputValue.setVisible(false);
		inputValue.setEditable(false);
		inputValue.setLineWrap(true);
		
		panel.add(encryptValue);
		encryptValue.setBounds(0, 0, 500, 5);
		encryptValue.setVisible(false);
		encryptValue.setEditable(false);
		encryptValue.setLineWrap(true);
		
		panel.add(fullEncryptValue);
		fullEncryptValue.setBounds(0, 0, 500, 5);
		fullEncryptValue.setVisible(false);
		fullEncryptValue.setEditable(false);
		fullEncryptValue.setLineWrap(true);
		
		panel.add(decryptValue);
		decryptValue.setBounds(0, 0, 500, 5);
		decryptValue.setVisible(false);
		decryptValue.setEditable(false);
		decryptValue.setLineWrap(true);
		
		panel.add(outputValue);
		// setBounds isn't really the best choice for this, but it works for the option of a quick UI. 
		outputValue.setBounds(0, 0, 500, 5);
		outputValue.setVisible(false);
		outputValue.setEditable(false);
		outputValue.setLineWrap(true);
		
	}
	
	/////////////////////////////////////////////////////////// Encryption /////////////////////////////////////////////////
	/**
	 * encrypt the text
	 * @param text = passed string value
	 * @return the text as numbers
	 */
	private static String encryptText(String text){
		String wordsToNum = "";
		// check each character in the text
		for (int index = 0; index < text.length(); index++) {
			char aChar = text.charAt(index);
			// pass the character into changeToNumber to get the corresponding number.
			wordsToNum = wordsToNum + changeToNumber(aChar);
		}
		return wordsToNum;
	}
	
	/**
	 * change letters into numbers
	 * I start at 10 so when reading the data again, I know that each letter is only 2 digits.
	 * @param letter = the letter from part of the string that was inputed originally
	 * @return the number that is related to the letter.
	 */
	private static String changeToNumber (char letter){
		String number = null;
		if (letter == 'A'){
			number = "10";
		} else if (letter == 'a'){
			number = "11";
		} else if (letter == 'B'){
			number = "12";
		} else if (letter == 'b'){
			number = "13";
		} else if (letter == 'C'){
			number = "14";
		} else if (letter == 'c'){
			number = "15";
		} else if (letter == 'D'){
			number = "16";
		} else if (letter == 'd'){
			number = "17";
		} else if (letter == 'E'){
			number = "18";
		} else if (letter == 'e'){
			number = "19";
		} else if (letter == 'F'){
			number = "20";
		} else if (letter == 'f'){
			number = "21";
		} else if (letter == 'G'){
			number = "22";
		} else if (letter == 'g'){
			number = "23";
		} else if (letter == 'H'){
			number = "24";
		} else if (letter == 'h'){
			number = "25";
		} else if (letter == 'I'){
			number = "26";
		} else if (letter == 'i'){
			number = "27";
		} else if (letter == 'J'){
			number = "28";
		} else if (letter == 'j'){
			number = "29";
		} else if (letter == 'K'){
			number = "30";
		} else if (letter == 'k'){
			number = "31";
		} else if (letter == 'L'){
			number = "32";
		} else if (letter == 'l'){
			number = "33";
		} else if (letter == 'M'){
			number = "34";
		} else if (letter == 'm'){
			number = "35";
		} else if (letter == 'N'){
			number = "36";
		} else if (letter == 'n'){
			number = "37";
		} else if (letter == 'O'){
			number = "38";
		} else if (letter == 'o'){
			number = "39";
		} else if (letter == 'P'){
			number = "40";
		} else if (letter == 'p'){
			number = "41";
		} else if (letter == 'Q'){
			number = "42";
		} else if (letter == 'q'){
			number = "43";
		} else if (letter == 'R'){
			number = "44";
		} else if (letter == 'r'){
			number = "45";
		} else if (letter == 'S'){
			number = "46";
		} else if (letter == 's'){
			number = "47";
		} else if (letter == 'T'){
			number = "48";
		} else if (letter == 't'){
			number = "49";
		} else if (letter == 'U'){
			number = "50";
		} else if (letter == 'u'){
			number = "51";
		} else if (letter == 'V'){
			number = "52";
		} else if (letter == 'v'){
			number = "53";
		} else if (letter == 'W'){
			number = "54";
		} else if (letter == 'w'){
			number = "55";
		} else if (letter == 'X'){
			number = "56";
		} else if (letter == 'x'){
			number = "57";
		} else if (letter == 'Y'){
			number = "58";
		} else if (letter == 'y'){
			number = "59";
		} else if (letter == 'Z'){
			number = "60";
		} else if (letter == 'z'){
			number = "61";
		} else if (letter == '0'){
			number = "62";
		} else if (letter == '1'){
			number = "63";
		} else if (letter == '2'){
			number = "64";
		} else if (letter == '3'){
			number = "65";
		} else if (letter == '4'){
			number = "66";
		} else if (letter == '5'){
			number = "67";
		} else if (letter == '6'){
			number = "68";
		} else if (letter == '7'){
			number = "69";
		} else if (letter == '8'){
			number = "70";
		} else if (letter == '9'){
			number = "71";
		} else if (letter == ' '){
			number = "72";
		} else {
			number = "";
		}
		return number;
	}
	
	/**
	 * This will add an extra level of encryption to the numbers by adding, dividing, multiplying and subtracting numbers.
	 * @param text = numbers of the encrypted text.
	 * @return the full encryption.
	 */
	private static String fullEncryptEquation (String text){
		BigInteger value = new BigInteger("0");
		try{
			BigInteger number = new BigInteger(text);
			BigInteger num1 = new BigInteger("1024");
			value = value.add(number);
			value = value.multiply(num1);
		} catch (NumberFormatException e){
			return "AN ERROR HAPPENED: " + e;
		}
		text = String.valueOf(value);
		return text;
	}
	
	/////////////////////////////////////////////////////////// Decryption /////////////////////////////////////////////////
	/**
	 * Decrypt the numbers and recreate the string of letters
	 * @param text
	 * @return
	 */
	private static String decryptText(String text){
		String numToWords = "";
		int num = 0;
		// check each character in the text
		for (int index = 0; index < text.length(); index++) {
			// First digit
			char aChar = text.charAt(index);
			// add one to the index so we can get the second number
			index++;
			char bChar = text.charAt(index);
			try{
				num = Integer.parseInt("" + aChar + bChar);
			} catch (NumberFormatException e){
				return "AN ERROR HAPPENED: " + e;
			}
			numToWords = numToWords + changeToChar(num);
		}
		return numToWords;
	}
	
	/**
	 * Check the numbers that were grabbed and change them back into letters.
	 * @param num
	 * @return
	 */
	private static char changeToChar(int num){
		char letter = ' ';
		// Cut the number if statements in half to make the calculations a little quicker.
		if (num >= 10 && num <= 40){
			// Makes it a little easier to separate each value by about 11 values
			if(num >= 10 && num <= 20){
				if(num == 10){
					letter = 'A';
				} else if (num == 11){
					letter = 'a';
				} else if (num == 12){
					letter = 'B';
				} else if (num == 13){
					letter = 'b';
				} else if (num == 14){
					letter = 'C';
				} else if (num == 15){
					letter = 'c';
				} else if (num == 16){
					letter = 'D';
				} else if (num == 17){
					letter = 'd';
				} else if (num == 18){
					letter = 'E';
				} else if (num == 19){
					letter = 'e';
				} else if (num == 20){
					letter = 'F';
				}
			} else if (num >= 21 && num <= 31){
				if (num == 21){
					letter = 'f';
				} else if (num == 22){
					letter = 'G';
				} else if (num == 23){
					letter = 'g';
				} else if (num == 24){
					letter = 'H';
				} else if (num == 25){
					letter = 'h';
				} else if (num == 26){
					letter = 'I';
				} else if (num == 27){
					letter = 'i';
				} else if (num == 28){
					letter = 'J';
				} else if (num == 29){
					letter = 'j';
				} else if (num == 30){
					letter = 'K';
				} else if (num == 31){
					letter = 'k';
				}
			} else if (num >= 32 && num <= 40){
				if (num == 32){
					letter = 'L';
				} else if (num == 33){
					letter = 'l';
				} else if (num == 34){
					letter = 'M';
				} else if (num == 35){
					letter = 'm';
				} else if (num == 36){
					letter = 'N';
				} else if (num == 37){
					letter = 'n';
				} else if (num == 38){
					letter = 'O';
				} else if (num == 39){
					letter = 'o';
				} else if (num == 40){
					letter = 'P';
				}
			}
		} 
		else if (num >= 41 && num <= 72){
			if(num >= 41 && num <= 51){
				if (num == 41){
					letter = 'p';
				} else if (num == 42){
					letter = 'Q';
				} else if (num == 43){
					letter = 'q';
				} else if (num == 44){
					letter = 'R';
				} else if (num == 45){
					letter = 'r';
				} else if (num == 46){
					letter = 'S';
				} else if (num == 47){
					letter = 's';
				} else if (num == 48){
					letter = 'T';
				} else if (num == 49){
					letter = 't';
				} else if (num == 50){
					letter = 'U';
				} else if (num == 51){
					letter = 'u';
				}
			} else if (num >= 52 && num <= 62){
				if (num == 52){
					letter = 'V';
				} else if (num == 53){
					letter = 'v';
				} else if (num == 54){
					letter = 'W';
				} else if (num == 55){
					letter = 'w';
				} else if (num == 56){
					letter = 'X';
				} else if (num == 57){
					letter = 'x';
				} else if (num == 58){
					letter = 'Y';
				} else if (num == 59){
					letter = 'y';
				} else if (num == 60){
					letter = 'Z';
				} else if (num == 61){
					letter = 'z';
				} else if (num == 62){
					letter = '0';
				}
			} else if (num >= 63 && num <= 72){
				if (num == 63){
					letter = '1';
				} else if (num == 64){
					letter = '2';
				} else if (num == 65){
					letter = '3';
				} else if (num == 66){
					letter = '4';
				} else if (num == 67){
					letter = '5';
				} else if (num == 68){
					letter = '6';
				} else if (num == 69){
					letter = '7';
				} else if (num == 70){
					letter = '8';
				} else if (num == 71){
					letter = '9';
				} else if (num == 72){
					letter = ' ';
				}
			}
		}
		return letter;
	}
	
	/**
	 * Do the fullEncryptEquation backwards. It's also important for testing your math to make sure you didn't goof.
	 * @param text
	 * @return
	 */
	private static String fullDencryptEquation(String text){
		BigInteger value = new BigInteger("0");
		try{
			BigInteger number = new BigInteger(text);
			BigInteger num1 = new BigInteger("1024");
			value = value.add(number);
			value = value.divide(num1);
		} catch (NumberFormatException e){
			return "AN ERROR HAPPENED: " + e;
		}
		text = String.valueOf(value);
		return text;
	}

}
