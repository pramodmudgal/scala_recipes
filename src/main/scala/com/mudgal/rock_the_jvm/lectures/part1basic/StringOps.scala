package com.mudgal.rock_the_jvm.lectures.part1basic

object StringOps extends App {

  val str: String = "Hello, I am learning scala"

  println(str.charAt(2)) //l
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))

  println(str.replace(" ", "-"))
  println(str.toLowerCase)
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  //S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, I am is $name and I am $age years old"
  val anotherGreeting = s"Hello, I am is $name and I am ${age +1} years old"

  println(anotherGreeting)

  //F-interpolators

  val speed = 1.2f
  val myth = f"$name%s can eat $speed%4.4f burgers per minute"

  println(myth)

  //raw-interpolators

  println(raw"This is a \n new line")
  val escaped = "This is a \n new line"
  println(raw"$escaped")


}
