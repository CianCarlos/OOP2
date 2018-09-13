package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);

        Question q = new Question();
        q.setText("Who was the inventor of Java?");
        q.setAnswer("James Gosling");

        q.display();
        System.out.print("Your answer: ");
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
    public static class Question
    {
        private String text;
        private String answer;

        public Question()
        {
            text ="";
            answer ="";
        }

        public void setText(String questionText)
        {
            text = questionText;
        }

        public void setAnswer(String correctResponse)
        {
            answer = correctResponse;
        }

        public boolean checkAnswer(String response)
        {
            return response.equals(answer);
        }

        public void display()
        {
            System.out.println(text);
        }
    }
}