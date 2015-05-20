package me.sam4215.alchemy;

import java.util.Random;

public class Dice {
  RandomInt randomInt = new RandomInt();
  public int[] output = {1, 2, 3, 4, 5, 6};
  public int outputNow;
  public void roll() {
    for(int i = 1; i < 0; i++) {
      outputNow = output[randomInt.getRandomNumber(1, 6)];
      System.out.println("Rolled number: " + outputNow + "!");
    }
  }
}