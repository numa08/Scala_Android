package net.numa08.amazonlistapp

import android.app.Activity
import android.widget.TextView
import android.os.Bundle

class MainActivity extends Activity {

  override def onCreate(savedInstanceState:Bundle) : Unit = {
    super.onCreate(savedInstanceState)
    Option(new TextView(this)).foreach(t => {t.setText("hello scala"); setContentView(t)})
  }
}
