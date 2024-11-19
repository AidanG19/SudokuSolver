import javax.swing.JOptionPane;

public class QuestionPaperProject {
    private static int size=0;
    private static int subsize=0;
    private static Question qArr[] = new Question[100];

    public static void main(String[] args) 
    {
        

        int questionNumber =1 , markAllocation , subquestionNumber , subquestionMarkAllocation;
        String choice = "N";
        String question , subquestion;

        while(questionNumber != 0)
        {
            questionNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter question number here, if there are no more questions , enter 0"));
            question = JOptionPane.showInputDialog("Enter question number " + questionNumber + " here");
            markAllocation = Integer.parseInt(JOptionPane.showInputDialog("Enter mark alloaction for question " + questionNumber + "here"));

            choice = JOptionPane.showInputDialog("Does this question Have a subquestion (type Y for yes and N for no");
            Subquestion sArr[] = new Subquestion[100];
            subquestionNumber = 1;
            if(choice == "Y")
            { 
                while(subquestionNumber != 0)
                {
                
                    subquestionNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter question number here , if there are no more subquestions enter 0"));
                    subquestion = JOptionPane.showInputDialog("Enter question " + subquestionNumber + " here");
                    subquestionMarkAllocation = Integer.parseInt(JOptionPane.showInputDialog("Enter mark alloaction for question " + subquestionNumber + "here"));

                    sArr[subsize] = new Subquestion(subquestionNumber , markAllocation, subquestion);
                    subsize++;
                }
            
            }
            else
            {
                sArr = null;
            }

            qArr[size] = new Question(questionNumber, markAllocation, sArr, question);
            size++;
        }

        displayQuestions();
    }




    public static String displayQuestions()
    {
        String dis = "";
        for (int index = 0; index < size; index++) 
        {
            dis = dis + qArr[index].getArray() + "\n";
        }

        return dis;
    }
}


