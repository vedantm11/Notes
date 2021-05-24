import java.awt.*;
import java.awt.event.*;

class MyFrm extends Frame  implements ActionListener
{
  TextField t; 
  Button b,b1;

  MyFrm ( )
  {
    t=new JTextField(30);

    b=new JButton("Hi");

    b1=new JButton("Bye");

    add(t);  add(b); add(b1);
    setSize(400,400);
    setVisible(true);

    b.addActionListener(this);
    b1.addActionListener(this);

  }


  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource() == b)
    {
        t.setText("Good Morning..");
    }

    if(e.getSource() == b1)
    {
        t.setText("Good NIGHT..");
    }
  }

}


class MyApp
{
  public static void main(String x[])
  {  
     new MyFrm(); 
  }
}