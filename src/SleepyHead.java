//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
        int a = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "ayy", JOptionPane.YES_NO_OPTION);


        
        
        if(a==0) {
        	JOptionPane.showMessageDialog(null, "Get up!");
        }
        else {
        	JOptionPane.showMessageDialog(null, "Go back to sleep.");
        }
    }
}
