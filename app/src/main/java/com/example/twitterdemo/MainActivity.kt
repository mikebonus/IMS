package com.example.twitterdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.twitterdemo.model.User
import com.example.twitterdemo.repo.UserRepository
import com.example.twitterdemo.viewmodel.UserViewModel
import com.example.twitterdemo.viewmodel.UserViewModelProviderFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: UserViewModel
    companion object {
        val allUsersDatabase = arrayListOf<User>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initSetup()
        searchDatabase()

    }

    private fun initSetup() {
        val viewModelProviderFactory = UserViewModelProviderFactory(application, UserRepository())
        viewModel = ViewModelProvider(this, viewModelProviderFactory)[UserViewModel::class.java]
    }

    private fun searchDatabase() {

        btn_user_fetch.setOnClickListener {
            var foundUserTwit = ""
            var foundUserImage: Int
            val userEnteredInput = edt_user_input?.text

            for (i in allUsersDatabase.size - 1 downTo 0) {
                if (userEnteredInput.toString() == allUsersDatabase[i].userName) {
                    foundUserTwit = allUsersDatabase[i].userTwit.toString()
                    foundUserImage = allUsersDatabase[i].userImage!!.toInt()

                    val intent = Intent(this, ProfileActivity::class.java)
                    intent.putExtra("foundUserTwit", foundUserTwit)
                    intent.putExtra("foundUserImage", foundUserImage)
                    startActivity(intent)
                    break
                }
            }
        }
    }
}
