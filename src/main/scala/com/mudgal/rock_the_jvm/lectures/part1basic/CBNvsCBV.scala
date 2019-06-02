package com.mudgal.rock_the_jvm.lectures.part1basic

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("Called by value  " + x)
    println("Called by value  " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("Called by name  " + x)
    println("Called by name  " + x)
  }

  calledByValue(System.nanoTime()) //only computed value of expression is passed
  calledByName(System.nanoTime()) //Whole expression is passed (System.nanoTime)

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  //  printFirst(infinite(), 34)
  printFirst(34, infinite())


}
