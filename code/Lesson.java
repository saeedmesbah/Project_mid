
import java.util.*;

public class Lesson {
    private String professor;
    private ArrayList<String> date;
    private int number;
    private int capacity;
    
    public Lesson(String professor){
        this.professor=professor;
        date =new ArrayList<String>();
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
    
}
