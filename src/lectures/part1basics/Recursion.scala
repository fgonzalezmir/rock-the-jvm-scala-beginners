package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{

  def factorial(n:Int): Int =
    if (n<=1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result =n * factorial(n-1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))
  // println(factorial(5000)) --> This caused stack overflow

  def anotherFactorial(n:Int): BigInt = {
    @tailrec
    def factHelper(x:Int, accumulator:BigInt): BigInt =
      if(x <= 1) accumulator
      else factHelper(x -1, x * accumulator) // TAIL RECURSION = use recursive cakk as the LAST expression

    factHelper(n, 1)
  }

  /*
    anotherFactorial(10) = factHelper(10, 1)
    = factHelper(9, 10 * 1)
    = factHelper(8, 9 * 10 * 1)
    = factHelper(7, 8 * 9 * 10 * 1)
    = ....
    = factHelper(2, 3 * 4 * ... * 8 * 9 * 10 * 1)
    = factHelper(1, 2 * 3 * 4 * ... * 8 * 9 * 10 * 1)
    = 2 * 3 * 4 * ... * 8 * 9 * 10 * 1
   */

  println(anotherFactorial(5000))

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION.

  /*
    1. Concatenate a string n times
   */

  def concatString(s: String, n: Int): String = {
    @tailrec
    def stringHelper(s:String, n:Int, accumulator: String): String = {
      if(n<=0) accumulator
      else stringHelper(s, n - 1, accumulator + s)
    }

    stringHelper(s, n, "")
  }

  println(concatString("home", 10))

  /*
    2. IsPrime function with tail recursive
   */

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {

      if (!isStillPrime) false
      else if(t <= 1) true
      else isPrimeTailrec(t-1, n % t !=0 && isStillPrime)

    }

    isPrimeTailrec(n / 2, true)

  }

  println(isPrime(2003))
  println(isPrime(629))

  /*
    3. Fibonacci function, tail recursive
   */

  def fibonacci(n: Int): BigInt = {

    @tailrec
    def fibonacciHelper(i:Int, last:Int, nextToLast:Int): Int = {
      if (i >= n) last
      else fibonacciHelper(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fibonacciHelper(2,1 , 1)

  }

  println(fibonacci(8))

}
