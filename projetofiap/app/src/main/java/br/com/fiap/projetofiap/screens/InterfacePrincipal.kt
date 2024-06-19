package br.com.fiap.projetofiap.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.projetofiap.R
import br.com.fiap.projetofiap.ui.theme.ProjetofiapTheme

@Composable
fun InterfacePrincipal() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF161819))
    ) {
        Box (
            modifier = Modifier
                .offset(0.dp, 60.dp)
                .background(color = Color(0xFFAD1F4E))
                .padding(60.dp)
        ){
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                text = "Você possui 300 PONTOS",
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }

        Divider(
            color = Color.White, thickness = 1.dp,
            modifier = Modifier
                .offset(0.dp, 90.dp)
                .width(350.dp)
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .offset(0.dp, 160.dp)
                .size(500.dp, 250.dp)
        ) {
            Text(
                text = "CATEGORIAS",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier
                    .offset(0.dp, 10.dp),
            )

            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    modifier = Modifier
                        .background(Color(0xFFAD1F4E))
                        .size(80.dp),
                    painter = painterResource(id = R.drawable.baseline_directions_bike_24)
                    ,contentDescription = "logo",
                )
                Image(
                    modifier = Modifier
                        .background(Color(0xFFAD1F4E))
                        .size(80.dp),
                    painter = painterResource(id = R.drawable.baseline_account_box_24)
                    ,contentDescription = "logo",
                )
                Image(
                    modifier = Modifier
                        .background(Color(0xFFAD1F4E))
                        .size(80.dp),
                    painter = painterResource(id = R.drawable.baseline_egg_alt_24)
                    ,contentDescription = "logo",
                )
            }

            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    modifier = Modifier
                        .background(Color(0xFFAD1F4E))
                        .size(80.dp),
                    painter = painterResource(id = R.drawable.baseline_emoji_events_24)
                    ,contentDescription = "logo",
                )
                Image(
                    modifier = Modifier
                        .background(Color(0xFFAD1F4E))
                        .size(80.dp),
                    painter = painterResource(id = R.drawable.baseline_recycling_24)
                    ,contentDescription = "logo",
                )
                Image(
                    modifier = Modifier
                        .background(Color(0xFFAD1F4E))
                        .size(80.dp),
                    painter = painterResource(id = R.drawable.baseline_spa_24)
                    ,contentDescription = "logo",
                )
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        Row (
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .size(500.dp, 65.dp)
                .background(color = Color((0xFFAD1F4E)))
                .offset(0.dp, 10.dp)
            ){

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                Image(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(id = R.drawable.baseline_account_box_24)
                    ,contentDescription = "logo",
                )
                Text(text = "CONTA")
            }

            Column (
                horizontalAlignment = Alignment.CenterHorizontally,

            ){
                Image(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(id = R.drawable.baseline_home_24)
                    ,contentDescription = "logo",
                )
                Text(text = "INICIO")
            }

            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                Image(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(id = R.drawable.baseline_card_giftcard_24)
                    ,contentDescription = "logo",
                )
                Text(text = "PREMIO")
            }

        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InterfacePrincipalPreview() {
    ProjetofiapTheme {
        InterfacePrincipal();
    }
}