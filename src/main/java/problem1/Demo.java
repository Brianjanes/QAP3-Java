package problem1;

public class Demo {
    public static void main(String[] args) {
        // Create a Person object
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println("Person: " + bob);

        // Create a Student object
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println("Student: " + lynne);

        // Create a Teacher object
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println("Teacher: " + mrJava);

        // Create a CollegeStudent object
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println("College Student: " + ima);

        // You can also test some of the getter/setter methods
        System.out.println("\nTesting some getter/setter methods:");

        // Test Teacher methods
        System.out.println("Mr. Java's subject: " + mrJava.getSubject());
        mrJava.setSalary(60000);
        System.out.println("Mr. Java's new salary: " + mrJava.getSalary());

        // Test CollegeStudent methods
        System.out.println("Ima's major: " + ima.getMajor());
        ima.setYear(2);
        System.out.println("Ima's new year: " + ima.getYear());
    }
}
