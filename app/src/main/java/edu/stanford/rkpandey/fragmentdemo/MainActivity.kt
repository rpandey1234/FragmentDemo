package edu.stanford.rkpandey.fragmentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()
        }
        // Use a scope function!
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.flFragment, firstFragment)
//        transaction.commit()
        // val adam = Person("Adam").apply {
        //    age = 32
        //    city = "London"
        //}
        //println(adam)
//        val intent = Intent().apply {
//            putExtra("key1", "value1")
//            putExtra("key2", 2)
//        }

        btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                addToBackStack(null)
                commit()
            }
        }
        btnFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}
