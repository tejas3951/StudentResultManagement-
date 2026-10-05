public class StudentResult {

    private String studentName;
    private int marks1;
    private int marks2;
    private int marks3;

    public StudentResult(String studentName, int marks1, int marks2, int marks3) {
        this.studentName = studentName;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method 1: Calculate average marks
    public double calculateAverage() {
        return (marks1 + marks2 + marks3) / 3.0;
    }

    // Method 2: Calculate grade
    public String calculateGrade() {
        double average = calculateAverage();

        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method 3: Check whether student passed
    public boolean isPassed() {
        return marks1 >= 40 && marks2 >= 40 && marks3 >= 40;
    }

    // Method 4: Generate result summary
    public String getResultSummary() {
        return "Student: " + studentName
                + ", Average: " + String.format("%.2f", calculateAverage())
                + ", Grade: " + calculateGrade()
                + ", Passed: " + isPassed();
    }
}