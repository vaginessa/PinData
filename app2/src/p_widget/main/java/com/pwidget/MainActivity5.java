package com.pwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.test.pindata2.R;

/**
 * @author ljy
 */
public class MainActivity5 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // 这里的activity_main2为什么加载的是app中的，需要换一个不一样的名字
    setContentView(R.layout.activity_main2);
    findViewById(R.id.hello4).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        finish();
      }
    });
  }
}
