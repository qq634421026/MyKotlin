package com.aroem.demo.kotlin

/**
 * 控制台输入abcdefg
 * 输出abcdefg
 * Created by zhanghongyu on 2017/9/11.
 */

enum class Lang(val hello: String) {
  ENGLISH("hellow"),
  CHINESE("你好"),
  JAPANESE("日语"),
  KOREAM("韩语");

  init {
    //构造方法
  }

  fun sayaHello() {
    print(hello)
  }

  //companion伴生对象与类一一对应类似于静态
  companion object {
    fun parse(name: String): Lang {
      return Lang.valueOf(name.toUpperCase())
    }
  }
}

//Lang扩展函数类.方法名
fun Lang.sayBye() {
  //when 有返回值
  val bye = when (this) {
    Lang.ENGLISH -> "bye"
    Lang.CHINESE -> "zaijian"
    Lang.JAPANESE -> "886"
    Lang.KOREAM -> "88888"
  }
  print(bye)
}


fun main(vararg args: String) {
  if (args.size == 0) return
  val lang = Lang.parse(args[0])
  lang.sayaHello()
  lang.sayBye()
  print(lang)
}