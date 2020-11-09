package A_Projects

object J_calculator {
  def main(args: Array[String]): Unit = {
    //普通写法
    def add(a:Int,b:Int) =a+b
    def minus(a:Int,b:Int) =a-b
    def divide(a:Int,b:Int) =a/b
    def multiply(a:Int,b:Int) =a*b
    //柯里化写法
    def calculator(a:Int,b:Int)(f:(Int,Int)=> Int)=println(f(a,b))
    calculator(1,2)(_+_)
    calculator(1,2)(_-_)
    calculator(1,2)(_/_)
    calculator(1,2)(_*_)
  }
}
