package com.example.twitterdemo.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.twitterdemo.repo.UserRepository

class UserViewModelProviderFactory(
    private val app: Application,
    private val newsRepository: UserRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return UserViewModel(app, newsRepository) as T
    }
}