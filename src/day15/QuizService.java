package day15;
import java.util.ArrayList;
import java.util.List;

public class QuizService {
    private List<QuizQuestion> questions;

    public QuizService() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(QuizQuestion question) {
        questions.add(question);
    }

    public int getNumberOfQuestions() {
        return questions.size();
    }

    public QuizQuestion getQuestion(int index) {
        if (index >= 0 && index < questions.size()) {
            return questions.get(index);
        }
        return null;
    }
}
