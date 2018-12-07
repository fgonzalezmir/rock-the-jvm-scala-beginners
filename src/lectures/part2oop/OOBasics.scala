package lectures.part2oop

object OOBasics extends App{

  val person = new Person("John", 26)
  println(person.age)
  println(person.x)

  person.greet("Daniel")
  person.greet()

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge())
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.inc
  print(counter.inc.inc.inc.count)

  print(counter.inc(10).count)


}

// constructor
class Person(name: String, val age:Int = 0) {
  //body
  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")

}

// class parameters are not fields

/*
EXERCICES
 */

/*
  Novel and a Writer

  Writer: first name, surname, year
     - method fullname

  Novel: name, year of release, author
      - authorAge
      - isWrittenBu(Author)
      - copy (new year of release) = new instance of Novel

 */


class Writer(firstName: String, surname: String, val year: Int) {

  def fullname(): String = this.firstName + " " + this.surname

}

class Novel(name: String, yearRelease: Int, author: Writer){

  def authorAge(): Int = yearRelease - author.year

  def isWrittenBy(author: Writer): Boolean = this.author == author

  def copy(newYearRelease: Int): Novel = new Novel(this.name, newYearRelease, this.author)
}

/*
  Counter class
       - receives an int value
       - method current count
       - method to increment/decrement => new Counter
       - overload inc/dec to receive an amount

 */

class Counter(val count: Int = 0) {

  // immutability: returns new Counter besides increment actual counter
  // This is very important in functional programming
  def inc: Counter = {
    println("incrementing")
    new Counter(this.count + 1)
  }

  def dec: Counter = {
    println("decrementing")
    new Counter(this.count - 1)
  }

  def inc(inc:Int): Counter = {
    if (inc <= 0) this
    else this.inc.inc(inc-1)
  }

  def dec(dec:Int): Counter = {
    if (dec <= 0) this
    else this.dec.dec(dec -1)
  }


}
