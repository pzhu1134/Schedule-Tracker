public class Time
{
  private int hour;
  private int minute;
  private String AM_PM;

  public Time(int h, int m, String a)
  {
    hour = h;
    this.minute = m;
    AM_PM = a;
  }

  public String getHour()
  {
    if(hour<10)
    return "0"+hour;
    else
    return ""+hour;
  }

  public String getMinute()
  {
    if(minute<10){
    return "0" + minute;}
    else{
    return ""+minute;}
  }

  public String getAM_PM()
  {
    return AM_PM;
  }

  public void changeHour(int a)
  {
    hour = a;
  }

  public void changeMinute(int a)
  {
    minute = a;
  }

  public void changeAM_PM(String a)
  {
    AM_PM = a;
  }

  public String toString()
  {
    return getHour()+":"+getMinute()+" "+ AM_PM;
  }

  
}