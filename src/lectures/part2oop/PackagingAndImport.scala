package lectures.part2oop

import java.sql

import playground.{PrinceCharming, Cinderella => Princess}
import java.util.Date
import java.sql.{Date => SqlDate}

// import playground._   --> import all the package

object PackagingAndImport extends App{

  // package members (own package) are accessible bu their simple name
  val writer = new Writer("Daniel", "RockTheJVM",2018)

  // import the package
  val princess = new Princess

  // without import
  val princess2 = new playground.Cinderella // playground.Cinderella = fully quwalified name

  // packages are in hierarchy
  // matching folder structure

  // package object
  sayHello
  println(SPEED_OF_LIGHT)

  // imports
  val prince = new PrinceCharming

  // 1. use FQ names
  val d = new Date
  val sqlDate = new sql.Date(2018, 5, 4)


  // 2. use aliasing
  val sqlDate2 = new SqlDate(2018, 5, 4)

  // default imports
  // java.lang - String, Object, Exception
  // scala - Int, Nothing, Function
  // scala.Predef - println, ???



}
