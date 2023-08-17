fun main() {

    val conversaoPlaca = mapOf(
        0 to 'a',
        1 to 'b',
        2 to 'c',
        3 to 'd',
        4 to 'e',
        5 to 'f',
        6 to 'g',
        7 to 'h',
        8 to 'i',
        9 to 'j'
    )

    val placa = ConvertePlaca('A','B','C','1','9','3','4')

    when (placa.e){
        '0' ->{
            val novaPlaca = placa.copy(e = 'A')

            println("A placa convertida é: $novaPlaca")
        }
        '1' ->{
            val novaPlaca = placa.copy(e = 'B')

            println("A placa convertida é: $novaPlaca")
        }
        '2' ->{
            val novaPlaca = placa.copy(e = 'C')

            println("A placa convertida é: $novaPlaca")
        }
        '3' ->{
            val novaPlaca = placa.copy(e = 'D')

            println("A placa convertida é: $novaPlaca")
        }
        '4' ->{
            val novaPlaca = placa.copy(e = 'E')

            println("A placa convertida é: $novaPlaca")
        }
        '5' ->{
            val novaPlaca = placa.copy(e = 'F')

            println("A placa convertida é: $novaPlaca")
        }
        '6' ->{
            val novaPlaca = placa.copy(e = 'G')

            println("A placa convertida é: $novaPlaca")
        }
        '7' ->{
            val novaPlaca = placa.copy(e = 'H')

            println("A placa convertida é: $novaPlaca")
        }
        '8' ->{
            val novaPlaca = placa.copy(e = 'I')

            println("A placa convertida é: $novaPlaca")
        }
        '9' ->{
            val novaPlaca = placa.copy(e = 'J')

            println("A placa convertida é: $novaPlaca")
        }
    }

}

data class ConvertePlaca(var a:Char,var b:Char,var c:Char,var d:Char,var e:Char,var f:Char,var g:Char,){

}