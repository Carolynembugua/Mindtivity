package com.example.mindtivity.ui.theme.screens.startup


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Delete
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
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mindtivity.R


@Composable
fun StartupScreen(navController: NavController) {
    val translucentColor = Color(0x90FFFFFF) // White with 50% opacity
    val iconColor = Color.Black // Opaque black for the icon
    val circleBackgroundColor = Color.White // Solid color for the circle
    val badgeColor = Color.Red // Background color for the badge
    // Define a color for the badge text
    val badgeTextColor = Color.White // Text color for the badge





    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.img_10), contentScale = ContentScale.FillHeight),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,


    ) {
      Card(
            modifier = Modifier
                .size(width = 400.dp, height = 500.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Transparent) ,// Set container color to transparent
            shape = RoundedCornerShape(20.dp)
        ) {
            Box(
                modifier = Modifier
                    .background(translucentColor) // Apply the translucent background color
                    .padding(start = 10.dp, end = 10.dp)
                    .fillMaxSize()
            ){
               Column {
                   Text(
                       text = "RESIDY",
                       modifier = Modifier
                           .padding(25.dp),
                       textAlign = TextAlign.Center,
                       fontSize = 25.sp
                   )
                   Text(
                       text = "This app aims to help you find your dream house at affordable prices ",
                       fontSize = 20.sp,
                       fontWeight = FontWeight.SemiBold,
                       fontFamily = FontFamily.Serif,
                       modifier = Modifier.padding(start = 25.dp, end = 25.dp)
                   )
                   Spacer(modifier = Modifier.height(20.dp))

                   Box(){
                       Row(
                           modifier = Modifier
                               .align(Alignment.Center) // Center the icons horizontally
                               .padding(16.dp) // Adjust padding around icons
                       ){
                           // First Icon
                           Box(
                               modifier = Modifier
                                   .size(70.dp) // Size of the circle
                                   .background(
                                       circleBackgroundColor,
                                       shape = CircleShape
                                   ) // Circle shape and background color
                                   .padding(8.dp), // Padding inside the circle
                               contentAlignment = Alignment.Center // Center the icon in the circle
                           ) {
                               Icon(
                                   icon = ImageVector.vectorResource(id = R.drawable.img_11),
                                   badgeCount = 9, // Example badge count
                                   text = "Bedrooms",
                                   modifier = Modifier
                                       .size(80.dp) // Size of the entire element (icon + text)
                                       .padding(8.dp) // Padding around the element

                               )

                           }
                           Spacer(modifier = Modifier.size(16.dp))
                           // Second Icon
                           Box(
                               modifier = Modifier
                                   .size(70.dp) // Size of the circle
                                   .background(
                                       circleBackgroundColor,
                                       shape = CircleShape
                                   ) // Circle shape and background color
                                   .padding(8.dp), // Padding inside the circle
                               contentAlignment = Alignment.Center // Center the icon in the circle
                           ) {
                               Icon(
                                   icon = ImageVector.vectorResource(id = R.drawable.img_12),
                                   badgeCount = 9, // Example badge count
                                   text = "Bedrooms",
                                   modifier = Modifier
                                       .size(80.dp) // Size of the entire element (icon + text)
                                       .padding(8.dp) // Padding around the element

                               )

                           }
                           Spacer(modifier = Modifier.size(16.dp))
                           // Third Icon
                           Box(
                               modifier = Modifier
                                   .size(70.dp) // Size of the circle
                                   .background(
                                       circleBackgroundColor,
                                       shape = CircleShape
                                   ) // Circle shape and background color
                                   .padding(8.dp), // Padding inside the circle
                               contentAlignment = Alignment.Center // Center the icon in the circle
                           ) {
                               Icon(
                                   icon = ImageVector.vectorResource(id = R.drawable.img_13),
                                   badgeCount = 9, // Example badge count
                                   text = "Bedrooms",
                                   modifier = Modifier
                                       .size(80.dp) // Size of the entire element (icon + text)
                                       .padding(8.dp) // Padding around the element

                               )

                           }
                           Spacer(modifier = Modifier.size(16.dp))
                           // Fourth Icon
                           Box(
                               modifier = Modifier
                                   .size(70.dp) // Size of the circle
                                   .background(
                                       circleBackgroundColor,
                                       shape = CircleShape
                                   ) // Circle shape and background color
                                   .padding(8.dp), // Padding inside the circle
                               contentAlignment = Alignment.Center // Center the icon in the circle
                           ) {
                               Icon(
                                   icon = ImageVector.vectorResource(id = R.drawable.img_14),
                                   badgeCount = 9, // Example badge count
                                   text = "Bedrooms",
                                   modifier = Modifier
                                       .size(80.dp) // Size of the entire element (icon + text)
                                       .padding(8.dp) // Padding around the element

                               )

                           }
                           Spacer(modifier = Modifier.size(16.dp))
                           Row {
                               Column {
                                   Text(text = "Ksh 30,000")

                                   Button(
                                       onClick = { /*TODO*/ },


                                   ) {
                                       Text(text = "Book Now")

                                   }
                               }
                           }









                       }
               }

            }







                }



        }

    }
}
@Composable
fun  Icon(
    icon: ImageVector,
    badgeCount: Int,
    text: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(72.dp) // Size of the circle
                .background(Color(0x80FFFFFF), shape = CircleShape) // Translucent circle background
                .padding(8.dp), // Padding inside the circle
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color.Black, // Opaque icon color
            )
            if (badgeCount > 0) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .size(16.dp)
                        .background(Color.White, shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = badgeCount.toString(),
                        color = Color.Black,
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.padding(2.dp) // Small padding inside the badge
                    )
                }
            }
        }
        Spacer(modifier = Modifier.size(4.dp)) // Space between icon and text
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Black // Ensure the text is visible

        )
    }
}




@Composable
@Preview(showBackground = true)
fun StartupScreenPreview() {
    StartupScreen(rememberNavController())
}
