package lectures.part2oop

object CaseClasses extends  App{

  /*
    equals, hashCode, toString
   */

  case class Person(name: String, age: Int)

  // 1. class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.name)

  // 2. Sensible toString
  //   println(instance( = println(instance.toString) // syntactic sugar
  println(jim.toString)
  println(jim)

  // 3. equals and hashCode implemented OutOfTheBox
  //    Especially important in collections
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)

  // 4. Case classes have handy copy method
  val jim3 = jim.copy()
  val jim3b = jim.copy(age = 45)
  println(jim3b)

  // 5. Case classes have companions objects
  val thePerson = Person
  val mary = Person("Mary", 23)   // apply method --> The companion serves as constructor
  println(mary)
  // In practice we don't use the new form, we use the sugar companion apply

  // 6. Case classes are serializable --> Very important when we deal with distributed systems
  // Akka

  // 7. Case classes have extractor patterns = Case cases can be used in PATTERN MATCHING

  case object UnitedKingdom{
    def name: String = "The UK of GB and NI"
  }

  /*
      Expand MyList - use case classes and case objects
   */



}
