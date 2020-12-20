
import java.util.*;

public class Parent {
    
    private ArrayList<Lesson> lesson;
    private ArrayList<Professor> professor;
    private ArrayList<Student> student;
    
    
    public Parent(){
        
        lesson=new ArrayList<Lesson>();
        professor=new ArrayList<Professor>();
        student=new ArrayList<Student>();
        
    }
    
    public void addStudentToLesson(String lessonName,Student student){
        for(Lesson i:lesson){
            if(i.getName().equals(lessonName)){
                i.addStudent(student);
            }
        }
    }
    
    
    public void addLessonToList(Lesson lesson){
        this.lesson.add(lesson);        
    }
    
    public void addStudnetToList(Student student){
        this.student.add(student);
    }
    
    public void addProfessorToList(Professor professor){
        this.professor.add(professor);
    }
    
    
    public ArrayList getLesson(){
        return lesson;
    }
    
    public void removeClass(Lesson lesson){
        this.lesson.remove(lesson);
    }
    
}
