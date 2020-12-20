
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Admin {
    
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private int ID;
    
    
    JFrame frame;
    JList list;
    
    public Admin(){
        students=new ArrayList<Student>();
        professors=new ArrayList<Professor>();
    }
    
    
    public void gui1(){
        frame=new JFrame();
        frame.setSize(600, 600);
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
        
        // adding Items to menu
        menu2.add(item4);
        menu2.add(item5);
        menu2.add(item6);
        
        // adding menu to bar
        bar.add(menu1);
        bar.add(menu2);
        
        
        frame.setJMenuBar(bar);
        
        
        // adding list on west
        JPanel panel1=new JPanel();
        String[] menulist={"Edit profile","Edit food plan","class classes","add user"};
        list =new JList(menulist);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setBackground(Color.red);
        panel1.add(list);
        panel1.setBackground(Color.red);
        panel.add(panel1,BorderLayout.EAST);
        
        frame.add(panel);
    }
    
    
    public void changeUserName(String username){
        this.username=username;
    }
    
    public void changePassword(String password){
        this.password=password;
    }
    
    
    public void addFoodPlan(){}
    
    
    public void addStudent(){}
    
    
    public void addProfessor(){}
    
    
}


