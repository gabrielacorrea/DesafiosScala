package quebraLinha

object QuebraLinha {
  
  def main(args: Array[String]) {

    val frase = "Um pequeno jabuti xereta viu dez cegonhas felizes."
    val limite = 20

    val seqPalavras = frase.split(" ").toSeq

    val adicionaNaLinha = (agregadores: (String, Int), palavra: String) => {
      val res = if (limite - agregadores._2 > palavra.size) agregadores._1 + " " + palavra 
              else {
                agregadores._1 + "\n" + palavra
              }
      (res, res.size)
    }
    val x = seqPalavras.foldLeft("", 0)(adicionaNaLinha)
    println(x)

  }

}

