package cat.dam.fabri.wikiloc_layout.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import cat.dam.fabri.wikiloc_flaso.MyApp
import cat.dam.fabri.wikiloc_flaso.R
import cat.dam.fabri.wikiloc_flaso.ui.theme.DarkGreen
import cat.dam.fabri.wikiloc_flaso.ui.theme.DarkerGreen
import cat.dam.fabri.wikiloc_flaso.ui.theme.Wikiloc_FLASOTheme


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProfileScreen(navController: NavController) {
    Scaffold(
        topBar = {
            // Icono de compartir y parámetro de configuración
            // Implementa la lógica necesaria
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.DarkGreen)
                    .padding(10.dp)
            ) {
                // Botón Configuración a la izquierda
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.DarkerGreen,
                        contentColor = Color.White,
                        disabledContainerColor = Color.Gray,
                        disabledContentColor = Color.White
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(end = 45.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.config),
                        contentDescription = null,
                        modifier = Modifier
                            .size(22.dp)
                    )
                    Text(text = "Configuración")
                }

                // Imagen de compartir a la derecha
                Image(
                    painter = painterResource(id = R.drawable.share_green),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .align(Alignment.CenterEnd)
                )
            }
        },
        content = {
            // Agregar un padding superior para dejar espacio para la barra superior
            Column(
                modifier = Modifier.padding(top = 70.dp) // Puedes ajustar el valor según sea necesario
            ) {
                Row {
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 14.dp, end = 14.dp, top = 14.dp)
                    )
                    {
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.noface_big),
                                contentDescription = null,
                                modifier = Modifier
                                    .align(Alignment.CenterStart)
                                    .clip(RoundedCornerShape(8.dp))
                                    .clickable {}
                            )
                            Text(
                                text = "Username",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 30.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomStart)
                                    .padding(start = 104.dp)
                            )
                        }
                        Box(
                            modifier = Modifier
                                .clickable {}
                                .border(
                                    width = 2.dp,
                                    color = Color.DarkGreen,
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .align(Alignment.TopEnd)
                                .padding(horizontal = 15.dp, vertical = 5.dp)

                        ) {
                            Text(text = "Edita", color = Color.DarkGreen)
                        }
                    }

                }
                Row {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 14.dp, end = 14.dp, bottom = 14.dp)
                    ) {
                        Text(
                            text = "Miembro desde <month> <year>",
                            color = Color.Gray,
                            modifier = Modifier.padding(start = 104.dp),
                            fontSize = 12.sp
                        )
                    }
                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box {
                        Column {
                            Text(text = "?", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                            Text(text = "Siguiendo", color = Color.Gray)
                        }
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Box {
                        Column {
                            Text(text = "?", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                            Text(text = "Seguidores", color = Color.Gray)
                        }
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Box {
                        Column {
                            Text(text = "?", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                            Text(text = "Compañeros de\nruta", color = Color.Gray)
                        }
                    }
                }
            }

        },
    )
}

