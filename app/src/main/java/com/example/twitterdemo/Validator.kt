package com.example.twitterdemo

object Validator {

    fun validateInputForUser1(userName: String?, userTwit: String?): Boolean {
        return userName == "@username1" && userTwit == "Username-1's Twit at Timestamp 11"
    }

    fun validateInputForUser2(userName: String?, userTwit: String?): Boolean {
        return userName == "@username2" && userTwit == "Username-2 Twit at Timestamp 9"
    }

    fun validateInputForUser3(userName: String?, userTwit: String?): Boolean {
        return userName == "@username3" && userTwit == "Username-3 Twit at Timestamp 10"
    }
}