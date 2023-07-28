package br.senai.sp.jandira.componentes.login.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.componentes.R

@Composable
fun Header() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxHeight()
        ) {
            Text(text = "Login")
            Text(text = "Informe seus dados")
        }
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = ""
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    Header()
}