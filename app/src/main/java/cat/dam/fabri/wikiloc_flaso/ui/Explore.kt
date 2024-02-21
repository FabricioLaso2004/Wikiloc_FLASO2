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
fun ExploreScreen(navController: NavController) {
    Scaffold(
        topBar = {
            // Barra de búsqueda con botón de filtros
            // Implementa la lógica necesaria
        },
        content = {
            // Contenido de la pantalla de exploración
            // Nombre de la ruta en negrita, distancia, desnivel positivo, etc.
            // Implementa la lógica necesaria
        },
        floatingActionButton = {
            // Botón de guardar como favorito
            // Implementa la lógica necesaria
        },
        floatingActionButtonPosition = FabPosition.End,
    )
}
