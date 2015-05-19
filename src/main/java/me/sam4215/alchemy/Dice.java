package me.sam4215.alchemy;

public class Dice {
  public double[] output = {1, 2, 3, 4, 5, 6};
  public double diceRoll();
  public void roll() {
    for(double d : output) {
      System.out.println("Dice roll output: " + d + "!");
      diceRoll = d;
    }
  }
}
