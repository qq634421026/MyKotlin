package com.aroem.demo.kotlin

import rx.Observable

/**
 *
 * Created by zhanghongyu on 2017/9/11.
 */
fun main(args: Array<String>) {
  //::方法引用
//  args.map(::m)
//  args.map {
//    println(it)
//  }
//  val text = File(ClassLoader.getSystemResource("input").path).readText()
  val text = "Asdasdsadsadasdadsfdsafsdf sdfdsfdsfds" +
      "sdfdsfdsf" +
      "sdfdsfdsfdsfsadf" +
      "dsf" +
      "sdfdfdfs" +
      "ds"
  print(text)
  Observable.from(
      text.toCharArray().asIterable()).filter { it.isWhitespace() }.groupBy { it }.map {
    o -> o.count().subscribe{
    print("$o.key")
  }
  }.subscribe()
}

fun m(s: String): String {
  println(s + "hah")
  return s + "hah"
}
//for循环
//for (arg in args) {
//  print(arg)
//}