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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.AppDestinations
import com.example.androiddevchallenge.Constans
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.gray900
import com.example.androiddevchallenge.ui.theme.green
import com.example.androiddevchallenge.ui.theme.white
import com.example.androiddevchallenge.ui.theme.white_light
import com.example.androiddevchallenge.ui.widget.ItemCard

@Composable
fun HomeScreen(
    navController: NavController? = null
) {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 60.dp)
                .fillMaxWidth()
                .fillMaxHeight(),
        ) {
            Column {
                Row(
                    modifier = Modifier
                        .padding(18.dp)
                ) {
                    Text(
                        modifier = Modifier
                            .weight(1f),
                        textAlign = TextAlign.Center,
                        text = "ACCOUNT",
                        style = MaterialTheme.typography.button,
                        color = white,
                    )
                    Text(
                        modifier = Modifier
                            .weight(1f),
                        text = "WATCHLIST",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.button,
                        color = white_light,
                    )
                    Text(
                        modifier = Modifier
                            .weight(1f),
                        text = "PROFILE",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.button,
                        color = white_light,
                    )
                }
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "Balance",

                    style = MaterialTheme.typography.subtitle1,
                    color = white,
                )
                Text(
                    modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
                    textAlign = TextAlign.Center,
                    text = "$75,589.01",
                    style = MaterialTheme.typography.h1,
                    color = white,
                )
                Text(
                    modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
                    textAlign = TextAlign.Center,
                    text = "+412.35 today",
                    style = MaterialTheme.typography.subtitle1,
                    color = green,
                )
                Button(
                    onClick = {
                        navController!!.navigate(AppDestinations.HOME)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .requiredHeight(48.dp)
                        .clip(CircleShape),
                ) {
                    Text(
                        text = "TRANSACT",
                        style = MaterialTheme.typography.button,
                        color = gray900,
                    )
                }

                LazyRow(modifier = Modifier.padding(top = 16.dp, start = 16.dp)) {
                    items(Constans.list) { item ->
                        ItemCard(item)
                        Spacer(modifier = Modifier.size(8.dp))
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .padding(top = 16.dp, start = 16.dp, end = 16.dp)
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_home_illos),
                        contentDescription = null,

                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth(),
                        contentScale = ContentScale.Fit
                    )
                }
                Spacer(modifier = Modifier.requiredWidth(8.dp))
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
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun HomeScreenLight() {
    MyTheme {
        HomeScreen()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun HomeScreenDark() {
    MyTheme(darkTheme = true) {
        HomeScreen()
    }
}
