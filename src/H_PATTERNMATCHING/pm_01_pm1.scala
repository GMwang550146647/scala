package H_PATTERNMATCHING

import scala.io.StdIn
/*
匹配：
1.常数
2.类型
3.守卫（if 判断）
4.样例类
5.数组
6.列表
7.元组
8.for表达式
 */
/*
格式
常量匹配
  变量 match{
    case "常量1" => 表达式1
    case "常量2" => 表达式2
     ...
    case    _   => 表达式n （default)
类型匹配
  对象名 match{
    case 变量名1：类型1 =>表达式1
    case 变量名2：类型2 =>表达式2
      ...
    case _ : 类型n  （default)


 */
object pm_01_pm1 {
  def main(args: Array[String]): Unit = {
    //1.常量匹配
    val s1="hadoop"
    val result1=s1 match {
      case "hadoop" => "大数据分布式存储和计算框架"
      case "zookeeper" => "大数据分布式协调服务框架"
      case "spark" => "大数据分布式内存计算框架"
      case _ => "未匹配"
    }
    println(result1)

    //2.类型匹配
    val a:Any="hadoop"
    val result21=a match {
      case x:String => s"${x} 是一个String类型数据"
      case x:Int => s"${x} 是一个Int类型数据"
      case x:Double => s"${x} 是一个Double类型数据"
      case _ => "未匹配"
    }
    println(result21)

    //简写
    val a1:Any="hadoop"
    val result22=a1 match {
      case _ => s"String类型数据"
      case _ => s"Int类型数据"
      case _ => s"Double类型数据"
      case _ => "未匹配"
    }
    println(result22)

    //3.守卫
    val a3=100
    val result3= a3 match{
      case x if x>0 && x.isInstanceOf[Int] => println("正整数")
      case x if x<0 && x.isInstanceOf[Int] => println("负整数")
      case x if x==0 =>println("负整数")
      case _ => println("其他数")
    }

    //4.样例类
    val c4:Any=Customer("gmwng",99)
    val result4 =c4 match{
      case Customer(a,b) =>println(s"Customer类型对象，name=${a},age=${b}")
      case Order(a) => println(s"Order类型对象，id=${a}")
      case _=>println("未匹配")
    }

    //5.
  }
  //4.样例类
  case class Customer(name:String,age:Int)
  case class Order(id:Int)

}
