package com.example.eyewitness

import androidx.camera.view.LifecycleCameraController
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.eyewitness.screens.CameraScreen
import com.example.eyewitness.screens.ReportPage

@Composable
fun MyAppNavigation(modifier: Modifier, controller: LifecycleCameraController){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login", builder = {
        composable("camera"){
            CameraScreen(navController, controller, modifier)
        }
        composable("report"){
            ReportPage(modifier, navController)
        }
    })
}