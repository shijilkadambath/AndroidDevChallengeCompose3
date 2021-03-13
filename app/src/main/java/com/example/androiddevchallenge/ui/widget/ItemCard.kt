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
package com.example.androiddevchallenge.data

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.AppDestinations
import com.example.androiddevchallenge.ui.theme.white
import com.example.androiddevchallenge.ui.theme.yellow

@Composable
fun ItemCard(
    item: ItemData) {
    Box(
        modifier = Modifier
            .clip(CircleShape)

            .requiredHeight(40.dp)
            .border(
                border = BorderStroke(
                    width = 1.dp,
                    color = white
                ),
                shape = CircleShape,
            )
    ) {
        Row(
            modifier = Modifier
                .align(Alignment.Center)
                .padding( horizontal = 24.dp)

        ) {
            Text(
                text = item.name,
                color = white,
                textAlign = TextAlign.Center,

            )
            if (item.selected) {
                Icon(
                    imageVector = Icons.Default.ExpandMore,
                    contentDescription = "back",
                )
            }

        }
    }
}
