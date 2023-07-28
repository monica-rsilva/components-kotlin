package br.senai.sp.jandira.componentes.login.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.componentes.components.CaixaDeTexto
import java.text.Normalizer.Form

@Composable
fun Form() {
    Card() {
       Column {
           CaixaDeTexto(
               texto = "email",
               meuType = KeyboardType.Email
           )
           CaixaDeTexto(
               texto = "senha",
               meuType = KeyboardType.Password
           )
       }
    }
}

@Preview
@Composable
fun FormPreview() {
    Form()
}