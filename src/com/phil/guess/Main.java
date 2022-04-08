//NAME: Cleland Ayensu Philemon
//REGISTRATION NUMBER: PS/CSC/18/0110

package com.phil.guess;
import java.util.Random;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[]args) {
        int min=1;
        int max=99;
        //Random number generator
        Random num=new Random();
        int rand =min + num.nextInt(max);
        //User input
        int guess=Integer.parseInt(JOptionPane.showInputDialog("Enter a guess: "));
        while(true) {
            if(guess < 1 || guess > 99){

                JOptionPane.showMessageDialog(null, "Invalid number! \nThe guess should be between 1 and 99");
                guess=Integer.parseInt(JOptionPane.showInputDialog("Enter a guess: "));
                continue;
            }

            if (guess == rand) {
                JOptionPane.showMessageDialog(null,"Congrats! The number was "+guess);
                break;

            } else if (guess < rand) {
                JOptionPane.showMessageDialog(null,"Your guess is too low");
                guess=Integer.parseInt(JOptionPane.showInputDialog("Enter a guess: "));


            } else if (guess > rand) {


                JOptionPane.showMessageDialog(null,"Your guess is too high");
                guess=Integer.parseInt(JOptionPane.showInputDialog("Enter a guess: "));

            }
        }

    }
}
