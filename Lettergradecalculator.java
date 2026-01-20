package Group_project;


	public class Lettergradecalculator extends Calculatorgrade {

	    
	    public String calculateLetterGrade(double score) {
	        if (score >= 90) return "A";
	        if (score >= 80) return "B";
	        if (score >= 70) return "C";
	        if (score >= 60) return "D";
	        return "F";
	    }

	    
	    public double calculateGradePoint(double score) {
	        if (score >= 90) return 4.0;
	        if (score >= 80) return 3.0;
	        if (score >= 70) return 2.0;
	        if (score >= 60) return 1.0;
	        return 0.0;
	    }
	}



