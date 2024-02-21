package cat.dam.fabri.wikiloc_layout.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import cat.dam.fabri.wikiloc_flaso.R
import cat.dam.fabri.wikiloc_flaso.ui.theme.DarkGreen
import cat.dam.fabri.wikiloc_flaso.ui.theme.DarkerGreen
import cat.dam.fabri.wikiloc_flaso.ui.theme.LighterGray

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ExploreScreen(navController: NavController) {
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.DarkGreen)
                    .padding(10.dp)
            ) {
                // Botón Configuración a la izquierda
                Row(
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .background(
                            color = Color.DarkerGreen,
                            shape = CircleShape
                        )
                        .clickable {}
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.filters),
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(start = 8.dp, bottom = 5.dp, top = 5.dp)
                            .align(Alignment.CenterVertically)
                    )
                    Text(
                        text = "Filtros",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.White,
                        modifier = Modifier.padding(end = 8.dp, bottom = 5.dp, top = 5.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .fillMaxWidth(0.77f)
                        .background(
                            color = Color.White,
                            shape = CircleShape
                        )
                        .clickable {}
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.search),
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(start = 8.dp, bottom = 5.dp, top = 5.dp)
                            .align(Alignment.CenterVertically)
                    )
                    Text(
                        text = "Área del mapa",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(8.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Image(
                        painter = painterResource(id = R.drawable.cross),
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(end = 18.dp)
                            .align(Alignment.CenterVertically)
                    )

                }
            }
        },
        content = {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 60.dp)
                    .background(Color.LighterGray)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "??.???.??? rutas",
                    fontSize = 12.sp,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(15.dp)
                        .align(Alignment.Start)
                )
                Row (
                    modifier = Modifier
                        .padding(15.dp)
                        .fillMaxWidth()
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(5.dp)
                        )
                        .clickable { }
                ) {
                    Column {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.senderist),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(70.dp)
                                    .padding(15.dp)
                            )
                            Column (
                                modifier = Modifier
                                    .padding(15.dp)
                            ) {
                                Text(
                                    text = "Titol de la ruta",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp,
                                )
                                Text(
                                    text = "Tipus",
                                    fontSize = 14.sp,
                                    color = Color.Gray,
                                )
                            }
                            Spacer(modifier = Modifier.weight(1f))
                            Image(
                                painter = painterResource(id = R.drawable.bookmark),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(15.dp)
                                    .align(Alignment.Top)
                            )
                        }

                        Row(
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
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "Distancia",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Text(
                                            text = "??,?? km",
                                            fontSize = 20.sp,
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "Desnivel Positivo",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Text(
                                            text = "??? m",
                                            fontSize = 20.sp,
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "TrailRank",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Row {
                                            Text(
                                                text = "100 |",
                                                fontSize = 20.sp
                                            )
                                            Image(
                                                painter = painterResource(id = R.drawable.grade),
                                                contentDescription = null,
                                                modifier = Modifier
                                                    .size(20.dp)
                                                    .padding(2.dp)
                                                    .align(Alignment.CenterVertically)
                                            )
                                            Text(
                                                text = "?,?",
                                                fontSize = 20.sp
                                            )
                                        }

                                    }
                                }
                            }
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.paisatge),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(vertical = 5.dp)
                                        .fillMaxWidth()
                                        .fillMaxHeight(0.8f)
                                )
                                Row (
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.noface_big),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(top = 5.dp,bottom = 5.dp,end = 8.dp)
                                            .fillMaxSize(0.2f)
                                            .clip(RoundedCornerShape(8.dp))
                                    )
                                    Text(
                                        text = "Username",
                                        fontSize = 14.sp,
                                        color = Color.DarkGray
                                    )
                                }
                            }

                        }


                    }
                }
                Row (
                    modifier = Modifier
                        .padding(15.dp)
                        .fillMaxWidth()
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(5.dp)
                        )
                        .clickable { }
                ) {
                    Column {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.senderist),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(70.dp)
                                    .padding(15.dp)
                            )
                            Column (
                                modifier = Modifier
                                    .padding(15.dp)
                            ) {
                                Text(
                                    text = "Titol de la ruta",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp,
                                )
                                Text(
                                    text = "Tipus",
                                    fontSize = 14.sp,
                                    color = Color.Gray,
                                )
                            }
                            Spacer(modifier = Modifier.weight(1f))
                            Image(
                                painter = painterResource(id = R.drawable.bookmark),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(15.dp)
                                    .align(Alignment.Top)
                            )
                        }

                        Row(
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
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "Distancia",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Text(
                                            text = "??,?? km",
                                            fontSize = 20.sp,
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "Desnivel Positivo",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Text(
                                            text = "??? m",
                                            fontSize = 20.sp,
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "TrailRank",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Row {
                                            Text(
                                                text = "100 |",
                                                fontSize = 20.sp
                                            )
                                            Image(
                                                painter = painterResource(id = R.drawable.grade),
                                                contentDescription = null,
                                                modifier = Modifier
                                                    .size(20.dp)
                                                    .padding(2.dp)
                                                    .align(Alignment.CenterVertically)
                                            )
                                            Text(
                                                text = "?,?",
                                                fontSize = 20.sp
                                            )
                                        }

                                    }
                                }
                            }
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.paisatge),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(vertical = 5.dp)
                                        .fillMaxWidth()
                                        .fillMaxHeight(0.8f)
                                )
                                Row (
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.noface_big),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(top = 5.dp,bottom = 5.dp,end = 8.dp)
                                            .fillMaxSize(0.2f)
                                            .clip(RoundedCornerShape(8.dp))
                                    )
                                    Text(
                                        text = "Username",
                                        fontSize = 14.sp,
                                        color = Color.DarkGray
                                    )
                                }
                            }

                        }


                    }
                }
                Row (
                    modifier = Modifier
                        .padding(15.dp)
                        .fillMaxWidth()
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(5.dp)
                        )
                        .clickable { }
                ) {
                    Column {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.senderist),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(70.dp)
                                    .padding(15.dp)
                            )
                            Column (
                                modifier = Modifier
                                    .padding(15.dp)
                            ) {
                                Text(
                                    text = "Titol de la ruta",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp,
                                )
                                Text(
                                    text = "Tipus",
                                    fontSize = 14.sp,
                                    color = Color.Gray,
                                )
                            }
                            Spacer(modifier = Modifier.weight(1f))
                            Image(
                                painter = painterResource(id = R.drawable.bookmark),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(15.dp)
                                    .align(Alignment.Top)
                            )
                        }

                        Row(
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
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "Distancia",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Text(
                                            text = "??,?? km",
                                            fontSize = 20.sp,
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "Desnivel Positivo",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Text(
                                            text = "??? m",
                                            fontSize = 20.sp,
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "TrailRank",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Row {
                                            Text(
                                                text = "100 |",
                                                fontSize = 20.sp
                                            )
                                            Image(
                                                painter = painterResource(id = R.drawable.grade),
                                                contentDescription = null,
                                                modifier = Modifier
                                                    .size(20.dp)
                                                    .padding(2.dp)
                                                    .align(Alignment.CenterVertically)
                                            )
                                            Text(
                                                text = "?,?",
                                                fontSize = 20.sp
                                            )
                                        }

                                    }
                                }
                            }
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.paisatge),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(vertical = 5.dp)
                                        .fillMaxWidth()
                                        .fillMaxHeight(0.8f)
                                )
                                Row (
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.noface_big),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(top = 5.dp,bottom = 5.dp,end = 8.dp)
                                            .fillMaxSize(0.2f)
                                            .clip(RoundedCornerShape(8.dp))
                                    )
                                    Text(
                                        text = "Username",
                                        fontSize = 14.sp,
                                        color = Color.DarkGray
                                    )
                                }
                            }

                        }


                    }
                }
                Row (
                    modifier = Modifier
                        .padding(15.dp)
                        .fillMaxWidth()
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(5.dp)
                        )
                        .clickable { }
                ) {
                    Column {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.senderist),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(70.dp)
                                    .padding(15.dp)
                            )
                            Column (
                                modifier = Modifier
                                    .padding(15.dp)
                            ) {
                                Text(
                                    text = "Titol de la ruta",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp,
                                )
                                Text(
                                    text = "Tipus",
                                    fontSize = 14.sp,
                                    color = Color.Gray,
                                )
                            }
                            Spacer(modifier = Modifier.weight(1f))
                            Image(
                                painter = painterResource(id = R.drawable.bookmark),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(15.dp)
                                    .align(Alignment.Top)
                            )
                        }

                        Row(
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
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "Distancia",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Text(
                                            text = "??,?? km",
                                            fontSize = 20.sp,
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "Desnivel Positivo",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Text(
                                            text = "??? m",
                                            fontSize = 20.sp,
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "TrailRank",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Row {
                                            Text(
                                                text = "100 |",
                                                fontSize = 20.sp
                                            )
                                            Image(
                                                painter = painterResource(id = R.drawable.grade),
                                                contentDescription = null,
                                                modifier = Modifier
                                                    .size(20.dp)
                                                    .padding(2.dp)
                                                    .align(Alignment.CenterVertically)
                                            )
                                            Text(
                                                text = "?,?",
                                                fontSize = 20.sp
                                            )
                                        }

                                    }
                                }
                            }
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.paisatge),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(vertical = 5.dp)
                                        .fillMaxWidth()
                                        .fillMaxHeight(0.8f)
                                )
                                Row (
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.noface_big),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(top = 5.dp,bottom = 5.dp,end = 8.dp)
                                            .fillMaxSize(0.2f)
                                            .clip(RoundedCornerShape(8.dp))
                                    )
                                    Text(
                                        text = "Username",
                                        fontSize = 14.sp,
                                        color = Color.DarkGray
                                    )
                                }
                            }

                        }


                    }
                }
                Row (
                    modifier = Modifier
                        .padding(15.dp)
                        .fillMaxWidth()
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(5.dp)
                        )
                        .clickable { }
                ) {
                    Column {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.senderist),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(70.dp)
                                    .padding(15.dp)
                            )
                            Column (
                                modifier = Modifier
                                    .padding(15.dp)
                            ) {
                                Text(
                                    text = "Titol de la ruta",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp,
                                )
                                Text(
                                    text = "Tipus",
                                    fontSize = 14.sp,
                                    color = Color.Gray,
                                )
                            }
                            Spacer(modifier = Modifier.weight(1f))
                            Image(
                                painter = painterResource(id = R.drawable.bookmark),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(15.dp)
                                    .align(Alignment.Top)
                            )
                        }

                        Row(
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
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "Distancia",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Text(
                                            text = "??,?? km",
                                            fontSize = 20.sp,
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "Desnivel Positivo",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Text(
                                            text = "??? m",
                                            fontSize = 20.sp,
                                        )
                                    }
                                }
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Column {
                                        Text(
                                            text = "TrailRank",
                                            fontSize = 14.sp,
                                            color = Color.Gray,
                                        )
                                        Row {
                                            Text(
                                                text = "100 |",
                                                fontSize = 20.sp
                                            )
                                            Image(
                                                painter = painterResource(id = R.drawable.grade),
                                                contentDescription = null,
                                                modifier = Modifier
                                                    .size(20.dp)
                                                    .padding(2.dp)
                                                    .align(Alignment.CenterVertically)
                                            )
                                            Text(
                                                text = "?,?",
                                                fontSize = 20.sp
                                            )
                                        }

                                    }
                                }
                            }
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.paisatge),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(vertical = 5.dp)
                                        .fillMaxWidth()
                                        .fillMaxHeight(0.8f)
                                )
                                Row (
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.noface_big),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(top = 5.dp,bottom = 5.dp,end = 8.dp)
                                            .fillMaxSize(0.2f)
                                            .clip(RoundedCornerShape(8.dp))
                                    )
                                    Text(
                                        text = "Username",
                                        fontSize = 14.sp,
                                        color = Color.DarkGray
                                    )
                                }
                            }

                        }


                    }
                }

            }
        },
        floatingActionButton = {
            // Botón de guardar como favorito
            // Implementa la lógica necesaria
        },
        floatingActionButtonPosition = FabPosition.End,
    )
}
