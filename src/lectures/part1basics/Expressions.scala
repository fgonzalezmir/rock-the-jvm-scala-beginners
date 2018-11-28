package lectures.part1basics

object Expressions extends App{

  val x = 1 + 2  // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  print(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3
  // += -= *= /=

  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)


  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3  // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)


  var i = 0
  var aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  println(aWhile)

  // NEVER WRITE THIS AGAIN

  // EVERYTHING in Scala is an Expression

  val aWeiredValue = (aVariable = 3) // Unit === void

  println(aWeiredValue)

  // side effects: println(), whiles, reassigning


  //Code Blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"

  }

  println(aCodeBlock)

}
