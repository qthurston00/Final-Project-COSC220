import java.util.Random;
import java.util.Scanner;
import java.lang.String;

import javax.swing.JOptionPane;
/** 
 *  COSC220_QuaShaun_Thurston_finalProject.java
 *  Qua'Shaun Thurston
 *  17 December 2019
 *  This java program is a simple java test that asks the user a 
 *  series of questions and exaluates if the answer is correct
 *  or false and outputs an overall grade.
 */
public class finalProject {
   
   public static void scoreCalc(Question [] questions) {
      double corrChoice = 0;
      Scanner keyboard = new Scanner(System.in);
            
      for (int i = 0; i < questions.length; i++) {
         JOptionPane.showInputDialog(questions[i].questn);           // Pop-up window for user to enter answers
         String answr = keyboard.nextLine();
         if (answr.equalsIgnoreCase(questions[i].answr)) 
            corrChoice++;
      }
      double total = ((corrChoice / questions.length) * 100);
      System.out.println("Your overall grade is " + corrChoice + " out of " + questions.length +
                         " ... " + total + "%!");
      if (corrChoice >= 60) {
         System.out.print ("~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                           "You have passed the test! Congratulations!");
      }
      else {
         System.out.print ("~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" + 
                           "You have failed the test... ");
      }
   }
   public static void main(String args[]) {
      String q1 = "1. A loop must contain an input, a(n) _________, and an output.\n";
      String q2 = "2. For loops and while loops are what type of loop?\n" +
                  "(a.) Pre-test \n" +
                  "(b.) Post-test \n" +
                  "(c.) During-test \n" +
                  "(d.) Partial-test";
      String q3 = "3. What is the git command to list computer files?\n" +
                  "(a.) $ list \n" +
                  "(b.) $ ls \n" +
                  "(c.) $ cd \n" +
                  "(d.) $ git init";
      String q4 = "4. What basic parts make up a loop?\n" +
                  "(a.) A conditionthat is false and a statement that executes. \n" +
                  "(b.) A condition that is true and a statement that executes. \n" +
                  "(c.) A condition that is true, a condition that is false, and a statement that executes. \n" +
                  "(d.) Put in some code and hope that it works.";
      String q5 = "5. What is the cloud?\n" +
                  "(a.) A building with servers that store data on a local disk. \n" +
                  "(b.) A mass storage device that maintains stored data in a permanent state even without power. \n" +
                  "(c.) The hardware in a computing device where the operating system (OS), application programs, and data in current use are kept so they can be quickly reached by the device's processor.\n" +
                  "(d.) A collection of condensed water that hovers in various parts of the atmosphere, often with their own name and classification.";
      String q6 = "6. How many megabytes are in 55 exabytes? (Round to the nearest whole integer.)\n";
      String q7 = "7. The statement “int rand = new Random();” declares a random number. (T/F)\n";
      String q8 = "8. What is the git command to change a file directory?\n" +
                  "(a.) $ change \n" +
                  "(b.) $ ls \n" +
                  "(c.) $ cd \n" +
                  "(d.) $ git init";
      String q9 = "9. Do-while loops are what type of loop?\n" +
                  "(a.) Pre-test \n" +
                  "(b.) Post-test \n" +
                  "(c.) During-test \n" +
                  "(d.) Partial-test";
      String q10 = "10. What is the git command to Initialize a local Git repository? \n" +
                   "(a.) $ git clone \n" +
                   "(b.) $ ls \n" +
                   "(c.) $ cd \n" +
                   "(d.) $ git init";
      String q11 = "The first step to the scientific method is to make an observation. (T/F) \n";
      String q12 = "12. Which of the following is not a type of comment?" +
                   "(a.) Documentation comment. \n" +
                   "(b.) Double line comment. \n" +
                   "(c.) Multi line comment. \n" +
                   "(d.) Single line comment";
      String q13 = "13. Fill in the sequence; byte, kilobyte, megabyte, gigabyte, terabyte, petabyte, _______.\n" +
                   "(a.) Decabyte \n" +
                   "(b.) Polybyte \n" +
                   "(c.) Tetrabyte \n" +
                   "(d.) Exabyte";
      String q14 = "14. There are _____ bytes in a kilobyte. \n" +
                   "(a.) 8 \n" +
                   "(b.) 64 \n" +
                   "(c.) 1000 \n" +
                   "(d.) 1024";
      String q15 = "15. A scanner is a type of ______? \n" +
                   "(a.) Object \n" +
                   "(b.) Class \n" +
                   "(c.) Method \n" +
                   "(d.) Variable";
      String q16 = "16. The symbol “||” means and. (T/F) \n";
      String q17 = "17. FileWriter is used to avoid a file that already exists. (T/F)\n";
      String q18 = "18. Which of the following is not a primitive data type? \n" +
                   "(a.) Num \n" +
                   "(b.) Short \n" +
                   "(c.) Long \n" +
                   "(d.) Byte";
      String q19 = "19. A ____ method is one that performs a task and then terminates. \n" +
                   "(a.) Bool \n" +
                   "(b.) Char \n" +
                   "(c.) Void \n" +
                   "(d.) Main";
      String q20 = "20. What does JDK stand for? \n" +
                   "(a.) Java Developer Kit \n" +
                   "(b.) Java Development Kit \n" +
                   "(c.) Java Design Kit \n" +
                   "(d.) Janky Dusty Kit";
      
      Question [] questions = {
         new Question(q1, "condition"),
         new Question(q2, "a"),
         new Question(q3, "b"),
         new Question(q4, "c"),
         new Question(q5, "a"),
         new Question(q6, "1099511627776"),
         new Question(q7, "f"),
         new Question(q8, "c"),
         new Question(q9, "b"),
         new Question(q10, "d"),
         new Question(q11, "t"),
         new Question(q12, "b"),
         new Question(q13, "d"),
         new Question(q14, "c"),
         new Question(q15, "b"),
         new Question(q16, "f"),
         new Question(q17, "t"),
         new Question(q18, "a"),
         new Question(q19, "c"),
         new Question(q20, "b"),
      };
      scoreCalc(questions);
   }

}

class Question {
   String questn;
   String answr;
      public Question(String questn, String answr) {
         this.questn = questn;
         this.answr = answr;
      }
}   