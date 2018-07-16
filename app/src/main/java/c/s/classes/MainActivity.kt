package c.s.classes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    public fun callme(v:View){
        val em=email.getText()
        val ps=password.getText()
        email.setText(null)
        password.setText(null)

        val i=  Intent(this, bleh::class.java)
        i.putExtra("email",em);
        i.putExtra("pass",ps);
        startActivity(i)

    }

}


