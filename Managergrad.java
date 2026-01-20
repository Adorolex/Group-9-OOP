package Group_project;

import java.util.ArrayList;
import java.util.List;

public class Managergrad {

    private List<Grade> grades;
    private Servicenotification Servicenotification;
    private Calculatorgrade calculator;

    public Managergrad(Servicenotification Servicenotification, Calculatorgrade calculator) {
        this.grades = new ArrayList<>();
        this.Servicenotification = Servicenotification;
        this.calculator = calculator;
    }

    public void assignGrade(Grade grade) {
        String letter = calculator.calculateLetterGrade(grade.getScore());
        grade.setLetterGrade(letter);

        grades.add(grade);

        Servicenotification.notifyStudent(
                grade.getStudentId(),
                "New grade posted for course " + grade.getCourseCode() +
                ": " + letter
        );
    }

    public double calculateGPA() {
        double totalPoints = 0;
        int count = 0;

        for (Grade grade : grades) {
            double points = calculator.calculateGradePoint(grade.getScore());
            if (points > 0) {
                totalPoints += points;
                count++;
            }
        }
        return count == 0 ? 0.0 : totalPoints / count;
    }

    public List<Grade> getGrades() {
        return grades;
    }
}
