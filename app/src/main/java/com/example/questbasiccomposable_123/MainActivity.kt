package com.example.questbasiccomposable_123

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_123.ui.theme.QuestBasicComposable_123Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_123Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicComposable(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun BasicComposable(modifier: Modifier = Modifier){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "Login",
            style = TextStyle(fontSize = 50.sp,
            fontWeight = FontWeight.Bold)
        )
        Text(text = "Halaman Login")
        Image(painter = painterResource(
            id = R.drawable.logo_umy
        ),
            contentDescription = null,
            modifier = Modifier.padding(vertical = 30.dp).size(250.dp))
        Text(text = "Nama : ",
            style = TextStyle(fontSize = 20.sp)
        )
        Text(text = "Anggi Puspita",
            style = TextStyle(fontSize = 23.sp,
                fontWeight = FontWeight.Bold, color = Color.Red
            ))
        Text(text = "20220140123",
            style = TextStyle(fontSize = 35.sp, fontStyle = FontStyle.Italic)
        )

    }
}



