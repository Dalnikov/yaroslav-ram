package com.example.yaroslavram
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { YaroslavRamScreen() }
    }
}
@Composable
fun YaroslavRamScreen() {
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFF121212)).padding(24.dp), contentAlignment = Alignment.Center) {
        Card(shape = RoundedCornerShape(24.dp), colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1E24)), elevation = CardDefaults.cardElevation(defaultElevation = 10.dp), modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(20.dp).fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "У вас списано 128 МБ оперативки Ярославу на ГТА 6", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center, lineHeight = 26.sp)
                Spacer(modifier = Modifier.height(18.dp))
                Image(painter = painterResource(id = R.drawable.yaroslav), contentDescription = "Ярослав", contentScale = ContentScale.Crop, modifier = Modifier.fillMaxWidth().height(320.dp).clip(RoundedCornerShape(16.dp)))
                Spacer(modifier = Modifier.height(22.dp))
                Button(onClick = { Toast.makeText(context, "128 МБ списано!", Toast.LENGTH_SHORT).show() }, shape = RoundedCornerShape(14.dp), modifier = Modifier.fillMaxWidth().height(52.dp)) {
                    Text(text = "ОК", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                }
            }
        }
    }
}
