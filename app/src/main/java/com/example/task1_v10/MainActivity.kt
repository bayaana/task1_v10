package com.example.task1_v10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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
    Column {
        Text("Good morning, Alex")
        Box {
            Column {
                Text("Your balance")
                Text("124 500 ₽")
                Text("+12.5%")
            }
        }
        Text("Statistics")
        Row {
            Card {
                Column {
                    Text("128")
                    Text("Orders")
                }
            }
            Card {
                Column {
                    Text("82%")
                    Text("Conversion")
                }
            }
        }
        Text("Recent activity")
        Column {
            Card {
                Row {
                    Text("Order #123")
                    Text("+4 500 ₽")
                }
            }
            Card {
                Row {
                    Text("Order #122")
                    Text("+2 300 ₽")
                }
            }
            Card {
                Row {
                    Text("Order #121")
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