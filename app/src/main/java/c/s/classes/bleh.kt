package c.s.classes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bleh.*
import kotlinx.android.synthetic.main.activity_main.*


class bleh : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bleh)
        val i= Intent()
        var e=i.getStringExtra("email")
        emails.setText(e)
        var p=i.getStringExtra("pass")
        passwords.setText(p)


    }
}
