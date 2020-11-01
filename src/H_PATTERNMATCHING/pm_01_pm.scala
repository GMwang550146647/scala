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
object pm_01_pm {
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
    val c4:Any=Customer("gmwang",99)
    val result4 =c4 match{
      case Customer(a,b) =>println(s"Customer类型对象，name=${a},age=${b}")
      case Order(a) => println(s"Order类型对象，id=${a}")
      case _=>println("未匹配")
    }

    //5.数组
    val arr1=Array(1,2,3)
    val arr2=Array(0)
    val arr3=Array(0,1,2,3,4,5)
    val result5=arr3 match{
      case Array(1,x,y)=>println(s"匹配到数组，总个数}是3，首元素是1，其他两个元素无所谓:${x},${y}")
      case Array(0) => println("匹配到数组，长度为1，只有一个元素")
      case Array(0,_*) =>println("匹配到数组，以元素0开头，后面多少个无所谓")
      case _ =>println("未匹配")
    }
    //6.列表
    var list61=List(1,2,3,4,5)
    val list62=List(2,3,3,4,6)
    list62++= list61
    println(list61)
    //7.元组
  }
  //4.样例类
  case class Customer(name:String,age:Int)
  case class Order(id:Int)


}
