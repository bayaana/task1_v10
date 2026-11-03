package com.example.task1_v10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        Text("Good morning, Alex")
        Box (
            modifier = Modifier.fillMaxWidth()
        ) {
            Column (
                modifier = Modifier.padding(16.dp)
            ) {
                Text("Your balance")
                Text("124 500 ₽")
                Text("+12.5%")
            }
        }
        Text("Statistics")
        Row {
            Card (
                modifier = Modifier.weight(1f).padding(end=12.dp)
            ) {
                Column (
                    modifier = Modifier.padding(12.dp)
                ) {
                    Text("128")
                    Text("Orders")
                }
            }
            Card (
                modifier = Modifier.weight(1f).padding(start=12.dp)
            ) {
                Column (
                    modifier = Modifier.padding(12.dp)
                ) {
                    Text("82%")
                    Text("Conversion")
                }
            }
        }

        Column (
            modifier = Modifier.padding(top=8.dp)
        ) {
            Text("Recent activity")
            Card (
                modifier = Modifier.fillMaxWidth().padding(top=4.dp)
            ) {
                Row (
                    modifier = Modifier.fillMaxWidth().padding(8.dp)
                ) {
                    Text(text="Order #123",
                        modifier= Modifier.weight(1f))
                    Text("+4 500 ₽")
                }
            }
            Card (
                modifier = Modifier.fillMaxWidth().padding(top=4.dp)
            ) {
                Row (
                    modifier = Modifier.fillMaxWidth().padding(8.dp)
                ) {
                    Text(text="Order #122",
                        modifier= Modifier.weight(1f))
                    Text("+2 300 ₽")
                }
            }
            Card (
                modifier = Modifier.fillMaxWidth().padding(top=4.dp)
            ) {
                Row (
                    modifier = Modifier.fillMaxWidth().padding(8.dp)
                ) {
                    Text(text="Order #121",
                        modifier= Modifier.weight(1f))
                    Text("+8 900 ₽")
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