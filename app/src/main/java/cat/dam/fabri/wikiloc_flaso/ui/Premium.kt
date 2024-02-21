package cat.dam.fabri.wikiloc_layout.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import cat.dam.fabri.wikiloc_flaso.R
import cat.dam.fabri.wikiloc_flaso.ui.theme.DarkGreen
import cat.dam.fabri.wikiloc_flaso.ui.theme.LighterGray
import cat.dam.fabri.wikiloc_flaso.ui.theme.Wikiloc_FLASOTheme


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PremiumScreen(navController: NavController) {

    var isEnabled by remember { mutableStateOf(false) }

    val images = listOf(
        "outdoor",
        "no_ads",
        "weather"
    )

    var currentPage by remember { mutableStateOf(2) }

    Scaffold(
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    "Pásate a Wikiloc Premium",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 30.dp, bottom = 15.dp)
                )
                Text(
                    "Todas las funciones exclusivas incluidas",
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(bottom = 25.dp)
                )

//                PresentationSlider(
//                    items = listOf(
//                        PresentationItem(
//                            imageRes = R.drawable.ic_launcher_foreground,
//                            title = "Navegación Outdoor",
//                            description = "Sé tu propio guía a lo largo de millones de rutas al aire libre desde tu móvil con indicador de rumbo, brújula y alertas sonoras. ¡Incluso offline!"
//                        ),
//                        PresentationItem(
//                            imageRes = R.drawable.ic_launcher_foreground,
//                            title = "Búsqueda por Zona de Paso",
//                            description = "Encuentra rutas que empiecen o pasen por zonas concretas que tú elijas."
//
//                        ),
//                        PresentationItem(
//                            imageRes = R.drawable.ic_launcher_foreground,
//                            title = "Envía a tu GPS",
//                            description = "Descarga rutas de Wikiloc directamente a tu Garmin, Apple Watch o Suunto."
//                        )
//                    ),
//                    modifier = Modifier.padding(vertical = 16.dp)
//                )

                Row {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.outdoor),
                            contentDescription = null,
                            modifier = Modifier
                                .size(150.dp)
                                .clip(MaterialTheme.shapes.large)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Navegación Outdoor",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 8.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Sé tu propio guía a lo largo de millones de rutas al aire libre desde tu móvil con indicador de rumbo, brújula y alertas sonoras. ¡Incluso offline!",
                            fontSize = 12.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 8.dp)
                        )
                    }
                }


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Start),

                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(
                        modifier = Modifier
                            .background(
                                if (!isEnabled) Color.DarkGreen else Color.DarkGray
                            )
                    ) {
                        Text(
                            text = "AHORRA UN 50%",
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = (16.9).dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(22.dp))
                    Box(
                        modifier = Modifier
                            .background(
                                Color.Transparent
                            )
                    ) {
                        Text(
                            text = "AHORRA UN 50%",
                            color = Color.Transparent,
                            modifier = Modifier.padding(horizontal = (16.9).dp)
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LighterGray),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    ClickableBox(
                        isEnabled = !isEnabled,
                        onClick = { if (isEnabled) isEnabled = false }
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "1 Año",
                                fontSize = 18.sp, fontWeight = FontWeight.Black,
                                textAlign = TextAlign.Center,
                            )
                            Text(
                                text = "9,99 €",
                                fontSize = 30.sp, fontWeight = FontWeight.Black,
                                textAlign = TextAlign.Center,
                            )
                            Text(
                                text = "0,83/mes",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Light,
                                textAlign = TextAlign.Center,
                            )
                        }
                    }

                    Spacer(modifier = Modifier.width(16.dp)) // Espaciador entre los botones

                    ClickableBox(
                        isEnabled = isEnabled,
                        onClick = { if (!isEnabled) isEnabled = true }
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "3 meses",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Black,
                                textAlign = TextAlign.Center,
                            )
                            Text(
                                text = "4,99 €",
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Black,
                                textAlign = TextAlign.Center,
                            )
                            Text(
                                text = "1,66/mes",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Light,
                                textAlign = TextAlign.Center,
                            )
                        }
                    }
                }

                Row(
                    modifier = Modifier
                        .background(Color.LighterGray)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Column {
                        Row(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(16.dp)
                        ) {
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.DarkGreen,
                                    contentColor = Color.DarkGreen,
                                    disabledContainerColor = Color.Gray,
                                    disabledContentColor = Color.White
                                )
                            ) {
                                Text(
                                    text = "Pruébalo GRATIS durante 14 dias",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                        Row {
                            Text(
                                text = "Facturación recurrente, cancela en cualquier momento.\n" +
                                        "No te preocupes, tienes control total sobre el estado de tu suscripción.\n" +
                                        "El pago será cargado a tu cuenta de Google Play en el momento de la confirmación de la compra o al final del período de prueba, si corresponde. Las suscripciones de Wikiloc Premium se renuevan automáticamente a menos que canceles la suscripción. La renovación será cargada a tu cuenta dentro de las 24 horas anteriores al final del período actual, a menos que decidas cancelar la renovación de tu suscripción por lo menos 24 horas antes de la fecha de renovación.\n" +
                                        "Puedes administrar tu suscripción en la configuración de tu cuenta Google Play. Para tu comodidad, también proporcionamos enlaces para administrar tu suscripción desde tu Perfil de Wikiloc > Configuración, a los que puedes acceder desde la web o la app.",
                                fontSize = 10.sp,
                                color = Color.Gray,
                                modifier = Modifier.padding(horizontal = 15.dp)
                            )
                        }
                    }
                }
            }
        }
    )

}

@Composable
fun ClickableBox(
    isEnabled: Boolean,
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .clickable { if (!isEnabled) onClick() }
            .border(
                width = 8.dp,
                color = if (isEnabled) Color.DarkGreen else Color.Transparent,
                shape = RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp)
            )
    ) {
        Box(
            modifier = Modifier.padding(horizontal = 50.dp,vertical = 8.dp)
        ) {
            content()
        }
    }
}





@Composable
fun PresentationSlider(
    items: List<PresentationItem>,
    modifier: Modifier = Modifier,
) {
    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
            .horizontalScroll(state = rememberScrollState())
    ) {
        items(items) { item ->
            PresentationBox(item = item)
            Spacer(modifier = Modifier.width(16.dp))
        }
    }
}


@Composable
fun PresentationBox(item: PresentationItem) {
    Box(
        modifier = Modifier
            .width(200.dp)
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
            .clip(MaterialTheme.shapes.medium)
            .clickable { /* Handle item click here */ }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = item.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .clip(MaterialTheme.shapes.medium)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = item.title,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = item.description,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            )
        }
    }
}

data class PresentationItem(
    val imageRes: Int,
    val title: String,
    val description: String
)

@Preview(showBackground = true)
@Composable
fun PresentationSliderPreview() {
    Wikiloc_FLASOTheme {
        val items = listOf(
            PresentationItem(
                imageRes = R.drawable.ic_launcher_foreground,
                title = "Item 1",
                description = "Description for Item 1"
            ),
            PresentationItem(
                imageRes = R.drawable.ic_launcher_foreground,
                title = "Item 2",
                description = "Description for Item 2"
            ),
            PresentationItem(
                imageRes = R.drawable.ic_launcher_foreground,
                title = "Item 3",
                description = "Description for Item 3"
            )
        )
        PresentationSlider(items = items)
    }
}