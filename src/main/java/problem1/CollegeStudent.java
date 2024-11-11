package problem1;

public class CollegeStudent extends Student {
    private String studentMajor;
    private int studentYear;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);  // Call Student constructor with all its parameters
        studentMajor = major;
        studentYear = year;
    }

    // Getter methods
    public String getMajor() {
        return studentMajor;
    }

    public int getYear() {
        return studentYear;
    }

    // Setter methods
    public void setMajor(String major) {
        studentMajor = major;
    }

    public void setYear(int year) {
        studentYear = year;
    }

    // Override toString() to include all information
    @Override
    public String toString() {
        return super.toString() + ", major: " + studentMajor + ", year: " + studentYear;
    }
}