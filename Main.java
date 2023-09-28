import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Main 
{
  public static ArrayList<Reminder> r = new ArrayList<Reminder>();
  public static Date d1 = new Date();
  public static Gui g = new Gui();
  public static void main(String[] args) {

    
    // TimeZone tz2 = TimeZone.getTimeZone("EST");
    // Calendar calendar = Calendar.getInstance(tz2);
    // System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
    // System.out.println("Current Calendar's Month: " + calendar.get(Calendar.MONTH));
    // System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
    // System.out.println("Current HOUR: " + calendar.get(Calendar.HOUR));
    // System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
    // System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));
    // System.out.println("Current AM/PM: " + calendar.get(Calendar.AM_PM));
    g = new Gui();
    g.setVisible(true);
    if(Gui.counter ==1)
    {
      g.setTitle("Reminders");
      //gui.sp.getColumnHeader().setVisible(true);
    }
    else if(Gui.counter ==2)
    {
      g.setTitle("Add Reminder");
      //gui.sp.getColumnHeader().setVisible(false);

    }
    g.setBounds(10, 10, 370, 600);
    g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }



  public static int maxD(int month, int year)
  {
    int max;
    if(month ==1)
      {
    max = 31;
      }
    else if(month == 2)
    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
    max = 29;
    } 
    else {
    max = 28;
    }
    else if(month==3)
    {
    max = 31;
    }
    else if(month==4)
    {
    max = 30;
    }    
    else if(month==5)
    {
    max = 31;
    }
    else if(month==6)
    {
    max = 30;
    }
    else if(month==7)
    {
    max = 31;
    }
    else if(month==8)
    {
    max = 31;
    }
    else if(month==9)
    {
    max = 30;
    }
    else if(month==10)
    {
    max = 31;
    }
    else if(month==11)
    {
    max = 30;
    }
    else
    {
    max = 31;
    }
    return max;
  }
  
  public static void clear() 
  {
    r = new ArrayList<Reminder>(0); 
  }
}