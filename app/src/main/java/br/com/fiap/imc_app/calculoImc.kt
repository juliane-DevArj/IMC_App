package br.com.fiap.imc_app


import kotlin.math.pow

fun calcularIMC(altura: Double, peso: Double) : Double {
    return peso / (altura / 100).pow(2.0)
}

fun determinarClassIMC(imc: Double): String{
    return if (imc < 18.5){
        "Abaixo do peso."
    } else if (imc >= 18.5 && imc < 25.0){
        "Peso ideal."
    } else if (imc >= 25.0 && imc < 30.0){
        "Pouco acima do peso."
    } else if (imc >= 30.0 && imc < 35.0){
        "Obesidade Grau I."
    } else if (imc >= 35.0 && imc < 40.0){
        "Obesidade Grau II."
    }else {
        "Obesidade Grau III."
    }
}