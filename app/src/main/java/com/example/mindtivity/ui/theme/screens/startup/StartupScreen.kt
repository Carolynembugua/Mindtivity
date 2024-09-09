package com.example.mindtivity.ui.theme.screens.startup


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mindtivity.R
import com.example.mindtivity.ui.theme.blue
import com.example.mindtivity.ui.theme.pastorange
import com.example.mindtivity.ui.theme.screens.products.BottomNavItem
import com.example.mindtivity.ui.theme.screens.products.bottomNavItems


@Composable
fun StartupScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.img_10), contentScale = ContentScale.FillHeight),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .size(width = 400.dp, height = 500.dp)
               ,
            colors = CardDefaults.cardColors(blue),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text(
                text = "RESIDY",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
            Text(
                text = "This app aims to help you find your dream house at affordable prices ",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Serif
            )

            var selected by remember { mutableIntStateOf(0) }
            Scaffold(
                bottomBar = {
                    NavigationBar (
                        containerColor = pastorange,
                        contentColor = Color.Black){
                        bottomNavItems.forEachIndexed { index, bottomNavItem ->
                            NavigationBarItem(
                                selected = index == selected,
                                onClick = {
                                    selected = index
                                    navController.navigate(bottomNavItem.route)
                                },
                                icon = {
                                    BadgedBox(
                                        badge = {
                                            if (bottomNavItem.badges != 0) {
                                                Badge (containerColor = Color.White){
                                                    Text(text = bottomNavItem.badges.toString())
                                                }
                                            } else if (bottomNavItem.hasNews) {
                                                Badge()
                                            }
                                        }
                                    ) {
                                        Icon(imageVector =
                                        if (index == selected)
                                            bottomNavItem.selectedIcon
                                        else
                                            bottomNavItem.unselectedIcon,
                                            contentDescription = bottomNavItem.title)
                                    }

                                },
                                label = {
                                    Text(text = bottomNavItem.title)
                                }
                            )
                        }
                    }
                },


        }
}

}


    val bottomNavItems = listOf(
        BottomNavItem(
            title = "Home",
            route="home",
            selectedIcon= Icons.Filled.Home,
            unselectedIcon=Icons.Outlined.Home,
            hasNews = false,
            badges=0
        ),



        BottomNavItem(
            title = "Upload",
            route="add_products",
            selectedIcon=Icons.Filled.Add,
            unselectedIcon=Icons.Outlined.Add,
            hasNews = true,
            badges=0
        ),

        BottomNavItem(
            title = "View",
            route="view_products",
            selectedIcon=Icons.Filled.Check,
            unselectedIcon=Icons.Outlined.Check,
            hasNews = true,
            badges=1
        ),

        BottomNavItem(
            title = "Dashboard",
            route="dashboard",
            selectedIcon=Icons.Filled.Info,
            unselectedIcon=Icons.Outlined.Info,
            hasNews = false,
            badges=0
        ),



        )



    data class BottomNavItem(
        val title :String,
        val route :String,
        val selectedIcon: ImageVector,
        val unselectedIcon :ImageVector,
        val hasNews :Boolean,
        val badges :Int
    )






@Composable
@Preview(showBackground = true)
fun StartupScreenPreview() {
    StartupScreen(rememberNavController())
}
