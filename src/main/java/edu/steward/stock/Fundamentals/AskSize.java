package edu.steward.stock.Fundamentals;

/**
 * Created by mrobins on 4/22/17.
 */
public class AskSize implements Fundamental<AskSize> {
    private double askSize;

    public AskSize(double askSize) {
      this.askSize = askSize;
    }

    @Override
    public Double getValue() {
      return askSize;
    }

    @Override
    public Long getTime() {
      return System.currentTimeMillis() / 1000;
    }

  @Override
  public String toString() {
    return "Ask Size";
  }
}
