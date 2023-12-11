package com.rajkumar.spoton

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rajkumar.spoton.ui.theme.SpotOnAppTheme

class DatailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpotOnAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),

                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
           .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
//                .offset(x = 17.dp,
//                    y = 0.dp)
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(brush = Brush.radialGradient(
                        0f to Color(0xff8f8371),
                        1f to Color(0xff6f6863),
                        center = Offset(215.85f, 299.23f),
                        radius = 243.2f)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 145.24462890625.dp,
                        y = (70.33221435546875).dp)
                    .requiredWidth(width = 92.dp)
                    .requiredHeight(height = 135.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bitmap),
                    contentDescription = "Bitmap",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .requiredWidth(width = 89.dp)
                        .requiredHeight(height = 134.dp)
                        .rotate(degrees = 0.77f))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 10.4945068359375.dp,
                        y = 261.dp)
                    .requiredWidth(width = 339.dp)
                    .requiredHeight(height = 334.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 82.9065933227539.dp,
                            end = 61.111595153808594.dp,
                            top = 281.dp,
                            bottom = 18.18719482421875.dp)
                ) {
                    val context = LocalContext.current
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                context.startActivity(Intent(context,PaymentActivity::class.java))
                            }
                            .clip(shape = RoundedCornerShape(25.dp))
                            .background(color = Color(0xff19191b)))
                    Text(
                        text = "Book Now",
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 18.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.CenterStart)
                            .offset(x = 50.dp,
                                y = 0.dp)
                            .fillMaxWidth())
                }
                Text(
                    lineHeight = 1.sp,
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(
                            color = Color.White,
                            fontSize = 30.sp)
                        ) {append("Royal Tea Pendant Light")}
                        withStyle(style = SpanStyle(
                            color = Color.White,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold)
                        ) {append("")}},
                    modifier = Modifier
                        .align(alignment = Alignment.CenterStart)
                        .offset(x = 0.dp,
                            y = (-176.09359741210938).dp)
                        .fillMaxWidth())
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(end = 288.2826690673828.dp,
                            top = 72.51231384277344.dp,
                            bottom = 243.54680252075195.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = (-3).dp)
                            .requiredWidth(width = 51.dp)
                            .requiredHeight(height = 23.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.group10),
                            contentDescription = "Group 10",
                            colorFilter = ColorFilter.tint(Color(0xffffc567)),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 32.5972900390625.dp,
                                    y = 5.364532470703125.dp)
                                .requiredWidth(width = 18.dp)
                                .requiredHeight(height = 14.dp))
                        Text(
                            text = "4.5",
                            color = Color.White,
                            style = TextStyle(
                                fontSize = 20.sp),
                            modifier = Modifier
                                .align(alignment = Alignment.CenterStart)
                                .offset(x = 0.dp,
                                    y = 0.dp)
                                .fillMaxWidth())
                    }
                }
                Text(
                    lineHeight = 1.sp,
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Light)) {
                            append("A new beginning with the old basics")}
                        withStyle(style = SpanStyle(
                            color = Color(0xffffce89),
                            fontSize = 18.sp)) {append("")}},
                    modifier = Modifier
                        .align(alignment = Alignment.CenterStart)
                        .offset(x = 0.dp,
                            y = 50.906402587890625.dp)
                        .fillMaxWidth())
                Image(
                    painter = painterResource(id = R.drawable.group),
                    contentDescription = "Group",
                    colorFilter = ColorFilter.tint(Color(0xffff7e91)),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 306.1910400390625.dp,
                            y = 11.256542205810547.dp)
                        .requiredWidth(width = 21.dp)
                        .requiredHeight(height = 15.dp))
                Text(
                    text = "£",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 32.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 224.0001220703125.dp,
                            y = 55.dp))
                Text(
                    text = "200",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 32.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 252.0001220703125.dp,
                            y = 56.dp))
            }
        }
        Image(
            painter = painterResource(id = R.drawable.group11),
            contentDescription = "Group 11",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 18.dp,
                    y = 30.dp)
                .requiredWidth(width = 17.dp)
                .requiredHeight(height = 19.dp))
        Image(
            painter = painterResource(id = R.drawable.bitmap),
            contentDescription = "Bitmap",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 69.dp,
                    y = 30.dp)
                .requiredWidth(width = 283.dp)
                .requiredHeight(height = 160.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SpotOnAppTheme {
        Greeting("Android")
    }
}