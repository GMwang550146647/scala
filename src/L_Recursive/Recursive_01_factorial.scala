package L_Recursive
//递归必须要有返回值的数据类型
object Recursive_01_factorial {
  def factorial(n:Int):Int ={
    if (n<=0) 1
    else n*factorial(n-1)
  }
  def main(args: Array[String]): Unit = {
    println(factorial(10))
  }
}
