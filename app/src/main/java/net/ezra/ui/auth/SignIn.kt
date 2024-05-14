//package net.ezra.ui.auth
//
//
//
//import androidx.activity.compose.BackHandler
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.input.PasswordVisualTransformation
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
//import com.google.firebase.auth.FirebaseAuth
//import net.ezra.navigation.ROUTE_DASHBOARD
//import net.ezra.navigation.ROUTE_LOGIN
//import net.ezra.navigation.ROUTE_REGISTER
//
//@Composable
//fun LoginScreen(navController: NavController, onLoginSuccess: () -> Unit) {
//    var email by remember { mutableStateOf("") }
//    var password by remember { mutableStateOf("") }
//    var error by remember { mutableStateOf<String?>(null) }
//    var isLoading by remember { mutableStateOf(false) }
//
//    BackHandler {
//        navController.popBackStack()
//
//    }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//
//        AuthHeader()
//        Text("Login", style = MaterialTheme.typography.h4)
//        Spacer(modifier = Modifier.height(16.dp))
//
//        OutlinedTextField(
//            value = email,
//            onValueChange = { email = it },
//            label = { Text("Email") },
//            modifier = Modifier.fillMaxWidth()
//        )
//        Spacer(modifier = Modifier.height(8.dp))
//
//        OutlinedTextField(
//            value = password,
//            onValueChange = { password = it },
//            label = { Text("Password") },
//            visualTransformation = PasswordVisualTransformation(),
//            modifier = Modifier.fillMaxWidth()
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//
//        if (isLoading) {
//            CircularProgressIndicator(modifier = Modifier.size(48.dp))
//        } else {
//
//
//
//            Button(
//                colors = ButtonDefaults.buttonColors(Color(0xff0FB06A)),
//                onClick = {
//                    if (email.isBlank() || password.isBlank()) {
//                        error = "Please fill in all fields"
//                    } else {
//                        isLoading = true
//                        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
//                            .addOnCompleteListener { task ->
//                                isLoading = false
//                                if (task.isSuccessful) {
//                                    navController.navigate(ROUTE_DASHBOARD)
//                                } else {
//                                    error = task.exception?.message ?: "Login failed"
//                                }
//                            }
//                    }
//                },
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Text("Login")
//            }
//
//            androidx.compose.material3.Text(
//                modifier = Modifier
//
//                    .clickable {
//                        navController.navigate(ROUTE_REGISTER) {
//                            popUpTo(ROUTE_LOGIN) { inclusive = true }
//                        }
//                    },
//                text = "go to register",
//                textAlign = TextAlign.Center,
//                color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
//            )
//
//
//
//        }
//
//        error?.let {
//            Text(
//                text = it,
//                color = MaterialTheme.colors.error,
//                modifier = Modifier.padding(top = 8.dp)
//            )
//        }
//    }
//}

package net.ezra.ui.auth

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
//import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.ui.theme.AppTheme
import net.ezra.ui.theme.spacing

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {


    Box(
        modifier = Modifier
            .wrapContentSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.cos13),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )

        Column {

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        ConstraintLayout(
            modifier = Modifier.fillMaxSize()
        ) {

            val (refHeader, refEmail, refPassword, refButtonLogin, refTextSignup) = createRefs()
            val spacing = MaterialTheme.spacing

            Text(
                text = "LOGIN",
                fontSize = 50.sp,
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Right,
                fontWeight = FontWeight.ExtraBold
            )

            Spacer(modifier = Modifier.height(16.dp))

            TextField(
                value = email,
                onValueChange = {
                    email = it
                },
                label = {
                    Text(text = stringResource(id = R.string.email))
                },
                modifier = Modifier.constrainAs(refEmail) {
                    top.linkTo(refHeader.bottom, spacing.extraLarge)
                    start.linkTo(parent.start, spacing.large)
                    end.linkTo(parent.end, spacing.large)
                    width = Dimension.fillToConstraints
                },
                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.None,
                    autoCorrect = false,
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Next
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            TextField(
                value = password,
                onValueChange = {
                    password = it
                },
                label = {
                    Text(text = stringResource(id = R.string.password))
                },
                modifier = Modifier.constrainAs(refPassword) {
                    top.linkTo(refEmail.bottom, spacing.medium)
                    start.linkTo(parent.start, spacing.large)
                    end.linkTo(parent.end, spacing.large)
                    width = Dimension.fillToConstraints
                },
                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.None,
                    autoCorrect = false,
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    navController.navigate(ROUTE_ABOUT) {
                        popUpTo(ROUTE_LOGIN) { inclusive = true }
                    }

                },

                colors = ButtonDefaults.buttonColors(Color.Black),

                modifier = Modifier.constrainAs(refButtonLogin) {
                    top.linkTo(refPassword.bottom, spacing.large)
                    start.linkTo(parent.start, spacing.extraLarge)
                    end.linkTo(parent.end, spacing.extraLarge)
                    width = Dimension.fillToConstraints
                }
            ) {
                Text(
                    text = stringResource(id = R.string.login),
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                modifier = Modifier
                    .constrainAs(refTextSignup) {
                        top.linkTo(refButtonLogin.bottom, spacing.medium)
                        start.linkTo(parent.start, spacing.extraLarge)
                        end.linkTo(parent.end, spacing.extraLarge)
                    }
                    .clickable {
                        navController.navigate(ROUTE_SIGNUP) {

                        }
                    },
                text = stringResource(id = R.string.dont_have_account),
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurface
            )

        }
    }
        }
    }


@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun LoginScreenPreviewLight() {
    LoginScreen(rememberNavController())
}


