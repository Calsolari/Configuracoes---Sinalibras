package br.senai.sp.jandira.config_sinalibras

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.config_sinalibras.ui.theme.ConfigSinaLibrasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ConfigSinaLibrasTheme {
            Config()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Config() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD0E6FF))
            .padding(16.dp)
    ) {


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            IconButton(onClick = { /* Ação de voltar */ }) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Voltar", tint = Color.Black)
            }


            Text(
                text = "Configurações",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(horizontal = 60.dp)
            )}

        Spacer(modifier = Modifier.height(24.dp))


        TextField(
            value = "",
            onValueChange = {},
            leadingIcon = {
                IconButton(onClick = { /* Ação exibir senha */ }) {
                    Icon(Icons.Default.Search, contentDescription = null, tint = Color.Black)
                }
            },
            label = { Text("Pesquisar...", color = Color.Black, fontWeight = FontWeight.Medium) },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .width(315.dp)
                .height(44.dp)
                .border(
                    width = 1.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(13.dp)
                ),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFACD0F5),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            shape = RoundedCornerShape(13.dp)
        )
        Spacer(modifier = Modifier.height(80.dp))

        Box(modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .width(301.dp)
            .height(436.dp)
        ){
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(76.dp),

                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFEAF4FF))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "Meu Perfil",
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.weight(1f)
                    )

                    Icon(
                        Icons.Default.ArrowForward,
                        contentDescription = "Ir para Meu Perfil",
                        tint = Color.Black
                    )
                }
            }


            Card(
                modifier = Modifier
                    .padding(top = 86.dp)
                    .fillMaxWidth()
                    .height(76.dp),

                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFEAF4FF))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "Sobre Nós",
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.weight(1f)
                    )

                    Icon(
                        Icons.Default.ArrowForward,
                        contentDescription = "Ir para Meu Perfil",
                        tint = Color.Black
                    )
                }
            }

            Card(
                modifier = Modifier
                    .padding(top = 172.dp)
                    .fillMaxWidth()
                    .height(76.dp),

                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFEAF4FF))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "Suporte/Denuncias",
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.weight(1f)
                    )

                    Icon(
                        Icons.Default.ArrowForward,
                        contentDescription = "Ir para Meu Perfil",
                        tint = Color.Black
                    )
                }
            }


            Card(
                modifier = Modifier
                    .padding(top = 258.dp)
                    .fillMaxWidth()
                    .height(76.dp),

                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFEAF4FF))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "Verificar Meu Nivel",
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.weight(1f)
                    )

                    Icon(
                        Icons.Default.ArrowForward,
                        contentDescription = "Ir para Meu Perfil",
                        tint = Color.Black
                    )
                }
            }

            Card(
                modifier = Modifier
                    .padding(top = 344.dp)
                    .fillMaxWidth()
                    .height(76.dp),

                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFD74C4C))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "Excluir Conta",
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.weight(1f)
                    )

                    Icon(
                        Icons.Default.Delete,
                        contentDescription = "Ir para Meu Perfil",
                        tint = Color.Black
                    )
                }
            }



        }
        Box(modifier = Modifier.fillMaxWidth().height(120.dp)){
            Image(
                painter =painterResource(id = R.drawable.logo),
                contentDescription = "logo",
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(width = 115.dp, height = 53.dp)

            )
        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ConfigSinaLibrasTheme {
        Config()
    }
}