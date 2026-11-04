package com.example.task1_v10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1_v10.ui.theme.Task1_v10Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Task1_v10Theme {
                FinanceScreen()
            }
        }
    }
}
@Composable
fun FinanceScreen() {
    Column (
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Good morning, Alex",
                color = Color(0xFF102044),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier.weight(1f)
            )
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFFf8fafe))
                    .border(1.dp,
                        Color(0xFFecf1f6),
                        RoundedCornerShape(8.dp))
            )
        }
        Box (
            modifier = Modifier
                .fillMaxWidth()
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0x80B3E5FC))
            ) {
                Column (
                    modifier = Modifier.padding(start = 16.dp, bottom = 4.dp)
                ) {
                    Text(
                        text = "Your balance",
                        color = Color(0xFF102044),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 32.sp
                    )
                    Text(
                        text = "124 500 ₽",
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp)
                    Text(
                        text = "+12.5%",
                        color = Color(0xFF20B86D)
                    )
                }
            }
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(50.dp))
                    .background(Color(0x90dff1f5))
                    .align(Alignment.BottomEnd)
            )
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(50.dp))
                    .background(Color(0x90cfebe9))
                    .align(Alignment.CenterEnd)
            )
        }

        Column (
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(
                text = "Statistics",
                color = Color(0xFF102044),
                fontWeight = FontWeight.Bold
            )
            Row {
                Card (
                    modifier = Modifier
                        .weight(1f)
                        .padding(end=12.dp)
                        .border(1.dp,
                            Color(0xFFecf1f6),
                            RoundedCornerShape(8.dp))
                ) {
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFf8fafe))
                    ) {
                        Column (
                            modifier = Modifier.padding(12.dp).fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "128",
                                color = Color(0xFF102044),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Orders",
                                color = Color(0xFF102044),

                                )
                        }
                    }
                }
                Card (
                    modifier = Modifier
                        .weight(1f)
                        .padding(start=12.dp)
                        .border(1.dp,
                            Color(0xFFecf1f6),
                            RoundedCornerShape(8.dp))
                ) {
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFf8fafe))
                    ) {
                        Column (
                            modifier = Modifier.padding(12.dp).fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "82%",
                                color = Color(0xFF102044),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Conversion",
                                color = Color(0xFF102044)
                            )
                        }
                    }
                }
            }
        }


        Column (
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(
                text = "Recent activity",
                color = Color(0xFF102044),
                fontWeight = FontWeight.Bold
            )
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top=4.dp)
                    .border(1.dp,
                        Color(0xFFecf1f6),
                        RoundedCornerShape(8.dp))

            ) {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(50.dp))
                            .background(Color(0xFFe6f1fa))
                    )
                    Text(
                        text="Order #123",
                        modifier= Modifier.weight(1f).padding(start = 8.dp),
                        color = Color(0xFF102044)
                    )
                    Text(
                        text = "+4 500 ₽",
                        color = Color(0xFF20B86D),
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top=4.dp)
                    .border(1.dp,
                        Color(0xFFecf1f6),
                        RoundedCornerShape(8.dp))
            ) {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(50.dp))
                            .background(Color(0xFFeaeff8))
                    )
                    Text(
                        text="Order #122",
                        modifier= Modifier.weight(1f).padding(start = 8.dp),
                        color = Color(0xFF102044)
                    )
                    Text(
                        text = "+2 300 ₽",
                        color = Color(0xFF20B86D),
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top=4.dp)
                    .border(1.dp,
                        Color(0xFFecf1f6),
                        RoundedCornerShape(8.dp))
            ) {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(50.dp))
                            .background(Color(0xFFe6f1fa))
                    )
                    Text(
                        text="Order #121",
                        modifier= Modifier.weight(1f).padding(start = 8.dp),
                        color = Color(0xFF102044)
                    )
                    Text(
                        text = "+8 900 ₽",
                        color = Color(0xFF20B86D),
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Task1_v10Theme {
        FinanceScreen()
    }
}