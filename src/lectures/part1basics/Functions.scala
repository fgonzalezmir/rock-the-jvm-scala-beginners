package lectures.part1basics

object Functions extends App {

  def  aFunction(a: String, b: Int): String = {

    a + " " + b

  }

  println(aFunction("Hello", 3))

  def aParameterlessFuntion(): Int = 42

  println(aParameterlessFuntion())
  println(aParameterlessFuntion)

  def aRepeatedFunction(aString: String, n: Int):String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  // 1. A greeting function (name, age) => "Hi, my name is $name and I am $name years old.

  def greeting(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }
  println(greeting("Fede", 42))

  // 2. Factorial function 1 * 2 * 3 * .. * n

  def factorial(n: Int): Int = {
    if (n == 1) 1
    else n * factorial(n-1)
  }

  println(factorial(4))

  /* 3. A Fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n - 1) + f( n - 2)
   */

  def fibonaci(n: Int): Int = {

    if (n <= 2) 1
    else fibonaci(n-1) + fibonaci(n-2)
  }

  println(fibonaci(8))

  // 4. Test if number is prime

  def prime(n: Int): Boolean = {

    def divisors(n: Int, div: Int): Boolean ={

      if(div <= 1) true
      else {
        if (n % div == 0) false
        else divisors(n, div-1)
      }

    }

    divisors(n, n-1)

  }

  println(prime(11))
  println(prime(12))

  def isPrime(n: Int): Boolean = {

    def isPrimeUntil(t: Int): Boolean ={

      if(t <= 1) true
      else n % t !=0 && isPrimeUntil(t-1)

    }

    isPrimeUntil(n / 2)

  }

  println(isPrime(11))
  println(isPrime(12))

}
