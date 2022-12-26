package com.example.twitterdemo

import com.example.twitterdemo.repo.UserRepository
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainActivityTest {

    @Test
    fun check_If_Username1s_Last_DataSet_Are_Shown_As_Expected() {
        val userName = UserRepository.dataset11.userName
        val userTwit = UserRepository.dataset11.userTwit
        val result = Validator.validateInputForUser1(userName, userTwit)
        assertTrue(result)
    }

    @Test
    fun check_If_Username2s_Last_DataSet_Are_Shown_As_Expected() {
        val userName = UserRepository.dataset9.userName
        val userTwit = UserRepository.dataset9.userTwit
        val result = Validator.validateInputForUser2(userName, userTwit)
        assertTrue(result)
    }

    @Test
    fun check_If_Username3s_Last_DataSet_Are_Shown_As_Expected() {
        val userName = UserRepository.dataset10.userName
        val userTwit = UserRepository.dataset10.userTwit
        val result = Validator.validateInputForUser3(userName, userTwit)
        assertTrue(result)
    }
}