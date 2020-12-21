
import java.util.*;
import javaX.swing.*;
import javax.swing.JOptionPane;

public class Control {
    
    public void start(){
        String s=JOptionPane.showInputDialog(null, "Enter: Admin-Student-Professor", "Login page !!!", JOptionPane.INFORMATION_MESSAGE);
        
        Admin a=new Admin();
        Student st=new Student();
        Professor p=new Professor();
        //while(true){
            if(s.equals("Admin")){
                a.gui1();
            }
            else if(s.equals("Student")){
                st.gui1();
            }
            else if(s.equals("Professor")){
                p.gui1();
            }
            else{
                System.out.println("hello");
                JOptionPane.showMessageDialog(null, "Wrong selection");
            }
        //}
    }
    
    
}
