package com.mudgal.rock_the_jvm.lectures.part1basic

object DefaultArgs extends App {

  def tailRecussiveFactorial(n: Int, accumulator: Int = 1): Int = {
    if (n < 1) accumulator
    else tailRecussiveFactorial(n - 1, n * accumulator)

  }

  //println(tailRecussiveFactorial(10,1))
  println(tailRecussiveFactorial(10))

  def savePicture(format:String = "jpg",
                  width:Int = 1920,
                  height:Int = 1080):Unit = println("Saving picture")
  savePicture(format = "bmp")
}
