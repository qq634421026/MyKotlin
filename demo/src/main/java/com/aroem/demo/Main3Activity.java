package com.aroem.demo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main3);
    TextView textView = new TextView(this);
  }

  public class MyView extends View {
    public MyView(Context context) {
      this(context, null);
    }

    public MyView(Context context, AttributeSet attrs) {
      this(context, attrs, 0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyle) {
      super(context, attrs, defStyle);
    }
  }
}
