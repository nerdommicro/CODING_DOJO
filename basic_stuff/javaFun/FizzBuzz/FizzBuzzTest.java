package basic_stuff.javaFun.FizzBuzz;

import basic_stuff.javaFun.FizzBuzz;

public class FizzBuzzTest {
  public static void main(String[] args) {
    FizzBuzz fizz = new FizzBuzz();
    System.out.println("Testing the number 3 and the result is: " + fizz.fizzBuzz(3) );
    System.out.println("Testing the number 5 and the result is: " + fizz.fizzBuzz(5) );
    System.out.println("Testing the number 15 and the result is: " + fizz.fizzBuzz(15) );
    System.out.println("Testing the number 2 and the result is: " + fizz.fizzBuzz(2));
  }
  
}
