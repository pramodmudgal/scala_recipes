package com.mudgal.rock_the_jvm.lectures.part1basic

import scala.annotation.tailrec

object Recursion extends App {
  //@tailrec
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need to compute factorial of" + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }
  }

  //
  //  println(factorial(10))
  //  println(factorial(5000))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x < 1) accumulator
      else factHelper(x - 1, x * accumulator) //Tail recursion

    factHelper(n, 1)

  }

  @tailrec
  def concat(num: Int, str: String, accu: String): String = {
    if (num < 1) accu
    else concat(num - 1, str, str + accu)
  }

  println(concat(3, "hello", ""))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeUntil(t - 1, (n % t != 0) && isStillPrime)

    isPrimeUntil(n / 2, true)
  }

  println(isPrime(2003))
  println(isPrime(69))

  def fibbonacci(n: Int): Int = {
    @tailrec
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)
    }

    if (n < 2) 1
    else fiboTailRec(2, 1, 1)
  }

  println(fibbonacci(8))


}
