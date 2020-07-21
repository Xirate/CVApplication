package com.safiej.cvapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.DrawableCompat
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide.with(this).load("https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260").placeholder(getDrawable(R.drawable.ic_camera)).into(civ_profile_photo)
        tv_name_label.text = "Marcin Safiejko"
        tv_role_label.text = "Android Developer"
    }
}
