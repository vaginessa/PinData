package com.test.pindata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.pwidget.MainActivity5;
import com.test.pindata2.R;


/**
 * @author ljy
 */
public class MainActivity4 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main4);

    findViewById(R.id.hello4).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent i = new Intent(MainActivity4.this, MainActivity5.class);
        startActivity(i);
      }
    });
  }
}
