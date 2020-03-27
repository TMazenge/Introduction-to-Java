import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.geom.*; 

public class MyCalculator extends JFrame implements ActionListener {


		
    static JTextField field;
    static JFrame frame;
	
    String str0, str1, str2;

	public MyCalculator(){
		
		str0 = "";
		str1 = "";
		str2 = "";	
	}
		
	public static void main(String[] args){
		field = new JTextField(16);
		
		field.setLayout(new BorderLayout());
		frame = new JFrame("MyCalculator");

        MyCalculator c = new MyCalculator();
	
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(210, 230);
		
		JPanel panel1 = new JPanel();
		panel1.add(field); 
        panel1.setBackground(Color.DARK_GRAY); 

		JPanel panel2 = new JPanel();
		
        panel2.setBackground(Color.DARK_GRAY);
  		
  		frame.add(BorderLayout.CENTER, panel1);
  		frame.add(BorderLayout.PAGE_END, panel2);

  		panel2.setLayout(new GridLayout(0, 3));
       
   		field.setEditable(false); 
   		
        JButton b0 = new JButton("0"); 
        b0.setBackground(Color.LIGHT_GRAY);

        JButton b1 = new JButton("1");
        b1.setBackground(Color.LIGHT_GRAY); 

        JButton b2 = new JButton("2");
        b2.setBackground(Color.LIGHT_GRAY); 

        JButton b3 = new JButton("3");
        b3.setBackground(Color.LIGHT_GRAY);

        JButton b4 = new JButton("4");
        b4.setBackground(Color.LIGHT_GRAY);

        JButton b5 = new JButton("5");
        b5.setBackground(Color.LIGHT_GRAY);

        JButton b6 = new JButton("6");
        b6.setBackground(Color.LIGHT_GRAY); 

        JButton b7 = new JButton("7"); 
        b7.setBackground(Color.LIGHT_GRAY);

        JButton b8 = new JButton("8");
        b8.setBackground(Color.LIGHT_GRAY); 

        JButton b9 = new JButton("9");
        b9.setBackground(Color.LIGHT_GRAY); 

        JButton beq1 = new JButton("="); 
        beq1.setBackground(Color.PINK); 

        JButton ba = new JButton("+"); 
        ba.setBackground(Color.PINK); 

        JButton bs = new JButton("-"); 
        bs.setBackground(Color.PINK); 

        JButton bd = new JButton("/"); 
        bd.setBackground(Color.PINK); 

        JButton bm = new JButton("*"); 
        bm.setBackground(Color.PINK);

        JButton beq = new JButton("C");
        beq.setBackground(Color.PINK);  

        JButton be = new JButton("."); 
        be.setBackground(Color.PINK); 
        
        bm.addActionListener(c); 
        bd.addActionListener(c); 
        bs.addActionListener(c); 
        ba.addActionListener(c); 
        b9.addActionListener(c); 
        b8.addActionListener(c); 
        b7.addActionListener(c); 
        b6.addActionListener(c); 
        b5.addActionListener(c); 
        b4.addActionListener(c); 
        b3.addActionListener(c); 
        b2.addActionListener(c); 
        b1.addActionListener(c); 
        b0.addActionListener(c); 
        be.addActionListener(c); 
        beq.addActionListener(c); 
        beq1.addActionListener(c); 
              
        
        panel2.add(b7);
        panel2.add(b8);
        panel2.add(b9);
        panel2.add(b4);
        panel2.add(b5);
       	panel2.add(b6);
       	panel2.add(b1);
        panel2.add(b2);
       	panel2.add(b3);
        panel2.add(beq);
        panel2.add(b0);
        panel2.add(be); 
        panel2.add(bs);
        panel2.add(ba);
        panel2.add(bd); 
        panel2.add(bm); 
        panel2.add(beq1);
	}

		public void actionPerformed(ActionEvent e) {
     
        String str = e.getActionCommand(); 
  
    
        if ((str.charAt(0) >= '0' && str.charAt(0) <= '9') || str.charAt(0) == '.') { 
            if (!str1.equals("")) 
                str2 = str2 + str; 
            else
                str0 = str0 + str; 
            field.setText(str0 + str1 + str2); 
        } 

        else if (str.charAt(0) == 'C') { 
            str0 = str1 = str2 = ""; 
            field.setText(str0 + str1 + str2); 
        } 

        else if (str.charAt(0) == '=') { 
  
            double value; 
            if (str1.equals("+")) 
                value = (Double.parseDouble(str0) + Double.parseDouble(str2)); 
            else if (str1.equals("-")) 
                value = (Double.parseDouble(str0) - Double.parseDouble(str2)); 
            else if (str1.equals("/")) 
                value = (Double.parseDouble(str0) / Double.parseDouble(str2)); 
            else
                value = (Double.parseDouble(str0) * Double.parseDouble(str2)); 
  
            field.setText(str0 + str1 + str2 + "=" + value); 
  
            str0 = Double.toString(value); 
  
            str1 = str2 = ""; 
        } 
        else { 
            
            if (str1.equals("") || str2.equals("")) 
                str1 = str; 

            else { 
                double value; 
  
                if (str1.equals("+")) 
                    value = (Double.parseDouble(str0) + Double.parseDouble(str2)); 
                else if (str1.equals("-")) 
                    value = (Double.parseDouble(str0) - Double.parseDouble(str2)); 
                else if (str1.equals("/")) 
                    value = (Double.parseDouble(str0) / Double.parseDouble(str2)); 
                else
                    value = (Double.parseDouble(str0) * Double.parseDouble(str2)); 
  
 
                str0 = Double.toString(value); 
  
    
                str1 = str; 
  
                str2 = ""; 
            } 
  
            field.setText(str0 + str1 + str2); 
        } 
    } 
 
}