public class Dice {
  public int[] output = {1, 2, 3, 4, 5, 6}
  public void roll() {
    for(int i : output) {
      System.out.println("Dice roll output: " + i + "!");
    }
  }
}
