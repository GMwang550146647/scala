package A_Projects

object E_CASE_calculator {
  def main(args: Array[String]): Unit = {
    val c=Calculator(10,3)
    println(s"add:${c.add}")
    println(s"substract:${c.substract}")
    println(s"multiply:${c.multiply}")
    println(s"divide:${c.divide}")
  }
  //计算方法
  case class Calculator(a:Int,b:Int){
    def add=a+b
    def substract=a-b
    def multiply=a*b
    def divide=a/b
  }
}
