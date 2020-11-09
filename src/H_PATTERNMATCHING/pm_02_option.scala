package H_PATTERNMATCHING
/*
option
  避免空指针异常
 */
object pm_02_option {
  def main(args: Array[String]): Unit = {
    //思路1:普通实现
    val result10=divide(10,0)
    println(result10)
    //思路2:模式匹配实现
    result10 match{
      case Some(x) => println(s"商为:${x}")
      case None=> println("除数不能为0")
    }
    //思路3:getOrElse实现
    println(result10.getOrElse("除数不能为0"))
  }

  def divide(a:Int,b:Int)={
    if (b==0) None
    else Some(a/b)
  }
}
