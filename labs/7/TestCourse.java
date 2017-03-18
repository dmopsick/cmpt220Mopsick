
public class TestCourse {

    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Software Development 1");
        System.out.println("The created course is named " + course.getCourseName());
        
        // Add three students
        course.addStudent("Bobby");
        course.addStudent("Tim");
        course.addStudent("Phil");
        
        System.out.println("The following students are in class");
        for(int i = 0; i < course.getNumberOfStudents(); i ++){
            System.out.println(course.getStudents()[i]);
        }
        
        
        course.dropStudent("Tim");        
        
        System.out.println();
        
        System.out.println("The following students are in class");
        for(int i = 0; i < course.getNumberOfStudents(); i ++){
            System.out.println(course.getStudents()[i]);
        }
        
    }

}
