package lectures.part4pm

object PatternsEverywhere extends App{

  // big idea #1
  try {
    // code
  } catch {
    case e: RuntimeException => "runtime"
    case npe: NullPointerException => "npe"
    case _ => "something else"
  }

  // catches are actually MATCHES
  /*
    try {
      // code
    } catch (e) {
      e match {
        case e: RuntimeException => "runtime"
        case npe: NullPointerException => "npe"
        case _ => "something else"
      }
    }

   */

  // big idea #2
  val tuples = List((1,2),(3,4))
  val filterTuples = for (
    (first, second) <- tuples
  ) yield first * second
  // case classes, :: operators, ...

  // big idea #3
  val tuple = (1,2,3)
  val (a, b, c) = tuple
  println(b)
  // multiple value definitions based on PATTERN MATCHING
  // ALL THE POWER

  val head :: tail = List(1,2,3)
  println(head)
  println(tail)

  // big idea #4 - NEW
  val mappedList = List(1,2,3,4).map {
    case v if v % 2 == 0 => v + " is even"
    case 1 => "the one"
    case _ => "something else"
  } // partial function literal

  val mappedList2 = List(1,2,3,4).map { x => x match {
      case v if v % 2 == 0 => v + " is even"
      case 1 => "the one"
      case _ => "something else"
    }
  }

  println(mappedList)
}
