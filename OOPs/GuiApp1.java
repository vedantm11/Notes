
import java.awt.*;

class GuiFrm extends Frame
{

    Button b,b1;  TextField t;
    GuiFrm( )
    {
      t=new TextField(20);
      b=new Button("OK");
      b1=new Button("Not OK");

      setLayout(new FlowLayout());
      add(t);   add(b); add(b1);

      setSize(200,200);
      b.setSize(20,30);
      b1.setSize(20,30);
      setVisible(true);
      
    }

    public boolean action(Event e,Object o)
   {
        t.setText("Welcome to GUI");
      return true;
   }

}

class GuiApp1
{
  public static void main(String x[])
  {
      new GuiFrm( );    
  }
}
