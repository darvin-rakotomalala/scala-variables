/*
  Scala Type Inference makes it optional to specify the type of variable provided that type mismatch is handled.
  Scala automatically detects the type of the variable without explicitly specified by the user.
  Syntax : val variable_name : Scala_data_type = value
 */
class TypeInferenceDemo {

  def typeInferenceExample1(): Unit = {
    // prints a double value
    val a: Double = 7.893
    println(a)
    println(a.getClass)
  }

  def typeInferenceExample2(): Unit = {
    // type inference
    println("Scala Data Types")
    val number = 5
    val big_number = 100000000L
    val small_number = 1
    val double_number = 2.50
    val float_number = 2.50f
    val string_of_characters = "This is a string of characters"
    val byte = 0xc
    val character = 'D'
    val empty: Unit = ()

    println(number)
    println(big_number)
    println(small_number)
    println(double_number)
    println(float_number)
    println(string_of_characters)
    println(byte)
    println(character)
    println(empty)
  }

}
