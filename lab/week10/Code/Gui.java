package lab9;
import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    
    public Gui(){
    Container c = getContentPane();      
      c.setLayout(null);   
      Color color=new Color(224,224,224);
      c.setBackground(color); 

     JButton b1=new JButton("Okay");
        b1.setSize(90,30);
        b1.setLocation(420,10);
        
        JButton b2=new JButton("cancel");
        b2.setSize(90,30);
        b2.setLocation(420,50);
        
        JButton b3=new JButton("setup");
        b3.setSize(90,30);
        b3.setLocation(420,90);
        
        JButton b4=new JButton("help");
        b4.setSize(90,30);
        b4.setLocation(420,130);
        
        JRadioButton r1=new JRadioButton("Selection",false);
        r1.setSize(79,40);
        r1.setLocation(240,55);
        r1.setBackground(color);
        
        
        JRadioButton r2=new JRadioButton("All",true);
        r2.setSize(79,40);
        r2.setLocation(240,80);
        r2.setBackground(color);
        
        JRadioButton r3=new JRadioButton("Applet",false);
        r3.setSize(79,40);
        r3.setLocation(240,105);
        r3.setBackground(color);
        
         JTextField t1=new JTextField("Printer: MyPrinter",20);
        t1.setSize(100,40);
        t1.setLocation(200,40);
        t1.setEditable(false);
        t1.setBackground(color);
        
        JLabel t2=new JLabel("Printer: MyPrinter");
        t2.setSize(100,40);
        t2.setLocation(50,30);
        t2.setBackground(color);
        
         JLabel t3=new JLabel("Print Quality:");
        t3.setSize(105,40);
        t3.setLocation(50,127);
        t3.setBackground(color);
        
       JTextArea area=new JTextArea();
       area.setEditable(false);
        area.setBounds(50,70,75,62); 
        
        JTextArea area1=new JTextArea();
       area1.setEditable(false);
        area1.setBounds(150,70,80,62); 
        
        JTextArea area2=new JTextArea();
       area2.setEditable(false);
        area2.setBounds(300,70,105,62);
        
        JCheckBox c1=new JCheckBox("Image");
        c1.setSize(65,40);
        c1.setBackground(color);
        c1.setLocation(120,55);
        
        JCheckBox c2=new JCheckBox("Text");
        c2.setSize(65,40);
        c2.setBackground(color);
        c2.setLocation(120,80);
        
        JCheckBox c3=new JCheckBox("Code");
        c3.setSize(65,40);
        c3.setBackground(color);
        c3.setLocation(120,105);
        
        JCheckBox c4=new JCheckBox("Print to file");
        c4.setSize(100,35);
        c4.setBackground(color);
        c4.setLocation(270,132);
        
       String list[]={"high","low","medium"};        
       JComboBox cb=new JComboBox(list);    
       cb.setBounds(50,50,85,20);
       cb.setBackground(color);
       cb.setLocation(160,139);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(cb);
        c.add(r1);
        c.add(r2);
        c.add(r3);
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(t2);
        c.add(t3);
        c.add(area);
        c.add(area1);
        c.add(area2);

        setTitle("PrintWriter");        
        setSize(570,225);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
  
}
    public static void main(String[] args){
        new Gui();
    }
}