package problem1;

public class Teacher extends Person {
    protected String teacherSubject;
    protected double teacherSalary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        teacherSubject = subject;
        teacherSalary = salary;
    }

    //Getters
    public String getSubject() {         // Changed method name
        return teacherSubject;
    }

    public double getSalary() {          // Changed method name
        return teacherSalary;
    }

    //Setters
    public void setSubject(String subject) {    // Changed method name
        this.teacherSubject = subject;
    }

    public void setSalary(double salary) {      // Changed method name
        this.teacherSalary = salary;
    }

    //ToString Method
    @Override
    public String toString() {
        return super.toString() + ", subject: " + teacherSubject + ", salary: " + teacherSalary;
    }
}