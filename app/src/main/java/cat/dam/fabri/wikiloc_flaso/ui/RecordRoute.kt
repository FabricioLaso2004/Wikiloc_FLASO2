package cat.dam.fabri.wikiloc_layout.ui

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RecordRouteScreen(navController: NavController) {
    Scaffold(
        topBar = {
            // Botón de seguimiento en vivo
            // Implementa la lógica necesaria
        },
        content = {
            // Contenido de la pantalla de grabación de ruta
            // Implementa la lógica necesaria
        },
        floatingActionButton = {
            // Botón de empezar a grabar
            // Implementa la lógica necesaria
        },
        floatingActionButtonPosition = FabPosition.Center,

    )
}