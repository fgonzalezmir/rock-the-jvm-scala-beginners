package lectures.part3fp

object TuplesAndMaps extends App {

  // tuples = finite ordered "lists"
  val aTuple = new Tuple2(2, "hello, Scala")  //Tuple2[Int, String] = (Int, String)
  val aTuple2 = (2, "Hello, Scala")

  println(aTuple._1)
  println(aTuple._2)

  println(aTuple.copy(_2 = "goodbye Java"))
  println(aTuple.swap)

  // Maps - Keys -> values
  val aMap: Map[String, Int] = Map()

  val phonebook = Map(("Jim", 555), ("Daniel", 789))
  val phonebook2 = Map("Jim" -> 555, "Daniel" -> 789) // a -> b is sugar for (a, b)

  println(phonebook)

  // map ops
  println(phonebook.contains("Jim"))
  println(phonebook("Daniel"))

  //println(phonebook("Mary")  // Crash!! Java error!

  val phonebook3 = Map(("Jim", 555), ("Daniel", 789)).withDefaultValue(-1)
  println(phonebook3("Mary"))

  // add a pairing
  val newPairing = "Mary" -> 678
  val newPhonebook = phonebook + newPairing
  println(newPhonebook)

  // functionals on maps
  // map, flatMap, filter
  println(phonebook.map(pair => pair._1.toLowerCase -> pair._2))

  // filterkeys
  println(phonebook.filterKeys(x => x.startsWith("J")))

  // mapValues
  println(phonebook.mapValues(number => number * 10))

  // conversions to other collections
  println(phonebook.toList)
  println(List(("Daniel", 555)).toMap)

  val names = List("Bob", "James", "Angela", "Mary", "Daniel", "Jim")
  println(names.groupBy(name => name.charAt(0)))


}
