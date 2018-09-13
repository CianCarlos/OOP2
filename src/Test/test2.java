package Test;

import java.util.Scanner;
import java.util.ArrayList;

public class test2 {

    public static void main(String[]args)
    {
        ChoiceQuestion first = new ChoiceQuestion();
        first.setText("What was the original name of the Java language?");
        first.addChoice("*7",false);
        first.addChoice("Duke",false);
        first.addChoice("Oak",true);
        first.addChoice("Gosling",false);

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia",false);
        second.addChoice("Canada",true);
        second.addChoice("Denmark",false);
        second.addChoice("United States",false);

        presentQuestion(first);
        presentQuestion(second);
    }

    public static void presentQuestion(ChoiceQuestion q)
    {
        q.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
    public static class ChoiceQuestion extends test1.Question
    {
        private ArrayList<String> choices;

        public ChoiceQuestion()
        {
            choices = new ArrayList<String>();
        }
        public void addChoice(String choice, boolean correct)
        {
            choices.add(choice);
            if(correct)
            {
                String choiceString = "" + choices.size();
                setAnswer(choiceString);
            }
        }
        public void display()
        {
            super.display();

            for (int i = 0; i < choices.size(); i++)
            {
                int choiceNumber = i + 1;
                System.out.println(choiceNumber + ": " + choices.get(i));
            }
        }
    }
}