package lectures.part2oop

object Inheritance extends App{

  // single class inheritance
  class Animal{
    val creatureType = "wild"
    protected def eat = println("nommom")

  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat

  cat.crunch

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // overriding
  class Dog extends Animal {
    override val creatureType: String = "pet"
    override def eat = println("crunch, crunch")
  }

  val dog = new Dog
  dog.eat
  println(dog.creatureType)

  class Dog2(override val creatureType: String) extends Animal {
    //override val creatureType: String = "pet"
    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }

  val dog2 = new Dog2("domestic")
  dog2.eat
  println(dog2.creatureType)

  // Overriding vs Overloading


  //super

  // preventing overrides
  // 1 - use final on member
  // 2 - use final on the entire class --> Not derived classes
  // 3 - seal the class = extends classes in THIS FILE. Prevents the extension in other files

  class Animal2{
    val creatureType = "wild"
    final def eat = println("nommom")

  }

  final class Animal3{
    val creatureType = "wild"
    def eat = println("nommom")

  }

  sealed class Animal4{
    val creatureType = "wild"
    def eat = println("nommom")

  }

}
