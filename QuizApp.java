import java.util.Random;

import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] questions = {

                "Capital of India?",

                "Which language is used for Android development?",

                "2 + 2 = ?",

                "Which data structure follows FIFO?",

                "Which is not an Operating System?",

                "HTML stands for?",

                "Which keyword is used to inherit a class in Java?",

                "Which company owns Java?",

                "Which one is a loop?",

                "Binary search works on?",

                "Which symbol is used for logical AND?",

                "Which is not an OOP concept?",

                "Which one is a database?",

                "RAM is?",

                "Which is a CSS framework?",

                "Which tool is used for version control?",

                "Which is not a primitive data type in Java?",

                "Which port does HTTP use?",

                "Which is a NoSQL database?",

                "Which is used to style web pages?"

        };

        String[][] options = {

                {"A) Mumbai", "B) Delhi", "C) Chennai", "D) Kolkata"},

                {"A) Python", "B) Swift", "C) Java", "D) Ruby"},

                {"A) 3", "B) 4", "C) 5", "D) 6"},

                {"A) Stack", "B) Tree", "C) Queue", "D) Graph"},

                {"A) Linux", "B) Windows", "C) Oracle", "D) Mac"},

                {"A) Hyper Text Markup Language", "B) High Text ML", "C) Hyperlinks Text ML", "D) None"},

                {"A) implement", "B) extends", "C) inherits", "D) super"},

                {"A) Microsoft", "B) Google", "C) Oracle", "D) IBM"},

                {"A) if", "B) for", "C) switch", "D) break"},

                {"A) Sorted array", "B) Unsorted array", "C) Tree", "D) Graph"},

                {"A) &&", "B) ||", "C) !", "D) %"},

                {"A) Inheritance", "B) Polymorphism", "C) Compilation", "D) Encapsulation"},

                {"A) MySQL", "B) HTML", "C) CSS", "D) JS"},

                {"A) Permanent", "B) Temporary", "C) Secondary", "D) External"},

                {"A) Django", "B) React", "C) Bootstrap", "D) Flask"},

                {"A) Git", "B) Docker", "C) Jenkins", "D) AWS"},

                {"A) int", "B) float", "C) String", "D) char"},

                {"A) 21", "B) 22", "C) 80", "D) 443"},

                {"A) MySQL", "B) PostgreSQL", "C) MongoDB", "D) Oracle"},

                {"A) HTML", "B) CSS", "C) JS", "D) SQL"}

        };

        char[] answers = {
                'B','C','B','C','C','A','B','C','B','A',

                'A','C','A','B','C','A','C','C','C','B'
        };

      boolean[] asked=new boolean[20];

      int score=0;
      int wrong=0;
      int count=0;

      while(count<10)
      {
          int in=rand.nextInt(20);
          if(asked[in])
          {
              continue;
          }
          asked[in]=true;
          count++;

          System.out.println("\nQ"+count +". "+questions[in]);
          for(int i=0;i<4;i++)
          {
              System.out.println(options[in][i]);
          }

          char ans;
          while (true)
          {
              System.out.println("Enter choice (A/B/C/D): ");
              ans=sc.next().toUpperCase().charAt(0);
              if(ans=='A' || ans=='B' || ans == 'C' || ans=='D')
              {
                  break;
              }
              System.out.println("Invalid Input. Try again");
          }
          if(ans==answers[in])
          {
              score++;
          }
          else {
              wrong++;
              if (wrong == 4) {
                  System.out.println("You failed the test with 4 wrong answers");
                  System.out.println("Score: " + score);
                  return;
              }
          }
      }
        System.out.println("Quiz completed");
        System.out.println("Final Score: "+score);
        sc.close();
    }

}