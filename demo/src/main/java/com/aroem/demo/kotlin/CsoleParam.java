package com.aroem.demo.kotlin;

/**
 * Created by zhanghongyu on 2017/9/11.
 */

public class CsoleParam {
  public static void main(String... args) {
    for (String arg : args) {
      String[] split = arg.split("_");
      for (String s : split) {
        System.out.print(s);
        System.out.print(" ");
      }
    }
  }
}
