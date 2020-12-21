
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Professor extends Parent{
    
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private ArrayList<Lesson> lesson;
    private int ID;
    
    JFrame frame;
    JList list;
    
    
    public Professor() {
        
        lesson=new ArrayList<Lesson>();
        
    }
    
    
    public void gui1(){
        frame=new JFrame();
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JPanel panel=new JPanel();
        panel.setLayout(new BorderLayout());
        //panel.setBackground(Color.red);
        
        
        // adding bar and menubar
        JMenuBar bar=new JMenuBar();
        
        // menu1 about information
        JMenu menu1=new JMenu("Information");
        JMenuItem item1=new JMenuItem("First Name: "+firstname);
        JMenuItem item2=new JMenuItem("Last  Name: "+lastname);
        JMenuItem item3=new JMenuItem("Doctor  ID: "+ID);
        
        // adding Items to menu
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        
            
        
        // menu2 about seeing password and exit
        JMenu menu2=new JMenu("Access");
        JMenuItem item4=new JMenuItem("User  Name: "+username);
        JMenuItem item5=new JMenuItem("Edit");
        JMenuItem item6=new JMenuItem("Exit");
        
        // adding Items to menu
        menu2.add(item4);
        menu2.add(item5);
        menu2.add(item6);
        
        // adding menu to bar
        bar.add(menu1);
        bar.add(menu2);
        
        frame.setJMenuBar(bar);
        
        // adding list on west
        JPanel panel1=new JPanel(new GridLayout(7,1));
        String[] menulist={"Edit profile","new class","grade list","edit class"};
        JButton b1=new JButton("خانه");
        
        JButton b2=new JButton("مشاهده مشخصات");
        
        JButton b3=new JButton("تغییر مشخصات");
        
        JButton b4=new JButton("ایجاد کلاس");
        
        JButton b5=new JButton("لیست دانشجویان");
        
        JButton b6=new JButton("لیست کلاس ها");
        
        JButton b7=new JButton("حذف کلاس");
        
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        panel1.add(b4);
        panel1.add(b5);
        panel1.add(b6);
        panel1.add(b7);
        panel.add(panel1,BorderLayout.EAST);
        panel.setBackground(Color.lightGray);
        JLabel label=new JLabel("استاد محترم به صحفه پرتال خود خوش امدید ");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setFont(new Font("",Font.BOLD,30));
        
        javax.swing.border.Border border=BorderFactory.createLineBorder(Color.black,2);
        label.setBorder(border);
        
        int labelWidth=label.getPreferredSize().width+0;
        int labelHeight=label.getPreferredSize().height+0;
        
        label.setPreferredSize(new Dimension(labelWidth,labelHeight));
        
        panel.add(label,BorderLayout.CENTER);
        
        frame.add(panel);
    }
    
    
    public void changeUserName(String username){
        this.username=username;
    }
    
    public void changePassword(String password){
        this.password=password;
    }
    
    
    public void addClass(){}
    
    
    public void endClass(String name){
        for(Lesson i:lesson){
            if(i.getName().equals(name)){
                lesson.remove(i);
                super.removeClass(i);
            }
        }
    }
    
    
    public void giveGrade(String className,String studentName,int grade){
        
        for(Lesson i:lesson){
            if(i.getName().equals(className)){
                i.addGradeToStudent(studentName, grade);
            }
        }
        
    }
    
    
    public String professorShowInfo(){
        return null;
    }
    
    
}
