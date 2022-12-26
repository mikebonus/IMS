package com.example.twitterdemo.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.twitterdemo.repo.UserRepository

class UserViewModel(
    app: Application,
    userRepository: UserRepository
) : AndroidViewModel(app) {

    init {
        userRepository.createDatabase()
    }
}