import java.util.Random;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		String pet = "null";
		Random r = new Random(9999999);
		int persVal = r.nextInt();
		System.out.println(persVal);
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		int petInt = JOptionPane.showOptionDialog(null, "What kind of pet would you like to buy?", "HappyPet", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Cat", "Dog", "Bat", "Bird", "Potato" }, null);
		if(petInt==0) {
			pet = "Cat";
		}
		else if(petInt==1) {
			pet = "Dog";
		}
		else if(petInt==2) {
			pet = "Bat";
		}
		else if(petInt==3) {
			pet = "Bird";
		}
		else {
			pet = "Potato";
		}
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			int activity = JOptionPane.showOptionDialog(null, "What activity will you do with your " + pet + "?", "HappyPet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Give Water", "Take for Walk", "Groom", "Clean Poo Poo" }, null);
			if(activity==0) {
				cuddle(persVal, pet);
			}
			//    Make sure to customize the title and question too.

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void cuddle(int pv, String p)  {
		if(pv%2==0) {
			JOptionPane.showMessageDialog(null, "Your " + p + " purred!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Your " + p + " didn't particularly like that...");
		}
	}
}