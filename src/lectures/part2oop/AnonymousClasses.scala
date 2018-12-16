package lectures.part2oop

object AnonymousClasses extends App{

  abstract class Animal {
    def eat: Unit
  }

  // anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahahahahahahahahah")
  }

  /*
  equivalent with

  class AnonymousClasses$$anon$1 extends Animal {
    override def eat: Unit =  println("ahahahahahahahahahah")
  }

  val funny animal: Animal = AnonymousClasses$$anon$1

  The compiler make this behind the scenes

  */


  println(funnyAnimal.getClass)

  class Person(name: String) {
    def SayHi: Unit = println(s"Hi, my name is $name, how can I help?")
  }

  val jim = new Person("Jim") {
    override def SayHi: Unit = println(s"Hi, my name is Jim, how can I be of service?")
  }


}
