package com.example.my_alphabet_book

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.annotation.RequiresApi


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun ToA(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",0)
        startActivity(intent)
    }
    fun ToB(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",1)
        startActivity(intent)
    }
    fun ToC(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",2)
        startActivity(intent)
    }
    fun ToD(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",3)
        startActivity(intent)
    }
    fun ToE(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",4)
        startActivity(intent)
    }
    fun ToF(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",5)
        startActivity(intent)
    }
    fun ToG(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",6)
        startActivity(intent)
    }
    fun ToH(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",7)
        startActivity(intent)
    }
    fun ToI(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",8)
        startActivity(intent)
    }
    fun ToJ(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",9)
        startActivity(intent)
    }
    fun ToK(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",10)
        startActivity(intent)
    }
    fun ToL(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",11)
        startActivity(intent)
    }
    fun ToM(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",12)
        startActivity(intent)
    }
    fun ToN(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",13)
        startActivity(intent)
    }
    fun ToO(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",14)
        startActivity(intent)
    }
    fun ToP(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",15)
        startActivity(intent)
    }
    fun ToQ(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",16)
        startActivity(intent)
    }
    fun ToR(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",17)
        startActivity(intent)
    }
    fun ToS(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",18)
        startActivity(intent)
    }
    fun ToT(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",19)
        startActivity(intent)
    }
    fun ToU(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",20)
        startActivity(intent)
    }
    fun ToV(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",21)
        startActivity(intent)
    }
    fun ToW(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",22)
        startActivity(intent)
    }
    fun ToX(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",23)
        startActivity(intent)
    }
    fun ToY(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",24)
        startActivity(intent)
    }
    fun ToZ(v: View){
        val intent = Intent(this,flipper::class.java)
        intent.putExtra("flip",25)
        startActivity(intent)
    }

    override fun onPause() {
        super.onPause()
        if (application.getSharedPreferences("my_data",Context.MODE_PRIVATE)!=null) {
            var sp = applicationContext.getSharedPreferences("my_data", Context.MODE_PRIVATE)
            sp.edit().clear()
            sp.edit().commit()
        }
    }

}