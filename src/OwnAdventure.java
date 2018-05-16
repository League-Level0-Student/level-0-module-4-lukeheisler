import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		int opt1 = JOptionPane.showOptionDialog(null, "You're in a forest and someone comes at you and attacks you. What do you do?", "luke.exe", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Stay Still", "Fight Back" }, null);
	
		if(opt1==0) {
			int opt2 = JOptionPane.showOptionDialog(null, "The attacker realises you're probably a lifeless statue and just leaves. Will you:", "luke.exe", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Go back and get help", "Continue your walk" }, null);
			if(opt2==0) {
				int opt3 = JOptionPane.showOptionDialog(null, "When walking back to get help, the attacker strikes back! Do you:", "luke.exe", 0,
						JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Kick and Scream", "Stay Still" }, null);
				if(opt3==0) {
					JOptionPane.showMessageDialog(null, "The attacker thinks you're a psychopath and runs off, fearing for his life. The End.");
				}
				else {
					JOptionPane.showMessageDialog(null, "You get brutally murdered. The End.");
				}
			}
			else {
				int opt4 = JOptionPane.showOptionDialog(null, "You continue your walk without insident and enter the town. Will you enter:", "luke.exe", 0,
						JOptionPane.INFORMATION_MESSAGE, null, new String[] { "The Grocery Store", "Your House" }, null);
				if(opt4==0) {
					JOptionPane.showMessageDialog(null, "You enter the grocery store and then go home without incident. The End.");
				}
				else {
					JOptionPane.showMessageDialog(null, "The attacker, being the creepy stalker he is, is in your house, waiting for you. You get murdered. The End.");
				}
			}
		}
		else {
			int opt5 = JOptionPane.showOptionDialog(null, "While fighting back, you are able to deflect his weapon onto him, killing him. The police are coming. Do you:", "luke.exe", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Stay at the scene", "Run" }, null);
			if(opt5==0) {
				JOptionPane.showMessageDialog(null, "The police, mistaking you for murdering the attacker, kill you. The End.");
			}
			else {
				int opt6 = JOptionPane.showOptionDialog(null, "You successfully outrun the police and go to town. In town, do you go to:", "luke.exe", 0,
						JOptionPane.INFORMATION_MESSAGE, null, new String[] { "The Grocery Store", "Your House" }, null);
				if(opt6==0) {
					JOptionPane.showMessageDialog(null, "You enter the grocery store and then go home without incident. The End.");
				}
				else {
					JOptionPane.showMessageDialog(null, "The police are waiting at your house and arrest you for escaping them. You get sentenced to life in prison because the legal system is extremely corrupt. The End.");
				}
			}
		}

	}
	
}
