package com.katas

object Katas {
  def chop(i: Int, arr: Array[Int], l: Int = 0, h: Int = 0): Int = {
    if (arr.length == 0) -1

    val middle =
      if (h == 0) l + (arr.length - 1 - l) / 2 else l + (h - l) / 2
    arr(middle) match {
      case x if x == i => middle
      case x if x < i  => chop(i, arr, l = middle + 1, h)
      case x if x > i  => chop(i, arr, l, h = middle - 1)
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    println(Katas.chop(3, Array()))
  }
}
