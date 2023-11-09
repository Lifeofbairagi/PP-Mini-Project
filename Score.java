
package quiz.game;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener
{
   Score(String name, int score)
   {
       setBounds(300, 110, 800, 600);
       
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpeg"));
      JLabel image = new JLabel(i1);
      
      add(image);
      image.setBounds(0, 150, 300,250);
      
      
      JLabel heading  = new JLabel("Thank you " + name + " for participating in Code Master Quiz");
      heading.setBounds(45, 30, 700, 30);
      heading.setFont(new Font("Book Antiqua", Font.BOLD, 24));
      add(heading);
      
       JLabel lblscore  = new JLabel("You Scored " + score);
      lblscore.setBounds(350, 200, 300, 30);
      lblscore.setFont(new Font("Tahoma", Font.BOLD, 24));
      add(lblscore);
      
      JButton submit = new JButton(" Play Again ");
        submit.setBounds(320, 270, 250, 30);
        submit.setFont(new Font("Tahoma", Font.BOLD, 22));
        submit.setBackground(new Color(135, 206, 235));
        submit.setForeground(new Color(0, 0, 0));
        add(submit);
        submit.addActionListener(this);
      
      
      setVisible(true);
   }
   
   public void actionPerformed(ActionEvent ae)
   {
       setVisible(false);
       new Login();
   }
   
   public static void main(String[] args)
   {
       new Score("user", 0);
   }
}

