
public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    
    public Course(String courseName){
        this.courseName = courseName;
    }
    
    public void addStudent(String student){
        if(numberOfStudents == students.length){
            String[] temp = students.clone();
            students = new String[temp.length * 2];
            for(int i = 0; i < temp.length; i ++){
                students[0] = temp[i];
            }
        }
        
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    
    public String[] getStudents(){
        return students;
    }
    
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void dropStudent(String student){
        int studentToDropIndex = -1;
        for(int i = 0; i < students.length; i ++){
            if(students[i].equals(student)){
                studentToDropIndex = i;
                break;
            }
        }
        
        if(studentToDropIndex != -1){
            for(int i = studentToDropIndex; i < numberOfStudents; i ++){
                students[i] = students [i + 1];
            }
            numberOfStudents --;
        }
    }
    
    public void clear(){
        numberOfStudents = 0;
        students = new String[100];
    }
    
}
