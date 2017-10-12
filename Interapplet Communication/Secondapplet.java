import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Secondapplet extends JApplet implements ActionListener
{
JTextField txt2;
JTextArea ta2;
JButton b2;
  public void init(){
Container c=getContentPane();
c.setLayout(new FlowLayout(FlowLayout.LEFT));
txt2=new JTextField(20);
b2=new JButton("Send");
ta2=new JTextArea(20,50);
ta2.setEditable(false);
b2.addActionListener(this);
c.add(txt2);
c.add(b2);
c.add(ta2);
    }
public void actionPerformed(ActionEvent ae)
      {

JApplet first=(JApplet)getAppletContext().getApplet("first");

((Firstapplet)first).ta1.append("Second>"+txt2.getText()+"\n");

ta2.append("Second>"+txt2.getText()+"\n");

txt2.setText("");
       }
}


