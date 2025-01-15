@main
def main(): Unit =
  println("-----------------------------------------------------------------")
  println("Hello world! This is a summary Variables in Scala")

  /* Mutable Variable example */
  var nameMutable: String = "Mutable Variable test";
  println("- nameMutable= " + nameMutable)

  var valueMutable = 40 // another way of defining variable
  valueMutable = 32 // it works without error
  println("- valueMutable= " + valueMutable)

  println("-----------------------------------------------------------------")
  /* Immutable Variable example */
  val nameImmutable: String = "Immutable Variable test";
  println("- nameImmutable= " + nameImmutable)

  val valueImmutable = 40
  // valueImmutable = 32 // it will give an error
  println("- valueImmutable= " + valueImmutable)

  println("-----------------------------------------------------------------")
  /* Note: Scala supports multiple assignments but you can use multiple
  assignments only with immutable variables. */
  val (name1Var: Int, name2Var: String) = (2, "StringTest")
  println("- Value of multiple assignments: " + name1Var + " et " + name2Var)

  println("-----------------------------------------------------------------")
  // Variable Type Inference example
  var name1 = 40;
  val name2 = "value test";
  println("- name1= " + name1)
  println("- name2= " + name2)

  println("-----------------------------------------------------------------")

  /* Scope of Variables In Scala */

  println("- Field variable example")
  val field = new FieldExample()
  field.printXValue()

  println("- Method Parameters example")
  val testParam = new MethodParamExample();
  testParam.multiplication(5, 10)

  println("- Local Variables example")
  val varLocal = new LocalVarExample()
  varLocal.multiplication();



