import java.util.Random;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static Random r = new Random();
	static int persVal = r.nextInt();
	static boolean full = false;
	
	public static void main(String[] args) {
		String pet = "null";
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
		for(int i = 0; i==0;) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			int activity = JOptionPane.showOptionDialog(null, "What activity will you do with your " + pet + "?", pet + " has " + happinessLevel + " happiness.", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Give Water", "Take for Walk", "Clean Poo Poo" }, null);
			//    Make sure to customize the title and question too.

			// 5. Use user input to call the appropriate method created in step 4.
			if(activity==0) {
				cuddle(pet);
			}
			else if(activity==1) {
				feed(pet);
			}
			else if(activity==2) {
				water(pet);
			}
			else if(activity==3) {
				walk(pet);
			}
			else {
				poop(pet);
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel>=10) {
				JOptionPane.showMessageDialog(null, "Your " + pet + " loves you! You win!");
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void cuddle(String p)  {
		if(persVal%2==0) {
			JOptionPane.showMessageDialog(null, "Your " + p + " purred!");
			happinessLevel++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Your " + p + " didn't particularly like that...");
			happinessLevel--;
		}
	}
	public static void feed(String p)  {
		if(full==false) {
			JOptionPane.showMessageDialog(null, "Yum! Your " + p + " enjoyed it!");
			happinessLevel++;
			full = true;
		}
		else {
			JOptionPane.showMessageDialog(null, "Your " + p + " didn't eat. It's probably full.");
		}
	}
	public static void poop(String p) {
		if(persVal%3==0) {
			JOptionPane.showMessageDialog(null, "Your " + p + " appreciates your effort to clean up!");
			happinessLevel++;
		}
		else if(persVal%3==1) {
			JOptionPane.showMessageDialog(null, "Your " + p + " seems indifferent to your cleaning up.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Your " + p + " seems like they wanted to eat the poo. They're growling.");
			happinessLevel--;
		}
	}
	public static void water(String p) {
		if(persVal%4==0||persVal%4==1||persVal%4==2) {
			JOptionPane.showMessageDialog(null, "The water dish is replenished!");
			happinessLevel++;
		}
		else {
			JOptionPane.showMessageDialog(null, "The water dish is replenished! Your " + p + " seems super happy!");
			happinessLevel = happinessLevel + 2;
		}
	}
	public static void walk(String p) {
		if(persVal%3==0||persVal%3==2) {
			JOptionPane.showMessageDialog(null, "Your pet loved it!");
			happinessLevel++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Your " + p + " is panting. It looks angry.");
			happinessLevel--;
		}
	}
}