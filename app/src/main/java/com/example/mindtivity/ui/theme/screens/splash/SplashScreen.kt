package com.example.mindtivity.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.mindtivity.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavController
import com.example.mindtivity.navigation.ROUT_SIGNUP
import com.example.mindtivity.ui.theme.ory
import com.example.mindtivity.ui.theme.pastory
import com.example.mindtivity.ui.theme.pastpurple
import com.example.mindtivity.ui.theme.purple
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()){

        //navigation FOR SPLASHSCREEN
        val coroutine = rememberCoroutineScope()
        coroutine.launch{
            delay(3000)
            navController.navigate(ROUT_SIGNUP)

        }
        //END


        Card(modifier = Modifier
            .fillMaxWidth()
            .height(5600.dp),
            colors = CardDefaults.cardColors(pastpurple)

        ){
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ){

                Image(
                    painter =painterResource(id = R.drawable.img_4) ,
                    contentDescription ="product",
                    modifier = Modifier.size(200.dp)
                )
                Text(
                    text = "Welcome to Mindivity",
                    fontSize = 40.sp,
                    color = Color.White,
                    fontFamily = FontFamily.Cursive
                )
                Text(
                    text = " Ellevate Your Mental Wellness Journey ",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold
                )

            }

        }
        Spacer(modifier = Modifier.height(50.dp))





    }



}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}
