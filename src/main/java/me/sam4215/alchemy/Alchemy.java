public class Alchemy {
  private String name = "Alchemy";
  private String creator = "Sam";
  Board board = new Board();
  public static void main(String[] args) {
    if(args.contains("Forty-Two")) { //Sssshhhh....
      System.out.println("You win!");
      System.exit(0);
    }
    board.start();
  }
}
    
