package cat.dam.fabri.wikiloc_layout.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import cat.dam.fabri.wikiloc_flaso.R
import cat.dam.fabri.wikiloc_flaso.ui.theme.DarkGreen
import cat.dam.fabri.wikiloc_flaso.ui.theme.DarkerGreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RecordRouteScreen(navController: NavController) {
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.DarkGreen)
                    .padding(10.dp)
            ) {
                // Botón Configuración a la izquierda
                Row (
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 12.dp)
                        .background(
                            color = Color.DarkerGreen,
                            shape = RoundedCornerShape(12.dp)
                        )
                        .clickable {}
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.location),
                        contentDescription = null,
                        modifier = Modifier
                            .size(45.dp)
                            .padding(start = 10.dp, bottom = 10.dp, top = 10.dp)
                            .align(Alignment.CenterVertically)
                    )

                    Text(
                        text = "Seguimiento en vivo",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.padding(end = 10.dp, bottom = 10.dp, top = 10.dp)
                    )
                }
            }
        },
        content = {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.map),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )


                FloatingActionButton(
                    onClick = { },
                    modifier = Modifier
                        .padding(16.dp)
                        .align(Alignment.End)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.cross),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
        },
        bottomBar = {
            Column (
                modifier = Modifier.background(Color.White)
            ) {
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
                        horizontalArrangement = Arrangement.Center
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
                                text = "Empieza a Grabar",
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