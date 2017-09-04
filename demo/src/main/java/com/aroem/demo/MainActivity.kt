package com.aroem.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    tv.text = "sads"
    change.setOnClickListener {
      tv.text = "diani"
      tv.textSize = 20f
    }
  }
}
