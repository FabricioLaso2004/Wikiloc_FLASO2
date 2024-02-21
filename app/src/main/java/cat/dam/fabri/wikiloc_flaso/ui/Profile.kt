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
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
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
import cat.dam.fabri.wikiloc_flaso.ui.theme.LighterGray
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
                Row (
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(end = 45.dp)
                        .background(
                            color = Color.DarkerGreen,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clickable {}
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.config),
                        contentDescription = null,
                        modifier = Modifier
                            .size(45.dp)
                            .padding(start = 10.dp, bottom = 10.dp, top = 10.dp)
                            .align(Alignment.CenterVertically)
                    )

                    Text(
                        text = "Configuración",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.padding(end = 10.dp, bottom = 10.dp, top = 10.dp)
                    )
                }

                // Imagen de compartir a la derecha
                Image(
                    painter = painterResource(id = R.drawable.share_green),
                    contentDescription = null,
                    modifier = Modifier
                        .size(25.dp)
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
                                fontWeight = FontWeight.Black,
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
                                .padding(horizontal = 18.dp, vertical = 5.dp)

                        ) {
                            Text(text = "Edita", color = Color.DarkGreen, fontWeight = FontWeight.Bold)
                        }
                    }

                }
                Row {

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 14.dp, end = 14.dp, bottom = 14.dp, top = 10.dp)
                    ) {
                        Row (
                            modifier = Modifier.padding(start = 45.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.logo_small),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(18.dp)
                                    .align(Alignment.CenterVertically)

                            )
                            Spacer(modifier = Modifier.width(2.dp))
                            Box(
                                modifier = Modifier
                                    .background(
                                        color = Color.LightGray,
                                        shape = RoundedCornerShape(2.dp)
                                    )
                                    .padding(horizontal = 6.dp)
                            ) {
                                Text(text = "?",color = Color.DarkGray)
                            }
                            Text(
                                text = "Miembro desde <month> <year>",
                                color = Color.Gray,
                                fontSize = 12.sp,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .padding(start = 24.dp)
                            )
                        }
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
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .drawBehind {
                            // Dibuja una línea en la parte superior del Box
                            drawLine(
                                color = Color.LightGray,
                                start = Offset(0f, 0f),
                                end = Offset(size.width, 0f),
                                strokeWidth = 1.dp.toPx()
                            )
                        }
                        .clickable { }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Tus rutas")
                        Spacer(modifier = Modifier.weight(1f))
                        Text(text = "?", fontWeight = FontWeight.Bold, fontSize = 20.sp,modifier = Modifier.padding(end = 10.dp))
                        Image(painter = painterResource(id = R.drawable.arrow_right), contentDescription = null,modifier = Modifier.size(20.dp))
                    }
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .drawBehind {
                            // Dibuja una línea en la parte superior del Box
                            drawLine(
                                color = Color.LightGray,
                                start = Offset(0f, 0f),
                                end = Offset(size.width, 0f),
                                strokeWidth = 1.dp.toPx()
                            )
                        }
                        .clickable { }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Disponible offline")
                        Spacer(modifier = Modifier.weight(1f))
                        Text(text = "?", fontWeight = FontWeight.Bold, fontSize = 20.sp,modifier = Modifier.padding(end = 10.dp))
                        Image(painter = painterResource(id = R.drawable.arrow_right), contentDescription = null,modifier = Modifier.size(20.dp))
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LighterGray)
                        .drawBehind {
                            // Dibuja una línea en la parte superior del Box
                            drawLine(
                                color = Color.LightGray,
                                start = Offset(0f, 0f),
                                end = Offset(size.width, 0f),
                                strokeWidth = 1.dp.toPx()
                            )
                            // Dibuja una línea en la parte inferior del Box
                            drawLine(
                                color = Color.LightGray,
                                start = Offset(0f, size.height),
                                end = Offset(size.width, size.height),
                                strokeWidth = 1.dp.toPx()
                            )
                        }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Listas")
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .drawBehind {
                            // Dibuja una línea en la parte inferior del Box
                            drawLine(
                                color = Color.LightGray,
                                start = Offset(0f, size.height),
                                end = Offset(size.width, size.height),
                                strokeWidth = 1.dp.toPx()
                            )
                        }
                        .clickable { }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Favoritos")
                        Spacer(modifier = Modifier.weight(1f))
                        Text(text = "?", fontWeight = FontWeight.Bold, fontSize = 20.sp,modifier = Modifier.padding(end = 10.dp))
                        Image(painter = painterResource(id = R.drawable.arrow_right), contentDescription = null,modifier = Modifier.size(20.dp))
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .drawBehind {
                            // Dibuja una línea en la parte inferior del Box
                            drawLine(
                                color = Color.LightGray,
                                start = Offset(0f, size.height),
                                end = Offset(size.width, size.height),
                                strokeWidth = 1.dp.toPx()
                            )
                        }
                        .clickable { }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Quiero ir")
                        Spacer(modifier = Modifier.weight(1f))
                        Text(text = "?", fontWeight = FontWeight.Bold, fontSize = 20.sp,modifier = Modifier.padding(end = 10.dp))
                        Image(painter = painterResource(id = R.drawable.arrow_right), contentDescription = null,modifier = Modifier.size(20.dp))
                    }
                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.Center // Centra los elementos horizontalmente dentro del Row
                ) {
                    Box(
                        modifier = Modifier
                            .clickable {}
                            .border(
                                width = 2.dp,
                                color = Color.DarkerGreen,
                                shape = CircleShape
                            )
                            .padding(horizontal = 15.dp, vertical = 5.dp)
                    ) {
                        Text(text = "Nueva Lista", color = Color.DarkGreen, fontWeight = FontWeight.Bold)
                    }
                }

            }


        },
        bottomBar = {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(2.dp)
                        .drawBehind {
                            // Dibuja una línea en la parte inferior del Box
                            drawLine(
                                color = Color.LightGray,
                                start = Offset(0f, size.height),
                                end = Offset(size.width, size.height),
                                strokeWidth = 3.dp.toPx()
                            )
                        }

                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.Center // Centra los elementos horizontalmente dentro del Row
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
                                text = "Prueba Wikiloc Premium GRATIS",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }

        }
    )
}