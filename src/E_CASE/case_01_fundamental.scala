package E_CASE
/*
case: 特殊类，用于保存数据（并发编程和spark，Flink中都会经常用到）
格式：
  case class 样例类名([var/val] 成员变量名1：类型1，成员变量名2：类型2...){}
  不写变量属性，默认val，不能修改
 */
object case_01_fundamental {
  case class Person(var name:String="gmwang",var age :Int=23,entity:String="Person"){}

  def main(args: Array[String]): Unit = {
    val p=new Person
    println(s"修改前:${p.name},${p.age},entity:${p.entity}")
    p.name="gmwang_modified"
    println(s"修改🐵:${p.name},${p.age},entity:${p.entity}")
  }
}
