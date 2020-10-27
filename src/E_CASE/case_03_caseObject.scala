package E_CASE
/*
1.当做枚举值用
*2.无参数的消息传递 ->akka并发编程会用到
 */
object case_03_caseObject {
  def main(args: Array[String]): Unit = {
    val p=Person("gmwang",Male)
  }
  trait Sex //表示性别
  case object Male extends Sex //男性
  case object Female extends Sex //女性
  case class Person(var name:String,var sex:Sex) //接受Sex类型变量
}
