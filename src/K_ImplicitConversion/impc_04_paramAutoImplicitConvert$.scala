package K_ImplicitConversion
/*
隐式参数：
  方法列表使用了implicit修饰，则参数列表是隐式参数
  好处：调用方法不需要给值，自动查找缺省值
 */
object impc_04_paramManualImplicitConvert {
  //1.定义一个函数
  def show(name:String)(implicit  delimit:(String,String))=delimit._1+name+delimit._2
  def show_all(name:String)(implicit  delimit:(String,String,String))=delimit._1+name+delimit._2+name+delimit._3

  def main(args: Array[String]): Unit = {
    //2.定义一个隐式参数（同一长度的只能共存一个）
    implicit val delimit_default=("<<<",">>>")
    implicit val delimit_default2=("<<<<","===",">>>>")
    //3.调用
    println(show("张三")("((",">>"))
    println(show("张三"))
    println(show_all("张三"))
  }
}
