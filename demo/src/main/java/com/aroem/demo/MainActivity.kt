package com.aroem.demo

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Toast
import java.net.URL
import java.util.*

class MainActivity : AppCompatActivity() {
  private val items = listOf(
      "Mon 6/23 - Sunny - 31/17",
      "Tue 6/24 - Foggy - 21/8",
      "Wed 6/25 - Cloudy - 22/17",
      "Thurs 6/26 - Rainy - 18/11",
      "Fri 6/27 - Foggy - 21/10",
      "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
      "Sun 6/29 - Sunny - 20/7"
  )
  //不能自动转型
  //val 不可变量
  //var 变量
  val i: Int = 7
  val d: Double = i.toDouble()

  val FLAG1: Boolean = false
  val FLAG2: Boolean = false

  var bitwiseOr = FLAG1 or FLAG2  //java中的|
  var bitwiseAnd = FLAG1 and FLAG2//java中的&

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    var forecastList = findViewById(R.id.forecast_list) as RecyclerView
    forecastList.layoutManager = LinearLayoutManager(this)
    val adapter = ForecastListAdapter(items)
    forecastList.adapter = adapter
  }

  fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
  }

  //请求
  public class Request(val url: String) {
    public fun run() {
      val forecastJsonString = URL(url).readText()
      Log.d(javaClass.simpleName, forecastJsonString)
    }
  }

  //数据类
  //val forecast = Forecast(Date(), 12f, "asdsad")
  //val s = forecast.copy(temperature = 30f)

  data class Forecast(val data: Date, val temperature: Float,
      val details: String)

}
