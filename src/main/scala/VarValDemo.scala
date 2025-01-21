class VarValDemo {

  def varExample(): Unit = {
    // Assign variable to a string literal.
    var animal = "cat"
    println("- Assign variable to a string literal: " + animal)

    // Reassign the variable.
    animal = "frog"
    println("- Reassign the variable: " + animal)
  }

  def valExample(): Unit = {
    // Use val for a value that cannot be reassigned.
    val color1 = "magenta"
    println(color1)

    // error: reassignment to val
    // color1 = "cat"

    // Use a separate val.
    val color2 = "aqua"
    println(color2)
  }

  def valTypeExample(): Unit = {
    // No type is specified, so Int is used.
    val size1 = 10

    // Specify a Double type.
    val size2: Double = 10

    println(size1)
    println(size2)
  }

}
