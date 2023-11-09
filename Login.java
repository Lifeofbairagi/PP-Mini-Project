
package quiz.game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener
{
    JButton rules,back; 
    JTextField tfname;
  Login()
  {
      getContentPane().setBackground(Color.WHITE);
      
      setLayout(null);
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/main.jpeg"));
      JLabel image = new JLabel(i1);
      
      add(image);
      image.setBounds(10, 0, 600,500 );
      
      JLabel heading = new JLabel("CODE MASTER");
      heading.setBounds(735, 80, 300, 45);
      add(heading);
      heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
      heading.setForeground(new Color(135, 206, 235));
      
      JLabel name = new JLabel("ENTER YOUR NAME");
      name.setBounds(760, 150, 300, 20);
      add(name);
      name.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
      name.setForeground(new Color(62,176,222));
      
      tfname = new JTextField();
      tfname.setBounds(775, 190, 150, 25);
      tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
      add(tfname);
      
      rules = new JButton("Rules");
      rules.setBounds(750, 230, 80, 25);
      rules.setBackground(new Color(135, 206, 235));
      rules.addActionListener(this);
    add(rules);
    
   
      back = new JButton("Back");
      back.setBounds(875, 230, 80, 25);
      back.setBackground(new Color(135, 206, 235));
      back.addActionListener(this);
    add(back); 
    
         
      
      setVisible(true);
      setSize(1200,600);
      setLocation(50,50);
  }
  
      public void actionPerformed(ActionEvent ae)
  {
      if (ae.getSource() == rules)
      {
          String name = tfname.getText();
          setVisible(false);
          new Rules(name);
          
      }
      else if(ae.getSource() == back)
      {
          setVisible(false);
      }       
                
              
  }
  
  public static void main(String[] args)
  {
      new Login();
  }
}
