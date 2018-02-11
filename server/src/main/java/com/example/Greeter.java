package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /**
  *	@param someone the name of whose has te be greeted
  *	@return the final greeting for the caller
  */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
