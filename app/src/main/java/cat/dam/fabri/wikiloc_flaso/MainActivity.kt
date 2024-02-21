package cat.dam.fabri.wikiloc_flaso

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed

import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cat.dam.fabri.wikiloc_flaso.ui.theme.Wikiloc_FLASOTheme
import cat.dam.fabri.wikiloc_layout.ui.ExploreScreen
import cat.dam.fabri.wikiloc_layout.ui.PremiumScreen
import cat.dam.fabri.wikiloc_layout.ui.ProfileScreen
import cat.dam.fabri.wikiloc_layout.ui.RecordRouteScreen
import com.google.android.libraries.mapsplatform.transportation.consumer.model.Route


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Wikiloc_FLASOTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "perfil") {
        composable("explora") {
            ExploreScreen(navController = navController)
        }
        composable("grabar_ruta") {
            RecordRouteScreen(navController = navController)
        }
        composable("perfil") {
            ProfileScreen(navController = navController)
        }
        composable("premium") {
            PremiumScreen(navController = navController)
        }
    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Wikiloc_FLASOTheme {
        MyApp()
    }
}