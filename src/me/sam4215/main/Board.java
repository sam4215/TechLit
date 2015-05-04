public class Board {
  public int space;
  public List<String> cards = new List<String>();
  cards.add("Everthing seems quiet, that's strange....");
  cards.add("Time to take a rest");
  cards.add("Fight the odd battle...");
  cards.add("This, I daresay, is quite strange...")
  public List<String, int> special = new List<String, int>
  public void start() {
    space = 1;
  }
  public void nextTurn() {
    if(space == special.get(String, Math.random())) {
      System.out.println(Special.get(Math.random());
      
    }
    System.out.println(cards.get(Math.random()));
    space++;
  }  
