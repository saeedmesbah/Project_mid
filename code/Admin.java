
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class Admin extends Parent{
    
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private HashMap<String,String> foodSchedule;
    private HashMap<String,Integer> foodPrice;
    
    private int ID;
    
    
    JFrame frame;
    JList list;
    
    public Admin() {
        students=new ArrayList<Student>();
        professors=new ArrayList<Professor>();
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
        JMenuItem item3=new JMenuItem("Admin   ID: "+ID);
        
        // adding Items to menu
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        
            
        
        // menu2 about seeing password and exit
        JMenu menu2=new JMenu("Access");
        JMenuItem item4=new JMenuItem("User  Name: "+username);
        JMenuItem item5=new JMenuItem("Edit");
        JMenuItem item6=new JMenuItem("Exit");
        item6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        // adding Items to menu
        menu2.add(item4);
        menu2.add(item5);
        menu2.add(item6);
        
        // adding menu to bar
        bar.add(menu1);
        bar.add(menu2);
        
        
        frame.setJMenuBar(bar);
        
        
        // adding Bottons on west
        JPanel panel1=new JPanel(new GridLayout(7,1));
        
        JButton b1=new JButton("خانه");
        
        JButton b2=new JButton("مشخصات");
        
        JButton b3=new JButton("برنامه غذایی");
        
        JButton b4=new JButton("مشاهده دانشجوها");
        
        JButton b5=new JButton("مشاهده اساتید");
        
        JButton b6=new JButton("اضافه کردن دانشجو");
        
        JButton b7=new JButton("اضافه کردن استاد");
        
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        panel1.add(b4);
        panel1.add(b5);
        panel1.add(b6);
        panel1.add(b7);
        panel.add(panel1,BorderLayout.EAST);
        panel.setBackground(Color.lightGray);
        JLabel label=new JLabel("ادمین محترم به صحفه پرتال خود خوش امدید ");
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
    
    
    public void addNewFoodPlan(String foodName,String foodDay,Integer foodPrice){
        foodSchedule.put(foodDay, foodName);
        this.foodPrice.put(foodName, foodPrice);
    }
    
    
    public void addStudent(){
        Student s=new Student();
        super.addStudnetToList(s);
    }
    
    
    public void addProfessor(){
        Professor p=new Professor();
        super.addProfessorToList(p);
    }
    
    
}


