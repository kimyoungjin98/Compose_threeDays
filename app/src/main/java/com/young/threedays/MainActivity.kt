package com.young.threedays

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.young.threedays.ui.theme.Compose_threeDaysTheme

class MainActivity : ComponentActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_threeDaysTheme {
                // A surface container using the 'background' color from the theme
               
            }
        }
    }
}

@Composable
fun Nav(){

    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = "profile"){
//        composable("profile") { Profile(/*...*/) }
//        composable("list") { List(/*...*/) }
        /*...*/
    }
    
}

@Composable
fun Profile(navController: NavController){
    /*...*/
    Button(onClick = {navController.navigate("profile") }) {
        Text(text = "Navigate next")
    }
    /*...*/
}

@Composable
fun List(navController: NavController){
    
}