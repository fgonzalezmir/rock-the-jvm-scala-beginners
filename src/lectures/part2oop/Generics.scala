package lectures.part2oop

object Generics extends App {

  class MyList[A] {
    // use the type A
  }

  class MyMap[key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  // generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  /* If Cat extends Animal --> List[Cat] extends List[Animal] ???

      possible answers:

      1. YES List[Cat] extends List[Animal] ==> COVARIANCE
   */
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  //      animalList.add(new Dog) ??? HARD QUESTION
  //      --> Add a Dog turns the list more generic. All the elements convert to Animals
  //      --> Implemented in MyList2 down.

  /*
      2. NO = INVARIANCE
   */
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  /*
    3. Hell, no! CONTRAVARIANCE
   */
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]


  // bounded types
  class Cage[A <: Animal] (animal: A)    // Only accepts subtypes of Animal
  val cage = new Cage(new Dog)

  class Car
  //val newCage = new Cage(new Car)  // => ERROR: Car is not a subtype of Animal

  class Cage2[A >: Dog] (dog: A)    // Only accepts supertypes of Dog
  val cage2 = new Cage2(new Animal)

  class MyList2[+A] {

    def add[B >: A] (element: B): MyList[B] = ???

    /*
      A = Cat <- Animal
      B = Dog <- Animal

      MyList2 --> List[Animal] and no List[Cat]
     */

    /* EXERCICES

        1. expand MyList to be generic --> exercices/MyListGeneric
     */


  }


}
