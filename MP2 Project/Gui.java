import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener
{
  Container two = getContentPane();
  static JLabel dateLabel = new JLabel("Date");
  static JLabel reminderLabel = new JLabel("Reminder");
  static JLabel timeLabel = new JLabel("Time");
  static JTextField month = new JTextField();
  static JLabel slash1 = new JLabel("/");
  static JLabel slash2 = new JLabel("/");
  static JLabel colon = new JLabel(":");
  static JLabel AMoPM = new JLabel("AM/PM:");
  static JTextField day = new JTextField();
  static JTextField year = new JTextField();
  static JTextField hour = new JTextField();
  static JTextField minute = new JTextField();
  static JTextField AM_PM = new JTextField();
  static JTextField reminder = new JTextField();
  static JTextField time = new JTextField();
  static JButton addButton = new JButton("Add");
  static JButton backButton = new JButton("Back");

  Container one = getContentPane();
  //static JFrame f1, f2;
  static JButton addReminder = new JButton("Add Reminder");
  static String[][] data = new String[15][3];
  static String[] columnNames = { "Date", "Time", "Reminder" };
  static JTable j = new JTable(data, columnNames);
  static JScrollPane sp = new JScrollPane(j);
  static JButton clear = new JButton("Clear List");

  static int counter = 1;
  static int counter2 = 1;

  Gui()
  {
    if(counter ==1)
    {
      oneAction();
    }
    else
    {
      twoAction();
    }
  } 

  public void setLayoutManager2() 
  {
    two.setLayout(null);
  }

  public void setLayoutManager1() 
  {
    //one.setLayout(null);
  }

  public void setLocationAndSize2() 
  {
    dateLabel.setBounds(50, 80, 100, 30);
    timeLabel.setBounds(50, 150, 100, 30);
    reminderLabel.setBounds(50, 220, 100, 30);
    month = new JTextField();
    month.setBounds(150, 80, 25, 30);
    slash1.setBounds(180, 80, 100, 30);
    day = new JTextField();
    day.setBounds(200, 80, 25, 30);
    slash2.setBounds(230, 80, 100, 30);
    year = new JTextField();
    year.setBounds(250, 80, 50, 30);
    hour = new JTextField();
    hour.setBounds(150, 150, 25, 30);
    colon.setBounds(180, 150, 100, 30);
    minute = new JTextField();
    minute.setBounds(200, 150, 25, 30);
    AMoPM.setBounds(225, 150, 75, 30);
    AM_PM = new JTextField();
    AM_PM.setBounds(275, 150, 25, 30);
    reminder = new JTextField();
    reminder.setBounds(150, 220, 150, 30);
    addButton = new JButton("Add");
    addButton.setBounds(50, 300, 100, 30);
    backButton = new JButton("Back");
    backButton.setBounds(200, 300, 100, 30);
  }

  public void setLocationAndSize1() 
  {
    j.setBounds(30, 40, 200, 300);
    j = new JTable(data, columnNames);
    sp = new JScrollPane(j);
    addReminder.setBounds(20,300,150,40);  
    clear.setBounds(200, 300, 150, 40);
  }

  public void addComponentsToContainer2() 
  {
    two.add(dateLabel);
    two.add(reminderLabel);
    two.add(timeLabel);
    two.add(dateLabel);
    two.add(month);
    two.add(day);
    two.add(year);
    two.add(hour);
    two.add(minute);
    two.add(AM_PM);
    two.add(reminder);
    two.add(addButton);
    two.add(backButton);
    two.add(slash1);
    two.add(slash2);
    two.add(colon);
    two.add(AMoPM);
  }

  public void addComponentsToContainer1() 
  {
    one.add(addReminder);
    one.add(clear);
    one.add(sp);
  }

  public void addActionEvent2() 
  {
    addButton.addActionListener(this);
    backButton.addActionListener(this);
  }

  public void addActionEvent1() 
  {
    addReminder.addActionListener(this);
    clear.addActionListener(this);
  }

  public void twoAction()
  {
    setLayoutManager2();
    setLocationAndSize2();
    addComponentsToContainer2();
    addActionEvent2();
  }

  public void oneAction()
  {
    setLayoutManager1();
    setLocationAndSize1();
    addComponentsToContainer1();
    addActionEvent1();
  }
  
  @Override
  public void actionPerformed(ActionEvent e) 
  {
    if(e.getSource() == addButton)
    {
      counter2 = 1;
      int monthText = Integer.parseInt(month.getText());
      if(monthText<1 || monthText>12)
      {
        System.out.println("Pick a month between 1 and 12");
        counter = 1;
        addButton.setEnabled(false);
        backButton.setEnabled(false);
        addReminder.setEnabled(true);
        Main.g.dispose();
        Main.main(null);
        counter2 = 2;
      }
      int dayText = Integer.parseInt(day.getText());
      int yearText = Integer.parseInt(year.getText());
      if(yearText<1)
      {
        System.out.println("Pick a year that is 1 or greater.");
        counter = 1;
        addButton.setEnabled(false);
        backButton.setEnabled(false);
        addReminder.setEnabled(true);
        Main.g.dispose();
        Main.main(null);
        counter2 = 2;
      }
      if(Main.maxD(monthText, yearText) < dayText || dayText < 1)
      {
        System.out.println("Put a day between 1 and " + Main.maxD(monthText, yearText));
        counter = 1;
        addButton.setEnabled(false);
        backButton.setEnabled(false);
        addReminder.setEnabled(true);
        Main.g.dispose();
        Main.main(null);
        counter2 = 2;
      }
      int hourText = Integer.parseInt(hour.getText());
      if(hourText < 1 || hourText > 12)
      {
        System.out.println("Pick an hour between 1 and 12");
        counter = 1;
        addButton.setEnabled(false);
        backButton.setEnabled(false);
        addReminder.setEnabled(true);
        Main.g.dispose();
        Main.main(null);
        counter2 = 2;
      }
      int minuteText = Integer.parseInt(minute.getText());
      if(minuteText < 1 || minuteText > 60)
      {
        System.out.println("Pick a number between 1 and 60 for minutes.");
        counter = 1;
        addButton.setEnabled(false);
        backButton.setEnabled(false);
        addReminder.setEnabled(true);
        Main.g.dispose();
        Main.main(null);
        counter2 = 2;
      }
      String x = AM_PM.getText();
      if(!x.equalsIgnoreCase("AM") && !x.equalsIgnoreCase("PM"))
      {
        System.out.println("You didn't put AM or PM in the AM/PM place.");
        counter = 1;
        addButton.setEnabled(false);
        backButton.setEnabled(false);
        addReminder.setEnabled(true);
        Main.g.dispose();
        Main.main(null);
        counter2 = 2;
      }
      String y = reminder.getText();
      if(y.equals(""))
      {
        System.out.println("You didn't put anything in the reminder.");
        counter = 1;
        addButton.setEnabled(false);
        backButton.setEnabled(false);
        addReminder.setEnabled(true);
        Main.g.dispose();
        Main.main(null);
        counter2 = 2;
      }
      if(counter2 == 2)
      {
        System.out.println();
      }
      if(counter2 == 1)
      {
        Date d = new Date(monthText, dayText, yearText);
        Time t = new Time(hourText, minuteText, x);
        Reminder r = new Reminder(d, t, y);
        Main.r.add(r);

        Reminder temp = new Reminder();
        for (int k = 0; k< Main.r.size(); k++) 
        {     
          for (int j = k+1; j < Main.r.size(); j++) 
          {     
            if(Main.r.get(k).getDate().getYear() > Main.r.get(j).getDate().getYear()) 
            {    
              temp = Main.r.get(k);    
              Main.r.set(k, Main.r.get(j));  
              Main.r.set(j, temp);
            }     
          }     
        }

        for (int i = 0; i<Main.r.size(); i++)
        {
          data[i][0] = Main.r.get(i).getDate().toString();
          data[i][1] = Main.r.get(i).getTime().toString();
          data[i][2] = Main.r.get(i).getReminder();
        }
        counter = 1;
        addButton.setEnabled(false);
        backButton.setEnabled(false);
        addReminder.setEnabled(true);
        Main.g.dispose();
        Main.main(null);
      }
    }

    if(e.getSource() == backButton)
    {
      addButton.setEnabled(false);
      backButton.setEnabled(false);
      addReminder.setEnabled(true);
      Main.g.dispose();
      counter = 1;
      Main.main(null);
    }

    if(e.getSource() == addReminder)
    {
      addReminder.setEnabled(false);
      addButton.setEnabled(true);
      backButton.setEnabled(true);
      counter = 2;
      Main.g.dispose();
      Main.main(null);
    }

    if(e.getSource() == clear)
    {
      Main.r.clear();
      //System.out.println(Main.r.size());
      data = new String[15][3];
      Main.g.dispose();
      Main.main(null);
    }
  }

}



