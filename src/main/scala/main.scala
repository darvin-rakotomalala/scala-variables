/*
  Var, val. We use var in Scala 3.3 to store a variable—it can be changed. A var can be reassigned.
  The val keyword, meanwhile, refers to a constant.
 */
@main
def main(): Unit =
  println("-----------------------------------------------------------------")
  println("Hello world! This is a summary Variables in Scala")

  println("Var example:")
  val varEx = new VarValDemo()
  varEx.varExample()
  println("Val example:")
  varEx.valExample()
  println("Val type example:")
  varEx.valTypeExample()

  val result = 3 + 4 // Expression
  println("Expression example: " + result)
  val unitExample: Unit = println("- This returns Unit") // Expression returning Unit

  println("-----------------------------------------------------------------")
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
  /* Note: Scala supports multiple assignments, but you can use multiple
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

  println("-----------------------------------------------------------------")
  println("Class fields example:")
  // Create a new Box instance.
  val box = new ClassFieldDemo

  // Assign width and height var fields.
  box.width = 10
  box.height = 20

  // Print fields of box instance.
  println(box.width)
  println(box.height)
  println(box.name)

  println("-----------------------------------------------------------------")
  println("Println example")
  val printlnEx = new PrintlnDemo()
  printlnEx.printlnExample()
  println()
  println("String interpolation example")
  printlnEx.stringInterpolation()

  println("-----------------------------------------------------------------")
  println("Type Inference example")
  val typeInf = new TypeInferenceDemo()
  typeInf.typeInferenceExample1()
  typeInf.typeInferenceExample2()




