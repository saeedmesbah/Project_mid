
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    JPanel panel;
    
    public Professor() {
        panel=new JPanel();
        panel.setLayout(new BorderLayout());
        lesson=new ArrayList<Lesson>();
        
    }
    
    
    public void gui1(){
        frame=new JFrame();
        frame.setSize(1020, 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        
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
        b1.setFont(new Font("",Font.BOLD,17));
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                home();
            }
        }); 
        
        JButton b2=new JButton("مشاهده مشخصات");
        b2.setFont(new Font("",Font.BOLD,17));
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                profile();
            }
        }); 
        
        JButton b3=new JButton("تغییر مشخصات");
        b3.setFont(new Font("",Font.BOLD,17));
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editProfile();
            }
        }); 
        
        JButton b4=new JButton("ایجاد کلاس");
        b4.setFont(new Font("",Font.BOLD,17));
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createClass();
            }
        }); 
        
        JButton b5=new JButton("لیست دانشجویان");
        b5.setFont(new Font("",Font.BOLD,17));
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentsList();
            }
        }); 
        
        JButton b6=new JButton("لیست کلاس ها");
        b6.setFont(new Font("",Font.BOLD,17));
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                classesList();
            }
        }); 
        
        JButton b7=new JButton("حذف کلاس");
        b7.setFont(new Font("",Font.BOLD,17));
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteClass();
            }
        }); 
        
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        panel1.add(b4);
        panel1.add(b5);
        panel1.add(b6);
        panel1.add(b7);
        panel.add(panel1,BorderLayout.EAST);
        panel.setBackground(Color.lightGray);
        JLabel label=new JLabel("استاد محترم به صحفه پرتال خود خوش آمدید ");
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
    
    
    public void home(){
        
        BorderLayout layout = (BorderLayout)panel.getLayout();
        panel.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        panel.repaint();
        System.out.println("kljniun;ibi");
        
        JLabel label=new JLabel("home ");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setFont(new Font("",Font.BOLD,30));
        
        javax.swing.border.Border border2=BorderFactory.createLineBorder(Color.black,2);
        label.setBorder(border2);
        panel.add(label,BorderLayout.CENTER);
    }
    
    public void profile(){
        
        BorderLayout layout = (BorderLayout)panel.getLayout();
        panel.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        panel.repaint();
        System.out.println("kljniun;ibi");
        
        JLabel label=new JLabel("profile ");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setFont(new Font("",Font.BOLD,30));
        
        javax.swing.border.Border border2=BorderFactory.createLineBorder(Color.black,2);
        label.setBorder(border2);
        panel.add(label,BorderLayout.CENTER);
    }
    
    
    public void editProfile(){
        
        BorderLayout layout = (BorderLayout)panel.getLayout();
        panel.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        panel.repaint();
        System.out.println("kljniun;ibi");
        
        JLabel label=new JLabel("editProfile ");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setFont(new Font("",Font.BOLD,30));
        
        javax.swing.border.Border border2=BorderFactory.createLineBorder(Color.black,2);
        label.setBorder(border2);
        panel.add(label,BorderLayout.CENTER);
    }
    
    
    public void studentsList(){
        
        BorderLayout layout = (BorderLayout)panel.getLayout();
        panel.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        panel.repaint();
        System.out.println("kljniun;ibi");
        
        JLabel label=new JLabel("studentsList ");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setFont(new Font("",Font.BOLD,30));
        
        javax.swing.border.Border border2=BorderFactory.createLineBorder(Color.black,2);
        label.setBorder(border2);
        panel.add(label,BorderLayout.CENTER);
    }
    
    
    public void classesList(){
        
        BorderLayout layout = (BorderLayout)panel.getLayout();
        panel.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        panel.repaint();
        System.out.println("kljniun;ibi");
        
        JLabel label=new JLabel("classesList ");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setFont(new Font("",Font.BOLD,30));
        
        javax.swing.border.Border border2=BorderFactory.createLineBorder(Color.black,2);
        label.setBorder(border2);
        panel.add(label,BorderLayout.CENTER);
    }
    
    
    public void createClass(){
        
        BorderLayout layout = (BorderLayout)panel.getLayout();
        panel.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        panel.repaint();
        System.out.println("kljniun;ibi");
        
        JLabel label=new JLabel("createClass ");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setFont(new Font("",Font.BOLD,30));
        
        javax.swing.border.Border border2=BorderFactory.createLineBorder(Color.black,2);
        label.setBorder(border2);
        panel.add(label,BorderLayout.CENTER);
    }
    
    
    public void deleteClass(){
        
        BorderLayout layout = (BorderLayout)panel.getLayout();
        panel.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        panel.repaint();
        System.out.println("kljniun;ibi");
        
        JLabel label=new JLabel("deleteClass ");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setFont(new Font("",Font.BOLD,30));
        
        javax.swing.border.Border border2=BorderFactory.createLineBorder(Color.black,2);
        label.setBorder(border2);
        panel.add(label,BorderLayout.CENTER);
    }
    
    
}
