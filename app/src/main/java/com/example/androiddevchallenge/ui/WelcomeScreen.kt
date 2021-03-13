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

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.AppDestinations
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.*
import kotlinx.coroutines.launch

@Composable
fun WelcomeScreen(
    navController: NavController? = null
) {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Box {
            Image(
                painter = painterResource(R.drawable.ic_welcome_bg),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Image(
                painterResource(R.drawable.ic_logo),
                modifier = Modifier.align(Alignment.Center),
                contentDescription = null,
            )

            Row(
                modifier = Modifier
                    .padding(start = 16.dp,end = 16.dp,top = 32.dp,bottom = 32.dp)
                    .align(Alignment.BottomCenter)
            ) {
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .requiredHeight(48.dp)
                        .clip(CircleShape),

                    onClick = { }
                ) {
                    Text(text ="GET STARTED",color = gray900)
                }
                Spacer(modifier = Modifier.requiredWidth(8.dp))
                Button(
                    modifier = Modifier
                        .requiredHeight(48.dp)
                        .clip(CircleShape)
                        .border(
                            border = BorderStroke(
                                width = 1.dp,
                                color = MaterialTheme.colors.primary
                            ),
                            shape = CircleShape,
                        )
                        .weight(1f),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Transparent
                    ),
                    onClick = { navController!!.navigate(AppDestinations.LOGIN)}
                ) {
                    Text(text ="LOG IN",
                            color = yellow)
                }
            }

        }


    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun WelcomePreview() {
    MyTheme {
        WelcomeScreen()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkWelcomePreview() {
    MyTheme(darkTheme = true) {
        WelcomeScreen()
    }
}