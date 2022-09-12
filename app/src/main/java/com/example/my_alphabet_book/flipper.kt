package com.example.my_alphabet_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ViewFlipper

class flipper : AppCompatActivity() {
    lateinit var viewflipper: ViewFlipper
    lateinit var images:ArrayList<ImageView>
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_flipper)
        viewflipper= findViewById(R.id.view_flipper)
        images=ArrayList<ImageView>()
        imageView =  ImageView(this)

        imageView.setImageResource(R.drawable.slide01)
        viewflipper.addView(imageView) //added image 1

        imageView.setImageResource(R.drawable.slide02)
        viewflipper.addView(imageView)//added image 2

        imageView.setImageResource(R.drawable.slide03)
        viewflipper.addView(imageView) //added image 3

        imageView.setImageResource(R.drawable.slide04)
        viewflipper.addView(imageView) //added image 4

        imageView.setImageResource(R.drawable.slide05)
        viewflipper.addView(imageView) //added image 5

        imageView.setImageResource(R.drawable.slide06)
        viewflipper.addView(imageView) //added image 6

        imageView.setImageResource(R.drawable.slide07)
        viewflipper.addView(imageView) //added image 7

        imageView.setImageResource(R.drawable.slide08)
        viewflipper.addView(imageView) //added image 8

        imageView.setImageResource(R.drawable.slide09)
        viewflipper.addView(imageView) // //added image 9

        imageView.setImageResource(R.drawable.slide10)
        viewflipper.addView(imageView) //added image 10

        imageView.setImageResource(R.drawable.slide11)
        viewflipper.addView(imageView) //added image 11

        imageView.setImageResource(R.drawable.slide12)
        viewflipper.addView(imageView) //added image 12

        imageView.setImageResource(R.drawable.slide13)
        viewflipper.addView(imageView) //added image 13

        imageView.setImageResource(R.drawable.slide14)
        viewflipper.addView(imageView) //added image 14

        imageView.setImageResource(R.drawable.slide15)
        viewflipper.addView(imageView) //added image 15

        imageView.setImageResource(R.drawable.slide16)
        viewflipper.addView(imageView) //added image 16

        imageView.setImageResource(R.drawable.slide17)
        viewflipper.addView(imageView) //added image 17

        imageView.setImageResource(R.drawable.slide18)
        viewflipper.addView(imageView) //added image 18

        imageView.setImageResource(R.drawable.slide19)
        viewflipper.addView(imageView) //added image 19

        imageView.setImageResource(R.drawable.slide20)
        viewflipper.addView(imageView) //added image 20

        imageView.setImageResource(R.drawable.slide21)
        viewflipper.addView(imageView) //added image 21

        imageView.setImageResource(R.drawable.slide22)
        viewflipper.addView(imageView) //added image 22

        imageView.setImageResource(R.drawable.slide23)
        viewflipper.addView(imageView) //added image 23

        imageView.setImageResource(R.drawable.slide24)
        viewflipper.addView(imageView)//added image 24

        imageView.setImageResource(R.drawable.slide25)
        viewflipper.addView(imageView)//added image 25

        imageView.setImageResource(R.drawable.slide26)
        viewflipper.addView(imageView)//added image 26



        //viewflipper.addView()
       // val
    }
}