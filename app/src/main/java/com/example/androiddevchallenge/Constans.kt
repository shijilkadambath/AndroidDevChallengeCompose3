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

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.ChartData
import com.example.androiddevchallenge.data.ItemData

object Constans {

    val list = listOf(
        ItemData(
            name = "Week",
            true
        ),
        ItemData(
            name = "ETFs",
           false
        ), ItemData(
            name = "Stocks",
           false
        ), ItemData(
            name = "Funds",
           false
        ),
        ItemData(
            name = "ETFs",
            false
        ), ItemData(
            name = "Stocks",
            false
        ), ItemData(
            name = "Funds",
            false
        )

    )

    val chartList = listOf(
        ChartData(
            name = "ALK",
            "Alaska air group inc",
            "$1200","-0.54%",true,R.drawable.ic_home_alk
        ),

        ChartData(
            name = "BA",
            "Boing air group inc",
            "$1260","1.54%",false,R.drawable.ic_home_ba
        ),  ChartData(
            name = "DAL",
            "Delta air group inc",
            "$800","1.54%",true,R.drawable.ic_home_dal
        ),  ChartData(
            name = "EXP",
            "expedia air group inc",
            "$800","1.54%",false,R.drawable.ic_home_exp
        ),  ChartData(
            name = "EADSY",
            "Air bnb group inc",
            "$800","4.54%",false,R.drawable.ic_home_eadsy
        ), ChartData(
            name = "JBLU",
            "jetblue air group inc",
            "$8003","5.54%",false,R.drawable.ic_home_jblu
        ),  ChartData(
            name = "MAR",
            "Marriot group",
            "$200","43.54%",false,R.drawable.ic_home_mar
        ),  ChartData(
            name = "DAL",
            "Carnival cop",
            "$300","2.54%",false,R.drawable.ic_home_ccl
        ),  ChartData(
            name = "DAL",
            "Royal carbe inc",
            "$130","4.54%",false,R.drawable.ic_home_rcl
        ),  ChartData(
            name = "TRVL",
            "Traveloc inc",
            "$1760","3.54%",false,R.drawable.ic_home_trvl
        )
    )
}
