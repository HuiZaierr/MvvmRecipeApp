package com.ych.mvvmrecipeapp.ui.leiwo.composable.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ych.mvvmrecipeapp.R
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map


@Composable
fun Home_TOP_WEATHER() {
    var flow = flowOf("111","222")
    flow.map {

    }
    Column(
        Modifier
            .background(color = colorResource(id = R.color.color_1BA200))
            .fillMaxWidth()
    ) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.area_check),
                contentDescription = "",
                Modifier
                    .size(10.dp)
                    .padding(start = 10.dp)
            )
            Spacer(modifier = Modifier.padding(start = 10.dp))
            Text(text = "朝阳区利泽西二路", color = colorResource(id = R.color.white))
        }

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Row(verticalAlignment = Alignment.Bottom) {
            Text(
                text = "36.49℃",
                Modifier.padding(start = 20.dp),
                fontSize = 20.sp, color = colorResource(id = R.color.white)
            )
            Spacer(modifier = Modifier.padding(start = 10.dp))
            Text(
                text = "西风 1级 | 湿度 21%",
                color = colorResource(id = R.color.white),
                fontSize = 10.sp
            )
        }
    }
}