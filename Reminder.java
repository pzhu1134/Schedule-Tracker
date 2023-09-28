public class Reminder
{
  private Date date;
  private Time time;
  private String r;

  public Reminder(Date d, Time t, String r)
  {
    this.r = r;
    time = t;
    date = d;
  }
  public Reminder()
  {}
  
  public Date getDate()
  {
    return date;
  }

  public Time getTime()
  {
    return time;
  }

  public String getReminder()
  {
    return r;
  }

  public void changeR(String r)
  {
    this.r = r;
  }

  public void changeDate(Date d)
  {
    date = d;
  }

  public void changeTime(Time t)
  {
    time = t;
  }
}