@file:Suppress("DEPRECATION")

package com.example.jetpackcomposecatalogo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecatalogo.ui.theme.JetpackComposeCatalogoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCatalogoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //MyRow()
                    //MyColumn()
                    //MyBox()
                    MyComplexLayout()
                }

            }
        }
    }
}

@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(color = Color.Cyan), contentAlignment = Alignment.Center
        ) {
            Text(text = "Hola")
        }
        MySpacer(20)
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = Color.Red), contentAlignment = Alignment.Center
            ) {
                Text(text = "Hola")
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Hola")

            }

        }
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(color = Color.Gray), contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Hola")
        }

    }
}

@Composable
fun MySpacer(size:Int){
    Spacer(modifier = Modifier.height(size.dp))
}
@Composable
fun MyRow() {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text(text = "Ejemplo 1", modifier = Modifier.background(color = Color.Red))
        Text(text = "Ejemplo 2", modifier = Modifier.background(color = Color.Blue))
        Text(text = "Ejemplo 3", modifier = Modifier.background(color = Color.DarkGray))

    }
}

@Composable
fun MyColumn() {

    Column(
        Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            "Text 1",
            modifier = Modifier
                .background(color = Color.Red)
                .fillMaxWidth()
                .height(100.dp)

        )
        Text(
            "Text 1",
            modifier = Modifier
                .background(color = Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            "Text 1",
            modifier = Modifier
                .background(color = Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )


    }
}

@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(10.dp)
                .height(10.dp)
                .background(color = Color.Cyan)
                .verticalScroll(rememberScrollState()), contentAlignment = Alignment.Center
        ) {
            Text(text = "Hola")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeCatalogoTheme {
        //MyBox()
        //MyColumn()
        //MyRow()
        MyComplexLayout()
    }




}