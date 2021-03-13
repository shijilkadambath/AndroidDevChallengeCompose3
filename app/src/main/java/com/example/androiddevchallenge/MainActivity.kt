/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.HomeScreen
import com.example.androiddevchallenge.ui.LoginScreen
import com.example.androiddevchallenge.ui.StockChartScreen
import com.example.androiddevchallenge.ui.WelcomeScreen
import com.example.androiddevchallenge.ui.theme.MyTheme

object AppDestinations {
    const val WELCOME = "welcome"
    const val LOGIN = "login"
    const val HOME = "home"
    const val CHART = "chart"
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                window.statusBarColor = MaterialTheme.colors.background.toArgb()
                MyApp()
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppDestinations.WELCOME
        // startDestination = AppDestinations.CHART
    ) {
        composable(route = AppDestinations.WELCOME) {
            WelcomeScreen(navController = navController)
        }
        composable(AppDestinations.LOGIN) {
            LoginScreen(navController = navController)
        }
        composable(AppDestinations.HOME) {
            HomeScreen(navController = navController)
        }
        composable(AppDestinations.CHART) {
            StockChartScreen(navController = navController)
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}
