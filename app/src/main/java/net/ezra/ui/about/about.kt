//package net.ezra.ui.about
//
//import android.content.res.Configuration
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.*
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import net.ezra.R
//import net.ezra.navigation.ROUTE_ABOUT
//import net.ezra.navigation.ROUTE_HOME
//
//
//
//@Composable
//fun AboutScreen(navController: NavHostController) {
//
//
//
//
//    Column {
//        Text(text = "about")
//
//        Text(text = stringResource(id = R.string.apen))
//
//        Text(
//            modifier = Modifier
//
//                .clickable {
//                    navController.navigate(ROUTE_HOME) {
//                        popUpTo(ROUTE_ABOUT) { inclusive = true }
//                    }
//                },
//            text = "Home",
//            textAlign = TextAlign.Center,
//            color = MaterialTheme.colorScheme.onSurface
//        )
//    }
//
//}
//
//@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
//@Composable
//fun HomeScreenPreviewLight() {
//    AboutScreen(rememberNavController())
//}
//

package net.ezra.ui.ABOUT

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
//import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
//import net.ezra.navigation.ROUTE_HOME

@Composable
fun AboutScreen(navController: NavHostController) {


    Box (
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight()
    ){

        Image(painter = painterResource(id = R.drawable.cos12),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight()
                .fillMaxWidth())

        LazyColumn (
            modifier = Modifier

        ){
            item {
                Column(

                    modifier = Modifier
                        .absolutePadding(20.dp, 10.dp, 10.dp, 20.dp)

                ) {

                    Row {
                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = "NEMO COSMETICS",
                            fontFamily = FontFamily.SansSerif,
                            fontSize = 30.sp, color = Color.Black,
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier
                            .padding(5.dp)
                    ) {
                        Card {
                            Image(
                                painter = painterResource(id = R.drawable.cos10),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,

                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                    .size(100.dp,100.dp)
                            )

                            Row {


                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = "Rounded corner"
                                )
                                Text(
                                    text = "Buy now ",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                )

                                Button(
                                    onClick = {

                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_ABOUT) { inclusive = true }

                                        }
                                    },
                                    colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                                    border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                                    shape = RoundedCornerShape(12.dp)


                                ) {
                                    Text(text = "Buy")

                                }
                            }
                            Text(
                                text = "at affordable prices",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Card {
                            Image(
                                painter = painterResource(id = R.drawable.cos2),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                    .size(100.dp,100.dp)

                            )

                            Row {


                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = "Rounded corner"
                                )
                                Text(
                                    text = "Buy now ",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                )

                                Button(
                                    onClick = {
                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_ABOUT) { inclusive = true }
                                        }
                                    },
                                    colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                                    border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                                    shape = RoundedCornerShape(12.dp)


                                ) {
                                    Text(text = "Buy")

                                }
                            }
                            Text(
                                text = "at affordable prices",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                            )
                        }
                    }


                    Row(
                        modifier = Modifier
                            .padding(5.dp)
                    ) {


                        Card {
                            Image(
                                painter = painterResource(id = R.drawable.cos3),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                    .size(100.dp,100.dp)

                            )

                            Row {


                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = "Rounded corner"
                                )
                                Text(
                                    text = "Buy now ",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                )

                                Button(
                                    onClick = {
                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_ABOUT) { inclusive = true }
                                        } },
                                    colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                                    border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                                    shape = RoundedCornerShape(12.dp)


                                ) {
                                    Text(text = "Buy")

                                }
                            }
                            Text(
                                text = "at affordable prices",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Card {
                            Image(
                                painter = painterResource(id = R.drawable.cos4),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                    .size(100.dp,100.dp)
                            )

                            Row {


                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = "Rounded corner"
                                )
                                Text(
                                    text = "Buy now ",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                )

                                Button(
                                    onClick = {
                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_ABOUT) { inclusive = true }
                                        } },
                                    colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                                    border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                                    shape = RoundedCornerShape(12.dp)


                                ) {
                                    Text(text = "Buy")

                                }
                            }
                            Text(
                                text = "at affordable prices",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                            )
                        }
                    }


                    Row(
                        modifier = Modifier
                            .padding(5.dp)
                    ) {


                        Card {
                            Image(
                                painter = painterResource(id = R.drawable.cos5),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                    .size(100.dp,100.dp)
                            )

                            Row {


                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = "Rounded corner"
                                )
                                Text(
                                    text = "Buy now ",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                )

                                Button(
                                    onClick = {
                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_ABOUT) { inclusive = true }
                                        } },
                                    colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                                    border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                                    shape = RoundedCornerShape(12.dp)


                                ) {
                                    Text(text = "Buy")

                                }
                            }
                            Text(
                                text = "at affordable prices",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Card {
                            Image(
                                painter = painterResource(id = R.drawable.cos6),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                    .size(100.dp,100.dp)
                            )

                            Row {


                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = "Rounded corner"
                                )
                                Text(
                                    text = "Buy now ",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                )

                                Button(
                                    onClick = {
                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_ABOUT) { inclusive = true }
                                        } },
                                    colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                                    border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                                    shape = RoundedCornerShape(12.dp)


                                ) {
                                    Text(text = "Buy")

                                }
                            }
                            Text(
                                text = "at affordable prices",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                            )
                        }
                    }


                    Row(
                        modifier = Modifier
                            .padding(5.dp)
                    ) {


                        Card {
                            Image(
                                painter = painterResource(id = R.drawable.cos7),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                    .size(100.dp,100.dp)
                            )

                            Row {


                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = "Rounded corner"
                                )
                                Text(
                                    text = "Buy now ",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                )

                                Button(
                                    onClick = {
                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_ABOUT) { inclusive = true }
                                        } },
                                    colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                                    border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                                    shape = RoundedCornerShape(12.dp)


                                ) {
                                    Text(text = "Buy")

                                }
                            }
                            Text(
                                text = "at affordable prices",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Card {
                            Image(
                                painter = painterResource(id = R.drawable.cos8),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                    .size(100.dp,100.dp)
                            )

                            Row {


                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = "Rounded corner"
                                )
                                Text(
                                    text = "Buy now ",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                )

                                Button(
                                    onClick = {
                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_ABOUT) { inclusive = true }
                                        } },
                                    colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                                    border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                                    shape = RoundedCornerShape(12.dp)


                                ) {
                                    Text(text = "Buy")

                                }
                            }
                            Text(
                                text = "at affordable prices",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                            )
                        }
                    }

                    Row(
                        modifier = Modifier
                            .padding(5.dp)
                    ) {


                        Card {
                            Image(
                                painter = painterResource(id = R.drawable.cos9),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                    .size(100.dp,100.dp)
                            )

                            Row {


                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = "Rounded corner"
                                )
                                Text(
                                    text = "Buy now ",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                )

                                Button(
                                    onClick = {
                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_ABOUT) { inclusive = true }
                                        } },
                                    colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                                    border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                                    shape = RoundedCornerShape(12.dp)


                                ) {
                                    Text(text = "Buy")

                                }
                            }
                            Text(
                                text = "at affordable prices",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Card {
                            Image(
                                painter = painterResource(id = R.drawable.cos11),
                                contentDescription = "",
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                    .size(100.dp,100.dp)
                            )

                            Row {


                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = "Rounded corner"
                                )
                                Text(
                                    text = "Buy now ",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                )

                                Button(
                                    onClick = {
                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_ABOUT) { inclusive = true }
                                        } },
                                    colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                                    border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                                    shape = RoundedCornerShape(12.dp)


                                ) {
                                    Text(text = "Buy")

                                }
                            }
                            Text(
                                text = "at affordable prices",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                            )
                        }
                    }


                    Row(
                        modifier = Modifier
                            .padding(5.dp)
                    ) {


                        Card {
                            Image(
                                painter = painterResource(id = R.drawable.cos13),
                                contentDescription = "",
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                    .size(100.dp,100.dp)
                            )

                            Row {


                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = "Rounded corner"
                                )
                                Text(
                                    text = "Buy now ",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                )

                                Button(
                                    onClick = {
                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_ABOUT) { inclusive = true }
                                        } },
                                    colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                                    border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                                    shape = RoundedCornerShape(12.dp)


                                ) {
                                    Text(text = "Buy")

                                }
                            }
                            Text(
                                text = "at affordable prices",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Card {
                            Image(
                                painter = painterResource(id = R.drawable.cos12),
                                contentDescription = "",
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                    .size(100.dp,100.dp)
                            )

                            Row {


                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = "Rounded corner"
                                )
                                Text(
                                    text = "Buy now ",
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                                )

                                Button(
                                    onClick = {
                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_ABOUT) { inclusive = true }
                                        } },
                                    colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                                    border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                                    shape = RoundedCornerShape(12.dp)


                                ) {
                                    Text(text = "Buy")

                                }
                            }
                            Text(
                                text = "at affordable prices",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .absolutePadding(5.dp, 5.dp, 5.dp, 5.dp)
                            )
                        }
                    }

                }
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    AboutScreen(rememberNavController())
}

