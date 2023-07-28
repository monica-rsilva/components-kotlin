package br.senai.sp.jandira.componentes.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun CaixaDeTexto(texto: String, meuType: KeyboardType) {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        label = {
            Text(text = texto)
        },
        keyboardOptions =
        KeyboardOptions(keyboardType = meuType)
    )
}