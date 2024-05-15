//package net.ezra.ui.home
//
//
//
//
//
//
//import android.annotation.SuppressLint
//import android.content.Intent
//import android.net.Uri
//import androidx.activity.compose.ManagedActivityResultLauncher
//import androidx.activity.compose.rememberLauncherForActivityResult
//import androidx.activity.result.ActivityResult
//import androidx.activity.result.contract.ActivityResultContracts
//import androidx.compose.animation.core.Animatable
//import androidx.compose.animation.core.tween
//import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.*
////noinspection UsingMaterialAndMaterial3Libraries
//import androidx.compose.material.BottomNavigation
////noinspection UsingMaterialAndMaterial3Libraries
//import androidx.compose.material.BottomNavigationItem
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.AccountCircle
//import androidx.compose.material.icons.filled.Add
//import androidx.compose.material.icons.filled.Favorite
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Menu
//import androidx.compose.material.icons.filled.Person
//import androidx.compose.material3.Button
//import androidx.compose.material3.CenterAlignedTopAppBar
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBarDefaults
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavHostController
//import net.ezra.R
//import net.ezra.navigation.ROUTE_ABOUT
//import net.ezra.navigation.ROUTE_ADD_PRODUCT
//import net.ezra.navigation.ROUTE_ADD_STUDENTS
//import net.ezra.navigation.ROUTE_DASHBOARD
//import net.ezra.navigation.ROUTE_HOME
//import net.ezra.navigation.ROUTE_LOGIN
//import net.ezra.navigation.ROUTE_SEARCH
//import net.ezra.navigation.ROUTE_VIEW_PROD
//import net.ezra.navigation.ROUTE_VIEW_STUDENTS
//
//
//data class Screen(val title: String, val icon: Int)
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun HomeScreen(navController: NavHostController) {
//
//    var isDrawerOpen by remember { mutableStateOf(false) }
//
//    val callLauncher: ManagedActivityResultLauncher<Intent, ActivityResult> =
//        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) { _ ->
//
//        }
//
//    Scaffold(
//        topBar = {
//            CenterAlignedTopAppBar(
//                title = {
//                    Text(text = stringResource(id = R.string.apen))
//                },
//                navigationIcon = @Composable {
//                    if (!isDrawerOpen) {
//                        IconButton(onClick = { isDrawerOpen = true }) {
//                            Icon(
//                                Icons.Default.Menu,
//                                contentDescription = "Menu",
//                                tint = Color.White
//                                )
//                        }
//                    }
//                },
//
//                actions = {
//                    IconButton(onClick = {
//                        navController.navigate(ROUTE_LOGIN) {
//                            popUpTo(ROUTE_HOME) { inclusive = true }
//                        }
//
//                    }) {
//                        Icon(
//                            imageVector = Icons.Filled.AccountCircle,
//                            contentDescription = null,
//                            tint = Color.White
//                        )
//                    }
//                },
//
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = Color(0xff0FB06A),
//                    titleContentColor = Color.White,
//
//                )
//
//            )
//        },
//
//        content = @Composable {
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clickable {
//                        if (isDrawerOpen) {
//                            isDrawerOpen = false
//                        }
//                    }
//            ) {
//
//
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .background(Color(0xff9AEDC9)),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//
//                    Text(
//                        text = stringResource(id = R.string.call),
//                        fontSize = 20.sp,
//                        modifier = Modifier
//                            .padding(16.dp)
//                            .clickable {
//
//                                val intent = Intent(Intent.ACTION_DIAL)
//                                intent.data = Uri.parse("tel:+254796759850")
//
//                                callLauncher.launch(intent)
//                            }
//                    )
//
//                    Text(
//                        text = stringResource(id = R.string.developer),
//                        fontSize = 20.sp,
//                    )
//
//                    Spacer(modifier = Modifier.height(15.dp))
//
//                    Text(
//                        modifier = Modifier
//
//                            .clickable {
//                                navController.navigate(ROUTE_LOGIN) {
//                                    popUpTo(ROUTE_HOME) { inclusive = true }
//                                }
//                            },
//                        text = "Login Here",
//                        textAlign = TextAlign.Center,
//                        fontSize = 20.sp,
//                        color = MaterialTheme.colorScheme.onSurface
//                    )
//
//
//
//                    Text(
//                        modifier = Modifier
//
//                            .clickable {
//                                navController.navigate(ROUTE_ADD_PRODUCT) {
//                                    popUpTo(ROUTE_HOME) { inclusive = true }
//                                }
//                            },
//                        text = "Add Products",
//                        textAlign = TextAlign.Center,
//                        fontSize = 20.sp,
//                        color = MaterialTheme.colorScheme.onSurface
//                    )
//
//                    Text(
//                        modifier = Modifier
//
//                            .clickable {
//                                navController.navigate(ROUTE_ADD_STUDENTS) {
//                                    popUpTo(ROUTE_HOME) { inclusive = true }
//                                }
//                            },
//                        text = "Add Students",
//                        textAlign = TextAlign.Center,
//                        fontSize = 20.sp,
//                        color = MaterialTheme.colorScheme.onSurface
//                    )
//
//                    Text(
//                        modifier = Modifier
//
//                            .clickable {
//                                navController.navigate(ROUTE_VIEW_PROD) {
//                                    popUpTo(ROUTE_HOME) { inclusive = true }
//                                }
//                            },
//                        text = "view Products",
//                        textAlign = TextAlign.Center,
//                        fontSize = 20.sp,
//                        color = MaterialTheme.colorScheme.onSurface
//                    )
//
//
//
//                    Spacer(modifier = Modifier.height(15.dp))
//
//                    Text(
//                        text = "You're welcome",
//                        fontSize = 30.sp,
//                        color = Color.White
//                    )
//
//
//
//                }
//
//            }
//
//        },
//
//        bottomBar = { BottomBar(navController = navController) }
//
//
//
//
//
//
//
//    )
//
//    AnimatedDrawer(
//        isOpen = isDrawerOpen,
//        onClose = { isDrawerOpen = false }
//    )
//}
//
//@Composable
//fun AnimatedDrawer(isOpen: Boolean, onClose: () -> Unit) {
//    val drawerWidth = remember { Animatable(if (isOpen) 250f else 0f) }
//
//    LaunchedEffect(isOpen) {
//        drawerWidth.animateTo(if (isOpen) 250f else 0f, animationSpec = tween(durationMillis = 300))
//    }
//
//    Surface(
//        modifier = Modifier
//            .fillMaxHeight()
//            .width(drawerWidth.value.dp)
//            ,
//        color = Color.LightGray,
////        elevation = 16.dp
//    ) {
//        Column {
//            Text(
//                text = "Drawer Item 1"
//
//            )
//            Text(
//                text = "Drawer Item 2"
//            )
//            Text(
//                text = "Drawer Item 3",
//                modifier = Modifier.clickable {  }
//            )
//            Spacer(modifier = Modifier.height(16.dp))
//            Text(text = stringResource(id = R.string.developer))
//
//        }
//    }
//}
//
//
//
//
//
//
//@Composable
//fun BottomBar(navController: NavHostController) {
//    val selectedIndex = remember { mutableStateOf(0) }
//    BottomNavigation(
//        elevation = 10.dp,
//        backgroundColor = Color(0xff0FB06A)
//
//
//    ) {
//
//        BottomNavigationItem(icon = {
//            Icon(imageVector = Icons.Default.Home,"", tint = Color.White)
//        },
//            label = { Text(text = "Home",color =  Color.White) }, selected = (selectedIndex.value == 0), onClick = {
//
//            })
//
//        BottomNavigationItem(icon = {
//            Icon(imageVector = Icons.Default.Favorite,"",tint = Color.White)
//        },
//            label = { Text(text = "Favorite",color =  Color.White) }, selected = (selectedIndex.value == 1), onClick = {
//
//            })
//
//        BottomNavigationItem(icon = {
//            Icon(imageVector = Icons.Default.Person, "",tint = Color.White)
//        },
//            label = { Text(
//                text = "Students",
//                color =  Color.White) },
//            selected = (selectedIndex.value == 2),
//            onClick = {
//
//                navController.navigate(ROUTE_SEARCH) {
//                    popUpTo(ROUTE_HOME) { inclusive = true }
//                }
//
//            })
//
//    }
//}

package net.ezra.ui.products

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.platform.LocalContext
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
//import net.ezra.navigation.ROUTE_MIT
//import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.R
//import net.ezra.navigation.ROUTE_CONTACT
//import net.ezra.navigation.ROUTE_PRODUCTS
//import net.ezra.navigation.ROUTE_SHOP

@Composable
fun HomeScreen(navController: NavHostController) {
    Box {
        Image(painter = painterResource(id = R.drawable.cos9),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier=Modifier
                .fillMaxSize()
        )
        LazyColumn {
            item {

                Column(

                    modifier = Modifier
                        .absolutePadding(20.dp, 20.dp, 20.dp, 20.dp)
                ) {
                    Text(
                        text = "SHOP NOW",
                        fontSize = 50.sp,
                        fontFamily = FontFamily.SansSerif,
                        textAlign = TextAlign.Right,
                        fontWeight = FontWeight.ExtraBold
                    )
                    LazyRow {
                        item {

                            Row {

                                Card {

                                    Image(
                                        painter = painterResource(id = R.drawable.cos8),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(100.dp)
                                            .padding(5.dp),
                                        contentScale = ContentScale.Crop
                                    )

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Row(
                                        modifier = Modifier
                                            .padding(5.dp),
                                    ) {

                                        val mContext = LocalContext.current
                                        OutlinedButton(onClick = {
                                            val simToolKitLaunchIntent =
                                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let{mContext.startActivity(it)}
                                        }) {
                                            Text(
                                                text = "Pay",
                                                color = Color.Black
                                            )
                                        }
                                        Icon(
                                            imageVector = Icons.Default.ShoppingCart,
                                            contentDescription = ""
                                        )
                                    }


                                    Text(
                                        text = "Available products",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(5.dp)
                                    )

                                }
                                Spacer(modifier = Modifier.width(20.dp))

                                Card {

                                    Image(
                                        painter = painterResource(id = R.drawable.cos2),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(100.dp)
                                            .padding(5.dp),
                                        contentScale = ContentScale.Crop
                                    )


                                    Spacer(modifier = Modifier.height(10.dp))

                                    Row(
                                        modifier = Modifier
                                            .padding(5.dp),
                                    ) {

                                        val mContext = LocalContext.current
                                        OutlinedButton(onClick = {
                                            val simToolKitLaunchIntent =
                                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let{mContext.startActivity(it)}
                                        }) {
                                            Text(
                                                text = "Pay",
                                                color = Color.Black
                                            )
                                        }
                                        Icon(
                                            imageVector = Icons.Default.ShoppingCart,
                                            contentDescription = ""
                                        )
                                    }

                                    Text(
                                        text = "Available products",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(5.dp)
                                    )

                                }

                                Spacer(modifier = Modifier.width(20.dp))


                                Card {

                                    Image(
                                        painter = painterResource(id = R.drawable.cos5),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(100.dp)
                                            .padding(5.dp),
                                        contentScale = ContentScale.Crop
                                    )

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Row(
                                        modifier = Modifier
                                            .padding(5.dp),
                                    ) {

                                        val mContext = LocalContext.current
                                        OutlinedButton(onClick = {
                                            val simToolKitLaunchIntent =
                                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let{mContext.startActivity(it)}
                                        }) {
                                            Text(
                                                text = "Pay",
                                                color = Color.Black
                                            )
                                        }
                                        Icon(
                                            imageVector = Icons.Default.ShoppingCart,
                                            contentDescription = ""
                                        )
                                    }


                                    Text(
                                        text = "Available products",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(5.dp)
                                    )

                                }

                                Spacer(modifier = Modifier.width(20.dp))


                                Card {

                                    Image(
                                        painter = painterResource(id = R.drawable.cos10),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(100.dp)
                                            .padding(5.dp),
                                        contentScale = ContentScale.Crop
                                    )

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Row(
                                        modifier = Modifier
                                            .padding(5.dp),
                                    ) {

                                        val mContext = LocalContext.current
                                        OutlinedButton(onClick = {val simToolKitLaunchIntent =
                                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let{mContext.startActivity(it)}
                                        }) {
                                            Text(
                                                text = "Pay",
                                                color = Color.Black
                                            )
                                        }
                                        Icon(
                                            imageVector = Icons.Default.ShoppingCart,
                                            contentDescription = ""
                                        )
                                    }


                                    Text(
                                        text = "Available products",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(5.dp)
                                    )

                                }


                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Buy now at affordable and fair prices for high quality and recommendable prices ",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 20.sp,
                    )

                    Spacer(modifier = Modifier.height(10.dp))
                    LazyRow {
                        item {

                            Row {

                                Card {

                                    Image(
                                        painter = painterResource(id = R.drawable.cos6),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(100.dp)
                                            .padding(5.dp),
                                        contentScale = ContentScale.Crop
                                    )

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Row(
                                        modifier = Modifier
                                            .padding(5.dp),
                                    ) {

                                        val mContext = LocalContext.current
                                        OutlinedButton(onClick = {val simToolKitLaunchIntent =
                                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let{mContext.startActivity(it)}
                                        }) {
                                            Text(
                                                text = "Pay",
                                                color = Color.Black
                                            )
                                        }
                                        Icon(
                                            imageVector = Icons.Default.ShoppingCart,
                                            contentDescription = ""
                                        )
                                    }


                                    Text(
                                        text = "Available products",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(5.dp)
                                    )

                                }
                                Spacer(modifier = Modifier.width(20.dp))

                                Card {

                                    Image(
                                        painter = painterResource(id = R.drawable.cos7),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(100.dp)
                                            .padding(5.dp),
                                        contentScale = ContentScale.Crop
                                    )


                                    Spacer(modifier = Modifier.height(10.dp))

                                    Row(
                                        modifier = Modifier
                                            .padding(5.dp),
                                    ) {

                                        val mContext = LocalContext.current
                                        OutlinedButton(onClick = {val simToolKitLaunchIntent =
                                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let{mContext.startActivity(it)}
                                        }) {
                                            Text(
                                                text = "Pay",
                                                color = Color.Black
                                            )
                                        }
                                        Icon(
                                            imageVector = Icons.Default.ShoppingCart,
                                            contentDescription = ""
                                        )
                                    }

                                    Text(
                                        text = "Available products",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(5.dp)
                                    )

                                }

                                Spacer(modifier = Modifier.width(20.dp))


                                Card {

                                    Image(
                                        painter = painterResource(id = R.drawable.cos1),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(100.dp)
                                            .padding(5.dp),
                                        contentScale = ContentScale.Crop
                                    )

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Row(
                                        modifier = Modifier
                                            .padding(5.dp),
                                    ) {

                                        val mContext = LocalContext.current
                                        OutlinedButton(onClick = {val simToolKitLaunchIntent =
                                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let{mContext.startActivity(it)}
                                        }) {
                                            Text(
                                                text = "Pay",
                                                color = Color.Black
                                            )
                                        }
                                        Icon(
                                            imageVector = Icons.Default.ShoppingCart,
                                            contentDescription = ""
                                        )
                                    }


                                    Text(
                                        text = "Available products",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(5.dp)
                                    )

                                }

                                Spacer(modifier = Modifier.width(20.dp))


                                Card {

                                    Image(
                                        painter = painterResource(id = R.drawable.cos9),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(100.dp)
                                            .padding(5.dp),
                                        contentScale = ContentScale.Crop
                                    )

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Row(
                                        modifier = Modifier
                                            .padding(5.dp),
                                    ) {

                                        val mContext = LocalContext.current
                                        OutlinedButton(onClick = {val simToolKitLaunchIntent =
                                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let{mContext.startActivity(it)}
                                        }) {
                                            Text(
                                                text = "Pay",
                                                color = Color.Black
                                            )
                                        }
                                        Icon(
                                            imageVector = Icons.Default.ShoppingCart,
                                            contentDescription = ""
                                        )
                                    }


                                    Text(
                                        text = "Available products",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = FontFamily.Serif,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(5.dp)
                                    )

                                }


                            }
                        }
                    }


                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Buy now at affordable and fair prices for high quality and recommendable prices ",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 20.sp,
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                LazyRow {
                    item {

                        Row {

                            Card {

                                Image(
                                    painter = painterResource(id = R.drawable.cos8),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .padding(5.dp),
                                    contentScale = ContentScale.Crop
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                                Row(
                                    modifier = Modifier
                                        .padding(5.dp),
                                ) {

                                    val mContext = LocalContext.current
                                    OutlinedButton(onClick = {val simToolKitLaunchIntent =
                                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                        simToolKitLaunchIntent?.let{mContext.startActivity(it)}
                                    }) {
                                        Text(
                                            text = "Pay",
                                            color = Color.Black
                                        )
                                    }
                                    Icon(
                                        imageVector = Icons.Default.ShoppingCart,
                                        contentDescription = ""
                                    )
                                }


                                Text(
                                    text = "Available products",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )

                            }
                            Spacer(modifier = Modifier.width(20.dp))

                            Card {

                                Image(
                                    painter = painterResource(id = R.drawable.cos2),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .padding(5.dp),
                                    contentScale = ContentScale.Crop
                                )


                                Spacer(modifier = Modifier.height(10.dp))

                                Row(
                                    modifier = Modifier
                                        .padding(5.dp),
                                ) {

                                    val mContext = LocalContext.current
                                    OutlinedButton(onClick = {val simToolKitLaunchIntent =
                                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                        simToolKitLaunchIntent?.let{mContext.startActivity(it)}
                                    }) {
                                        Text(
                                            text = "Pay",
                                            color = Color.Black
                                        )
                                    }
                                    Icon(
                                        imageVector = Icons.Default.ShoppingCart,
                                        contentDescription = ""
                                    )
                                }

                                Text(
                                    text = "Available products",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )

                            }

                            Spacer(modifier = Modifier.width(20.dp))


                            Card {

                                Image(
                                    painter = painterResource(id = R.drawable.cos5),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .padding(5.dp),
                                    contentScale = ContentScale.Crop
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                                Row(
                                    modifier = Modifier
                                        .padding(5.dp),
                                ) {

                                    val mContext = LocalContext.current
                                    OutlinedButton(onClick = {val simToolKitLaunchIntent =
                                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                        simToolKitLaunchIntent?.let{mContext.startActivity(it)}
                                    }) {
                                        Text(
                                            text = "Pay",
                                            color = Color.Black
                                        )
                                    }
                                    Icon(
                                        imageVector = Icons.Default.ShoppingCart,
                                        contentDescription = ""
                                    )
                                }


                                Text(
                                    text = "Available products",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )

                            }

                            Spacer(modifier = Modifier.width(20.dp))


                            Card {

                                Image(
                                    painter = painterResource(id = R.drawable.cos10),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .padding(5.dp),
                                    contentScale = ContentScale.Crop
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                                Row(
                                    modifier = Modifier
                                        .padding(5.dp),
                                ) {

                                    val mContext = LocalContext.current
                                    OutlinedButton(onClick = {val simToolKitLaunchIntent =
                                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                        simToolKitLaunchIntent?.let{mContext.startActivity(it)}
                                    }) {
                                        Text(
                                            text = "pay",
                                            color = Color.Black
                                        )
                                    }
                                    Icon(
                                        imageVector = Icons.Default.ShoppingCart,
                                        contentDescription = ""
                                    )
                                }


                                Text(
                                    text = "Available products",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )

                            }


                        }
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
    HomeScreen(rememberNavController())
}

