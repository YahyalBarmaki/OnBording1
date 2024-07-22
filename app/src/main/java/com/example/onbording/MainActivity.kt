package com.example.onbording

import android.os.Bundle
import android.widget.Toast
import com.example.onbording.onboarding.OnBoardingScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.onbording.onboarding.OnBoardingUtils
import com.example.onbording.ui.theme.OnBordingTheme

class MainActivity : ComponentActivity() {
    private val onboardingUtils by lazy { OnBoardingUtils(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContent {
            OnBordingTheme {
                Surface(color = MaterialTheme.colorScheme.background){
                    if (onboardingUtils.isOnBoardingCompleted()){
                        ShowOnboardingScreen()
                    }else{
                        ShowOnboardingScreen()
                    }
                }
                ShowOnboardingScreen()
                }
            }
        }
    }


@Composable
fun ShowOnboardingScreen() {

    val context = LocalContext.current
    Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)){
        OnBoardingScreen{
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
        }
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OnBordingTheme {
        Greeting("Android")
    }
}