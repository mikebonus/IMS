package com.example.twitterdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        loadData()
        viewSetup()

    }

    private fun loadData() {

        val receivedUserDataTwit = intent.getStringExtra("foundUserTwit")
        val receivedUserDataImage = intent.getIntExtra("foundUserImage", 1)

        tv_user_tweet.text = receivedUserDataTwit
        img_user.setImageResource(receivedUserDataImage)
    }

    private fun viewSetup() {
        btn_back_navigate.setOnClickListener {
            finish()
        }
    }
}


