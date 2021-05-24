import java.awt.*;  
class AWTProgram extends Frame
{  
AWTProgram()
{  
Button b=new Button("click me");  
b.setBounds(30,100,80,30);   // setting button position  
add(b);              //adding button into frame  
setSize(300,300);     //frame size 300 width and 300 height  
setLayout(null);      //no layout manager  
setVisible(true);     //now frame will be visible, by default not visible  
}  

public static void main(String args[])
{  
     new AWTProgram();  
}

}  


///////////////////////////////////////////

import java.awt.*;  
class AWTProgram1 
{  
  AWTProgram1() 
{  
Frame f=new Frame();  
Button b=new Button("click me");  
b.setBounds(30,50,80,30);  
f.add(b);  
f.setSize(300,300);  
f.setLayout(null);  
f.setVisible(true);  
}  

public static void main(String args[])
{  
     new AWTProgram1 ();  
}

}
