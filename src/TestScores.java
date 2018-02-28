import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What was your last test or project score as a percent?");
		int s = Integer.parseInt(score);
		
		if(s>100) {
			JOptionPane.showMessageDialog(null, "Over 100%!? What!?");
		}
		else if(s==100) {
			JOptionPane.showMessageDialog(null, "Perfect score, NICE!");
		}
		else if(s>96) {
			JOptionPane.showMessageDialog(null, "That's an A+! Great!");
		}
		else if(s>93) {
			JOptionPane.showMessageDialog(null, "That's an A, nice job!");
		}
		else if(s>89) {
			JOptionPane.showMessageDialog(null, "Hey, an A- is still technically an A!");
		}
		else if(s>79) {
			JOptionPane.showMessageDialog(null, "It may not be an A, but a B is still above average!");
		}
		else if(s>76) {
			JOptionPane.showMessageDialog(null, "A C+ is still technically SLIGHTLY above average!");
		}
		else if(s>73) {
			JOptionPane.showMessageDialog(null, "A C is technically average, so nice job.");
		}
		else if(s>69) {
			JOptionPane.showMessageDialog(null, "You're just slightly below average. You should try just a bit harder next time!");
		}
		else if(s>63) {
			JOptionPane.showMessageDialog(null, "Try doing something different next time.");
		}
		else if(s>59) {
			JOptionPane.showMessageDialog(null, "Still not an F. Yay?");
		}
		else if(s>0) {
			JOptionPane.showMessageDialog(null, "That's an F. You should try harder.");
		}
		else if(s==0) {
			JOptionPane.showMessageDialog(null, "A ZERO!? You're basically doomed anyway.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Less than a zero? You either made a mistake in the input or you're hopeless in life.");
		}
	}
}

