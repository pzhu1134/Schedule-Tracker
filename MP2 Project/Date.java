public class Date{
  private int month;
  private int day;
  private int year;

  public Date(int month, int d, int y)
  {
    this.month = month;
    day = d;
    year = y;
  }

  public Date(){}

  public int getMonth()
  {
    return month;
  }

  public int getDay()
  {
    return day;
  }
  
  public int getYear()
  {
    return year;
  }

  public void changeDay(int a)
  {
    day = a;
  }

  public void changeMonth(int a)
  {
    month = a;
  }
  
  public void changeYear(int a)
  {
    year = a;
  }

  public String toString()
  {
    return month + "/" + day + "/" + year;
  }
}