
public class Question 
{
    private static int markAllocation;
    private static int questionNumber;
    private static Subquestion array[];
    private static String question;

    public Question(int qN, int mA , Subquestion sArr[], String q)
    {
        questionNumber = qN;
        markAllocation = mA;
        array = sArr;
        question = q;
    }

    public void setMarkAllocation(int mA)
    {
        markAllocation = mA;
    }

    public int getMarkAllocation()
    {
        return markAllocation;

    }

    public void setMQuestion(String q)
    {
        question = q;
    }

    public String getQuestion()
    {
        return question;
    }

    public void setArray(int i , int m , int q)
    {
        
    }

    public String getArray()
    {
        String dis = "";

        dis = questionNumber + ". " + question + "\t(" + markAllocation + ")"; 
        return dis;
    }

}
