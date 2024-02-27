import java.util.ArrayList;
import java.util.List;

public class Quizqustion {
    private String Qustiontext;
    private List<String> options;
    private String CorrectAns;

    public Quizqustion(String Qustiontext){
        this.Qustiontext=Qustiontext;
        options=new ArrayList<>();
    }
    public String getQustiontext(){
        return Qustiontext;
    }
    public List<String> getOptions(){
        return options;
    }
    public void addaoption(String op){
        options.add(op);
    }
    public String getcorrectans(){
        return CorrectAns;

    }
    public void setCorrectAns(String correctAns){
        this.CorrectAns=correctAns;
    }

}
