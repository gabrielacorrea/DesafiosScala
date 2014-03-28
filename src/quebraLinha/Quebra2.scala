package quebraLinha

object Quebra2 {

  var montado = "";
  var i = -1;
  var lim = 20

  def main(args: Array[String]): Unit = {
    val frase = "Um pequeno jabuti xereta viu dez cegonhas felizes."
    val limite = 20

    val seqPalavras = frase.split(" ").toSeq

    println("Palavras = " + seqPalavras)
    monta(seqPalavras.toList, limite)
    println(montado)

  }

 
   def monta(numero: List[String], limite: Int): Int = {
     println(" ---" + montado + " ---")
    if (limite >= numero(0).size) {
      println("numero=" + numero(0) + "=" + " tamanho=" + numero(0).size + "=" + limite)
      montado = montado + " " + numero(0)
      monta(numero.drop(1), limite - numero(0).size)
    } else {
      println("aqui")
      montado = montado + "\n" + numero(0)
      monta(if (numero.size > 0) numero.drop(1) else numero, lim)
    }
  }

 

}
