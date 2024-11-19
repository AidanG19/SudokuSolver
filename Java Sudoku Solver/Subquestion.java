
public class Subquestion
{
    private int questionNumber;
    private int marks;
    private String question;


    public Subquestion(int qN,int m, String q)
    {
        questionNumber = qN;
        marks = m;
        question = q;
    }

    public void setQuestionNumber(int q)
    {
        questionNumber = q;
    }

    public int getQuestionNumber()
    {
        return questionNumber;
    }

    public void setMarks(int m)
    {
        marks = m;
    }
    
    public int getMarks()
    {
        return marks;
    }

    public void setQuestion(String q)
    {
        question=q;
    }

    public String getQuestion()
    {
        return question;
    }
}
