
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;


public class Student extends Parent {
    
    private String fullname;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private int money;
    private int numclasses;
    private int average;
    private int ID;
    private ArrayList<Hold> lessonInfoHolder;
    private HashMap<String,String> food;
    
    
    JFrame frame;
    JList list;
    JPanel panel;
    
    
//    public Student(String firstname,String lastname,int ID){
//    
//    this.lastname=lastname;
//    this.firstname=firstname;
//    this.ID=ID;
//    money=0;
//    
//    }
        
    public Student(){
        panel=new JPanel();
        panel.setLayout(new BorderLayout());  
    }
    
    
    public void gui1(){
        frame=new JFrame();
        frame.setSize(1020, 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        //panel.setBackground(Color.red);
        
        
        // adding bar and menubar
        JMenuBar bar=new JMenuBar();
        
        // menu1 about information
        JMenu menu1=new JMenu("Information");
        JMenuItem item1=new JMenuItem("First Name: "+firstname);
        JMenuItem item2=new JMenuItem("Last  Name: "+lastname);
        JMenuItem item3=new JMenuItem("Student ID: "+ID);
        
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
        
        JButton b1=new JButton("خانه");
        b1.setFont(new Font("",Font.BOLD,17));
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                home();
            }
        }); 
        
        JButton b2=new JButton("شخصی");
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
        
        JButton b4=new JButton("دروس");
        b4.setFont(new Font("",Font.BOLD,17));
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lessons();
            }
        }); 
        
        JButton b5=new JButton("مالی");
        b5.setFont(new Font("",Font.BOLD,17));
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                financial();
            }
        }); 
        
        JButton b6=new JButton("رزرو غذا");
        b6.setFont(new Font("",Font.BOLD,17));
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reserveFood();
            }
        }); 
        
        JButton b7=new JButton("انتخاب کلاس");
        b7.setFont(new Font("",Font.BOLD,17));
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reserveClass();
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
        JLabel label=new JLabel("دانشجوی محترم به صحفه پرتال خود خوش آمدید ");
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
    
    
    public void increaseMoney(int money){
        this.money+=money;
    }
    
    
    public void reserveClass(String className,int number,String professor){
        Hold h=new Hold(className,professor,number,-1);
        lessonInfoHolder.add(h);
    }
    
    public void reserveFood(int price,String food,String day){
        if(price>money){
            // not enught money
        }
        else{
            money-=price;
            this.food.put(day, food);
        }
    }
    
    
    public Integer calculateAvrage(){
        
        int sum=0,counter=0;
        for(Hold i:lessonInfoHolder){
            if(i.getLessonGrade()!=-1){
                sum+=i.getLessonGrade()*i.getLessonNumber();
                counter++;
            }
        }
        return sum/counter;
    }
    
    
    public void checkNumClasses(){}
    
    
    public String studentShowInfo(){
        return null;
    }
    
    
    public void setGrade(String className,int grade){
       for(Hold i:lessonInfoHolder){
           if(i.getLessonName().equals(className)){
               i.setLessonGrade(grade);
           }
       }
    }
    
    public String getStudnetFullName(){
        return firstname+" "+lastname;
    }
    
    public void removeStudentLesson(String className){
        for(Hold i:lessonInfoHolder){
            if(i.getLessonName().endsWith(className)){
                lessonInfoHolder.remove(i);
                calculateAvrage();
            }
        }
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
    
    public void lessons(){
        
        BorderLayout layout = (BorderLayout)panel.getLayout();
        panel.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        panel.repaint();
        System.out.println("kljniun;ibi");
        
        JLabel label=new JLabel("lessons ");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setFont(new Font("",Font.BOLD,30));
        
        javax.swing.border.Border border2=BorderFactory.createLineBorder(Color.black,2);
        label.setBorder(border2);
        panel.add(label,BorderLayout.CENTER);
    }
    
    
    public void financial(){
        
        BorderLayout layout = (BorderLayout)panel.getLayout();
        panel.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        panel.repaint();
        System.out.println("kljniun;ibi");
        
        JLabel label=new JLabel("financial ");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setFont(new Font("",Font.BOLD,30));
        
        javax.swing.border.Border border2=BorderFactory.createLineBorder(Color.black,2);
        label.setBorder(border2);
        panel.add(label,BorderLayout.CENTER);
    }
    
    public void reserveFood(){
        
        BorderLayout layout = (BorderLayout)panel.getLayout();
        panel.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        panel.repaint();
        System.out.println("kljniun;ibi");
        
        JLabel label=new JLabel("reserveFood ");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setFont(new Font("",Font.BOLD,30));
        
        javax.swing.border.Border border2=BorderFactory.createLineBorder(Color.black,2);
        label.setBorder(border2);
        panel.add(label,BorderLayout.CENTER);
    }
    
    
    public void reserveClass(){
        
        BorderLayout layout = (BorderLayout)panel.getLayout();
        panel.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        panel.repaint();
        System.out.println("kljniun;ibi");
        
        JLabel label=new JLabel("reserveClass ");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setFont(new Font("",Font.BOLD,30));
        
        javax.swing.border.Border border2=BorderFactory.createLineBorder(Color.black,2);
        label.setBorder(border2);
        panel.add(label,BorderLayout.CENTER);
    }
    
}
