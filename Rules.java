
package quiz.game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Rules extends JFrame implements ActionListener
{
    String name;
    JButton start,back;
  Rules(String name)
  {
      this.name = name;
      getContentPane().setBackground(Color.WHITE); 
      setLayout(null);
      
       JLabel heading = new JLabel("Welcome " + name + " To Code Master");
      heading.setBounds(50, 20, 700, 30);
      add(heading);
      heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
      heading.setForeground(new Color(62,176,222));
      
      
       JLabel rules = new JLabel();
      rules.setBounds(20, 70, 700, 350);
      add(rules);
      rules.setFont(new Font("Heather", Font.PLAIN, 18));
      rules.setForeground(new Color(0,0,0));
      rules.setText(
              "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Beware of the time,there is only 20 seconds to answer each question" + "<br><br>" +
                "3. You can use lifeline only once" + "<br><br>" +
                "4. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                
            "<html>"
      );
      
      back = new JButton("Back");
      back.setBounds(250, 500, 120, 35);
      back.setBackground(new Color(135, 206, 235));
      back.addActionListener(this);
    add(back); 
    
    start = new JButton("start");
      start.setBounds(90, 500, 120, 35);
      start.setBackground(new Color(135, 206, 235));
      start.addActionListener(this);
    add(start);
    
      
      setSize(800, 650);
      setLocation(300, 100);
      setVisible(true);
  }
  
  public void actionPerformed(ActionEvent ae)
  {
      if (ae.getSource() == start)
      {
          setVisible(false);
          new Quiz(name);
          
      }
      else
      {
          setVisible(false);
          new Login();
         
      }       
                
              
  }
  
  public static void main(String[] args)
  {
      new Rules("User");
  }
}
