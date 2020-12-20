
import java.util.*;

public class Lesson extends Parent{
    private String name;
    private String professor;
    private ArrayList<String> date;
    private ArrayList<Student> student;
    private int number;
    private int capacity;
    
    public Lesson(String professor,String name){
        this.name=name;
        this.professor=professor;
        date =new ArrayList<String>();
        student =new ArrayList<Student>();
    }
    
    public void addNum(int number){
        this.number=number;
        
    }
    
    public void addCapacity(int capacity){
        this.capacity=capacity;
        
    }
    
    
    
    public void addDate(String date){
        this.date.add(date);
    }
    
    
    public void addStudent(Student student){
        this.student.add(student);
    }
    
    public void addGradeToStudent(String studnetName,int grade){
        for(Student i:student){
            if(i.getStudnetFullName().equals(studnetName)){
                i.setGrade(getName(), grade);
            }
        }
        
    }
    
    public String getName(){
        return name;
    }
    
}
