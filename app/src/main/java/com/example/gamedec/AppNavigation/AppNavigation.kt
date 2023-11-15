package com.example.gamedec.AppNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gamedec.LoginPage.LoginPage
import com.example.gamedec.SignUpPage.SignupPage
import landingpage.LandingPage

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "landingPage"
    ){
        composable("landingPage") {
            LandingPage(navController)
        }

        composable("loginPage") {
            LoginPage(navController)
        }


        composable("signupPage") {
            SignupPage(navController)
        }

    }
}



