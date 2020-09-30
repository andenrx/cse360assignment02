package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;

  public AddingMachine () {
  /**
  * Creates a new AddingMachine object.
  */
    total = 0;  // not needed - included for clarity
    history = "" + total;
  }

  public int getTotal () {
  /**
  * @return The value stored in the AddingMachine.
  */
    return total;
  }

  public void add (int value) {
  /**
  * Add a value to the total and store the computation.
  * @param  value the value to be added
  */
  	total += value;
  	history += " + " + value;
  }

  public void subtract (int value) {
  /**
  * Add a value to the total and store the computation.
  * @param  value the value to be added
  */
  	total -= value;
  	history += " - " + value;
  }

  public String toString () {
  /**
  * Formatted AddingMachine output. Displays all intermediate computations.
  * @return String consisting of the computations being performed by the AddingMachine.
  */
    return history;
  }

  public void clear() {
  /**
  * Erase the history of the AddingMachine.
  */
  	history = "" + total;
  }
}
