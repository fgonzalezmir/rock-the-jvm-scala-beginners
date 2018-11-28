package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(42)

  // VALS ARE INMUTABLE


  // COMPILER can infer types

  val aString: String = "hello";  val anotherString = "goodbye"

  val aBoolean: Boolean = true

  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 461
  val aLong: Long = 1231231231232342L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14


  //Variables
  var aVariable: Int = 4

  aVariable = 5 // side effects


}
