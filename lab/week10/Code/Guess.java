package lab9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Guess extends JFrame{
    JTextField t1, t2, t3, t4;
    JLabel j4; 
    ButtonListener bl1;
    ButtonListener2 bl2;
    ButtonListener3 bl3;    

    int rand=(int) (Math.random()*1000); 


    public Guess(){
        Container c = getContentPane();        
        c.setLayout(null);   
        c.setBackground(Color.white); 

        JTextField j=new JTextField("I have a number between 1 and 1000. Can you guess my number?",20);
        j.setForeground(Color.PINK);
        j.setFont(new Font("Helvetica",Font.BOLD,24));
        j.setSize(800,40);
        j.setLocation(20,40);
        j.setEditable(false);

        t1=new JTextField(10);
        t1.setSize(150,30);
        t1.setLocation(250,140);

        j4=new JLabel("Hey player guess the random number");
        j4.setForeground(Color.ORANGE);
        j4.setFont(new Font("Helvetica",Font.PLAIN,17));
        j4.setSize(230,20);
        j4.setLocation(290,190);

        JButton b1=new JButton("Guess");
        b1.setSize(150,40);
        b1.setLocation(460,140);
        bl1=new ButtonListener();        
        b1.addActionListener(bl1);


        JButton b3=new JButton("Play Again");    
        b3.setSize(120,30);
        b3.setLocation(330,270);    
        bl3=new ButtonListener3();        
        b3.addActionListener(bl3);

         
        c.add(j4);    
        c.add(j);    
        c.add(t1);
        c.add(b1);    
        c.add(b3);        

        setTitle("Number Guesser");        

        setSize(550,350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
 private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int a = Integer.parseInt(t1.getText());
            if(a<rand){
                 getContentPane().setBackground(Color.blue);
                 j4.setText("TOO LOW");
            }    
            else if(a>rand){
                getContentPane().setBackground(Color.red);
                j4.setText("TOO HIGH");
            }
            else{
                 getContentPane().setBackground(Color.green);
                 j4.setText("CORRECT, YOU WIN!!!!");
                 j4.setForeground(Color.RED);
                // j.setForeground(Color.RED);
                 t1.setEditable(false);
            }
            t1.requestFocus();
            t1.selectAll();
        }
}
 private class ButtonListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            j4.setText(rand+" is the answer!");
            t1.setText("");
            t1.setEditable(false);
        }
    }        

private class ButtonListener3 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            rand=(int) (Math.random()*1000);
            t1.setText("");
            j4.setText("Try and guess my number");
            t1.setEditable(true); 
            t1.requestFocus();
            getContentPane().setBackground(Color.white);
        }
}

    public static void main(String[] args)
    {
        new Guess();
    }
 

}