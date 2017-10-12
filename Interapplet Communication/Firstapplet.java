import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//<applet code="Firstapplet.class" width="400" height="400" name="first"></applet>
//<applet code="Secondapplet.class" width="400" height="400" name="second"></applet>
public class Firstapplet extends JApplet implements ActionListener
{
JTextField txt1;
JTextArea ta1;
JButton b1;
public void init()
{
   Container c=getContentPane();
   c.setLayout(new FlowLayout(FlowLayout.LEFT));
   txt1=new JTextField(20);
   b1=new JButton("Send");
   ta1=new JTextArea(20,50);
   ta1.setEditable(false);
   b1.addActionListener(this);
   c.add(txt1);
   c.add(b1);
   c.add(ta1);
}
public void actionPerformed(ActionEvent ae)
         {
JApplet second=(JApplet)getAppletContext().getApplet("second");

((Secondapplet)second).ta2.append("First>"+txt1.getText()+"\n");

ta1.append("First>"+txt1.getText()+"\n");
             txt1.setText("");
        }
}
