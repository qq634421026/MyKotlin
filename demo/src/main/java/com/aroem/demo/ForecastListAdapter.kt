package com.aroem.demo

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * 构造方法里传递一个参数（List）
 * Created by zhanghongyu on 2017/9/4.
 */
class ForecastListAdapter(
    val items: List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
  override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
    holder!!.textView.text = items[position]
    holder!!.textView.textSize= 20F
  }

  override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
    return ViewHolder(TextView(parent!!.context))
  }

  override fun getItemCount(): Int = items.size


  class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}