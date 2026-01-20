package Group_project;

public class Multigrade {
    private String gradeId;
    private String studentId;
    private String courseCode;
    private double score;
    private String letterGrade;
    private String semester;

    public Multigrade(String gradeId, String studentId, String courseCode, double score, String letterGrade, String semester){
        this.gradeId = gradeId;
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.score = score;
        this.letterGrade = letterGrade;
        this.semester = semester;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

   
    public String toString() {
        return "Grade{" +
                "gradeId='" + gradeId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", score=" + score +
                ", letterGrade='" + letterGrade + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }

}
