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
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.AppDestinations
import com.example.androiddevchallenge.Constans
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.widget.ItemChart

@Composable
fun StockChartScreen(
    navController: NavController? = null
) {
    Surface(
        color = MaterialTheme.colors.onSecondary,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 60.dp)
                .fillMaxWidth()
                .fillMaxHeight(),
        ) {

            Button(
                modifier = Modifier
                    .height(56.dp)
                    .background(color = MaterialTheme.colors.onSecondary)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.onSecondary
                ),
                onClick = { navController!!.navigate(AppDestinations.CHART) }
            ) {
                Text(
                    modifier = Modifier
                        // .align(Alignment.Center)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "Positions",
                    style = MaterialTheme.typography.subtitle1,
                    color = MaterialTheme.colors.onSurface,

                )
            }
            LazyColumn(modifier = Modifier.padding(16.dp)) {
                items(Constans.chartList) { item ->
                    ItemChart(item)
                    Spacer(modifier = Modifier.size(8.dp))
                }
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightStockChartScreen() {
    MyTheme {
        LoginScreen()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkStockChartScreen() {
    MyTheme(darkTheme = true) {
        LoginScreen()
    }
}
