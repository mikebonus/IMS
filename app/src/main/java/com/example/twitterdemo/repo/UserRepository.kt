package com.example.twitterdemo.repo

import com.example.twitterdemo.MainActivity.Companion.allUsersDatabase
import com.example.twitterdemo.R
import com.example.twitterdemo.model.User

class UserRepository {

    companion object {

        val dataset1 = User("@username3", "Username-3 Twit at Timestamp 1", 1, R.drawable.piano)
        val dataset2 = User("@username1", "Username-1's Twit at Timestamp 2", 2, R.drawable.teddy)
        val dataset3 = User("@username2", "Username-2 Twit at Timestamp 3", 3, R.drawable.samsung)
        val dataset4 = User("@username1", "Username-1's Twit at Timestamp 4", 4, R.drawable.cbctes)
        val dataset5 = User("@username1", "Username-1's Twit at Timestamp 5", 5, R.drawable.macbook)

        val dataset6 = User("@username2", "Username-2 Twit at Timestamp 6", 6, R.drawable.apple)
        val dataset7 = User("@username3", "Username-3 Twit at Timestamp 7", 7, R.drawable.car)
        val dataset8 = User("@username1", "Username-1's Twit at Timestamp 8", 8, R.drawable.qwer)

        val dataset9 = User("@username2", "Username-2 Twit at Timestamp 9", 9, R.drawable.taylor)                // latest data for USER 1 (@ TimeStamp 9)
        val dataset10 = User("@username3", "Username-3 Twit at Timestamp 10", 10, R.drawable.cell)           // latest data for USER 3 (@ TimeStamp 10)
        val dataset11 = User("@username1", "Username-1's Twit at Timestamp 11", 11, R.drawable.soccerball)      // latest data for USER 2 (@ TimeStamp 11)

    }

    fun createDatabase() {

        allUsersDatabase.add(dataset1)
        allUsersDatabase.add(dataset2)
        allUsersDatabase.add(dataset3)
        allUsersDatabase.add(dataset4)
        allUsersDatabase.add(dataset5)
        allUsersDatabase.add(dataset6)
        allUsersDatabase.add(dataset7)
        allUsersDatabase.add(dataset8)
        allUsersDatabase.add(dataset9)
        allUsersDatabase.add(dataset10)
        allUsersDatabase.add(dataset11)

    }
}