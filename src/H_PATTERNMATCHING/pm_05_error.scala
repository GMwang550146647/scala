package H_PATTERNMATCHING
/*
异常处理
  捕获
  抛出
 */
object pm_05_error {
  def main(args: Array[String]): Unit = {
    try{
      //可能会有异常的代码
      val i=10/0
      println("这里并不会执行")
    }
    catch{
      //异常处理
//      case ex:ArithmeticException => println("算术异常")
//      case ex:NullPointerException=> println("空指针异常")
      case ex:Exception => println("某种异常")
      case _ => println("其他异常")
    }
    finally{
      //无论有无异常，都会执行
      println("释放资源")
    }
    println("程序继续运行")
  }
}
