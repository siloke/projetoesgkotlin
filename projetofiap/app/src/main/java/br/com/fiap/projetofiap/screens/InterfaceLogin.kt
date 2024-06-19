package br.com.fiap.projetofiap.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.projetofiap.R
import br.com.fiap.projetofiap.ui.theme.ProjetofiapTheme


@Composable
fun InterfaceLogin() {
    Column(
        // colors = ButtonDefaults.buttonColors(Color(0xFFAD1F4E)),
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF161819)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            //modifier = Modifier.background(Color.Magenta)
        ){
            Image(
                modifier = Modifier
                    .size(150.dp)
                    .offset(0.dp, (-90).dp),
                painter = painterResource(id = R.drawable.baseline_account_circle_24)
                ,contentDescription = "logo",
            )
        }

        Column() {
            Column(){
                Text(
                    text = "Email",
                    fontSize = 24.sp,
                    color = Color.White,
                )
                OutlinedTextField(
                    modifier = Modifier
                        .width(330.dp)
                        .background(Color.White),
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "teste@teste.com")
                    }
                )
            }

            Column(
                modifier = Modifier
                    .offset(0.dp, 20.dp)
            ){
                Text(
                    text = "Senha",
                    fontSize = 24.sp,
                    color = Color.White
                )
                OutlinedTextField(
                    modifier = Modifier
                        .width(330.dp)
                        .background(Color.White),
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "***********")
                    }
                )
            }
        }
        Box(
            modifier = Modifier.offset(0.dp, 90.dp)
        ){
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFAD1F4E)),
                modifier = Modifier
                    .size(350.dp, 70.dp)

            ) {
                Text(text = "Login", fontSize = 28.sp)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InterfaceLoginPreview() {
    ProjetofiapTheme {
        InterfaceLogin();
    }
}