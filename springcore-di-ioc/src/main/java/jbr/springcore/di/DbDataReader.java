package jbr.springcore.di;

public class DbDataReader implements DataReader {

  @Override
  public String readData() {
    // your code to read data from actual database
    return "data from db";
  }

}
