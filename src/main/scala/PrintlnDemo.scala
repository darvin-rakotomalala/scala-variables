/*
  Println. In Scala 3.3 we often have console programs that perform computations.
  The programs must write data to the console—or their results will remain unknown.

  Method notes. With print, println and printf we report to the screen.
  And with methods from scala.io.StdIn we read data from the console. We build interactive programs.
 */
class PrintlnDemo {

  def printlnExample(): Unit = {
    // Use println on a string.
    println("Hello")

    // In Scala println is the same as Console.println.
    Console.println("World")

    // Use print to have no trailing newline.
    print("ABC")
    print(123)
    println()

    // Use printf with a format string.
    printf("Number = %d", 123)
  }

  /*
    String interpolation. In Scala 3.3 we can use string interpolation syntax.
    We precede the string with lowercase "s" and then use the "$" symbol to refer to variable names.
   */
  def stringInterpolation(): Unit = {
    val name = "birds"
    val color = "yellow"
    val amount = 12
    // Use string interpolation syntax for output.
    println(s"The $amount $name are $color");
  }

}
