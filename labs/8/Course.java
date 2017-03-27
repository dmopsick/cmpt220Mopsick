import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;
    
    public Course(String courseName){
        this.courseName = courseName;
    }
    
    public void addStudent(String student){
        students.add(student);
        numberOfStudents++;
    }
    
    public ArrayList<String> getStudents(){
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
        for(int i = 0; i < students.size(); i ++){
            if(students.get(i).equals(student)){
                studentToDropIndex = i;
                break;
            }
        }
        
        if(studentToDropIndex != -1){
        	numberOfStudents --;
            for(int i = studentToDropIndex; i < numberOfStudents; i ++){
                students.set(i, students.get(i +1));
            }
            
        }
    }
    
    public void clear(){
        numberOfStudents = 0;
        students = new ArrayList<String>();
    }
    
}

