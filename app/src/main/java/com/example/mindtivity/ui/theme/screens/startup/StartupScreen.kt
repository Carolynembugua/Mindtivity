package com.example.mindtivity.ui.theme.screens.startup

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mindtivity.R
import com.example.mindtivity.navigation.ROUT_HOME
import com.example.mindtivity.ui.theme.screens.products.BottomNavItem
import com.example.mindtivity.ui.theme.screens.products.bottomNavItems


@Composable
fun StartupScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.img_5), contentScale = ContentScale.FillBounds),
    )
    {
        Text(text = "What is your name?")
        var fullname  = "What is your name?"
        Text(text = "HELLO $fullname")


    }





}


@Composable
@Preview(showBackground = true)
fun StartupScreenPreview(){
    StartupScreen(rememberNavController())
}
