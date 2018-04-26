package com.pwidget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.mzule.activityrouter.annotation.Router;
import com.test.pindata.MainActivity4;
import com.test.pindata.R;

/**
 * @author Administrator
 */
@Router("main3")
public class Main3Activity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main3);

    findViewById(R.id.hello3).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent i = new Intent(Main3Activity.this, MainActivity4.class);
        startActivity(i);
      }
    });
  }
}
