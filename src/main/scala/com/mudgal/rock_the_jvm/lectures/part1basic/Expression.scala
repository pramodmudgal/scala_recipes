package com.mudgal.rock_the_jvm.lectures.part1basic

object Expression extends App {

  val x = 1 + 2 //Expression
  println(x)

  println(2 + 3 * 4)

  println(1 == x)
  // == !== > >=  < <=

  println(!(1 == x))
  //! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= += /= ....
  println(aVariable)

  //Instruction(DO) Vs Expression(value and or type)
  //If expression
  val aCondition = true
  val aConditionValue = if (aCondition) 6 else 3
  println(aConditionValue)
  println(if (aCondition) 6 else 3)
  println(1 + 3)

  //How we should not do it
  var i = 0
  while (i < 10) {
    //println(i)
    i += 1
  }

  //Everything is expresion in Scala

  val aWeiredValue = (aVariable = 5) // Unit ===void
  println(aWeiredValue)


  // Code block

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"

  }
  println(aCodeBlock.getClass)
}
