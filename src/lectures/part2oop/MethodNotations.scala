package lectures.part2oop

object MethodNotations extends App{

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck?!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

    // Exercises
    // 1.
    def +(str: String): Person = new Person(s"${this.name} ($str)", this.favoriteMovie)

    // 2.
    def unary_+ : Person = new Person(this.name, this.favoriteMovie, this.age + 1)

    // 3.
    def learns(subject: String): String = s"${this.name} learns $subject"
    def learnScala: String = this learns "Scala"

    // 4.
    def apply(num: Int): String = s"${this.name} watched ${this.favoriteMovie} $num times."

  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))

  // equivalent. It is call infix notation or operator notation (syntactic sugar).
  // Only works with methods with only one parameter.
  println(mary likes "Inception")

  // "operators in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom) // hangOutWith works like an operator

  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?

  // prefix notation
  val x = -1 // equivalent 1.unary_-
  val y = 1.unary_-
  // unary_prefix only works with - + ~ !

  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary())  //equivalent

  // EXERCISES

  /*
    1. Overload the + operator
       mary + "the rockstar" => new Person with the age + 1
   */

  println((mary + "the Rockstar").apply())

  /*
    2. Add an age to the Person class
       Add an unary + operator => new person with the age + 1
   */
  println((+mary).age)

  /* 3. Add a "learns" method in the Person class => "Mary learns Scala"
        Add a learnedScala method, calls learns method with "Scala".
        Use it in postfix notation
   */

  println(mary learnScala)

  /* 4. Overload the apply method
        mary.apply(2) => "Mary watched Inception 2 times"
   */
  println(mary(10))

}
