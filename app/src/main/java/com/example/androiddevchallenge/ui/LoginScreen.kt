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
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.outlined.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.AppDestinations
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.black
import com.example.androiddevchallenge.ui.theme.gray900
import com.example.androiddevchallenge.ui.theme.white

@Composable
fun LoginScreen(
    navController: NavController?= null
) {
    Surface(
        color = MaterialTheme.colors.onSecondary,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
        ){
            Box( modifier = Modifier
                .fillMaxWidth()
                .weight(1f)) {
                Image(
                    painter = painterResource(R.drawable.ic_login_bg),
                    contentDescription = null,

                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = "Welcome Back",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.h2,
                    color = white,
                    modifier = Modifier
                        .padding(16.dp)
                        .align(Alignment.Center),
                )
            }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(horizontal = 16.dp, vertical = 40.dp),
        ) {

            OutlinedTextField(
                "",
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Email,
                        contentDescription = "back",
                    ) },
                onValueChange = {},
                placeholder = {
                    Text(
                        text = "Email address",
                        style = MaterialTheme.typography.body1,
                        color = MaterialTheme.colors.onSurface,
                    )
                },
                modifier = Modifier.fillMaxWidth(),
            )
            OutlinedTextField(
                "",
                onValueChange = {},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Password,
                        contentDescription = "back",
                    ) },
                placeholder = {
                    Text(
                        text = "Password",
                        style = MaterialTheme.typography.body1,
                        color = MaterialTheme.colors.onSurface,
                    )
                },
                modifier = Modifier
                    .padding(top = 8.dp)
                    .fillMaxWidth(),
            )

            Button(
                onClick = {
                    navController!!.navigate(AppDestinations.HOME)
                          },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
                    .requiredHeight(48.dp)
                    .clip(CircleShape),
            ) {
                Text(
                    text = "LOG IN",
                    style = MaterialTheme.typography.button,
                    color = gray900,
                )
            }
        }

        }
    }
}




@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightLoginScreen() {
    MyTheme {
        LoginScreen()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkLoginScreen() {
    MyTheme(darkTheme = true) {
        LoginScreen()
    }
}