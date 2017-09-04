package com.aroem.demo

/**
 * Created by zhanghongyu on 2017/7/17.
 */

object Demo {
  private var mDemo: Demo? = null
  val instance: Demo
    get() {
      synchronized(Demo::class.java) {
        if (mDemo == null) {
          mDemo = Demo
        }
      }
      return mDemo!!
    }
}
