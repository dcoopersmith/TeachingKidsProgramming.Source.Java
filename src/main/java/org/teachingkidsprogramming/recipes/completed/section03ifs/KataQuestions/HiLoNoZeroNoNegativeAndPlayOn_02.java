package org.teachingkidsprogramming.recipes.completed.section03ifs.KataQuestions;

import java.awt.Toolkit;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

//------------Kata Question---------------//
//  How would you make sure the guess is NOT zero
//      and end the game if the guess is zero?
//  How would you make sure the guess is NOT a negative number
//      but go to the next turn if the guess is negative?
//  Write out the steps in English 
//  Then translate the steps into code
//  Make sure to run after each line
//
public class HiLoNoZeroNoNegativeAndPlayOn_02
{
  public static void main(String[] args)
  {
    // int answer = NumberUtils.getRandomInt(1, 100);
    int answer = 12;
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("Can you guess the random number between 1 and 100?");
      if (guess == 0)
      {
        MessageBox.showMessage("No Zero allowed, you lose!");
        System.exit(0);
      }
      if (guess == answer)
      {
        Toolkit.getDefaultToolkit().beep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Try a lower number.");
      }
      else if (guess < answer)
      {
        MessageBox.showMessage("Try a higher number.");
      }
    }
    MessageBox.showMessage("You lost!");
  }
}
