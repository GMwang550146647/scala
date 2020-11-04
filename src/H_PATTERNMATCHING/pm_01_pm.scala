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
    val s1 = "hadoop"
    val result1 = s1 match {
      case "hadoop" => "大数据分布式存储和计算框架"
      case "zookeeper" => "大数据分布式协调服务框架"
      case "spark" => "大数据分布式内存计算框架"
      case _ => "未匹配"
    }
    println(result1)

    //2.类型匹配
    val a: Any = "hadoop"
    val result21 = a match {
      case x: String => s"${x} 是一个String类型数据"
      case x: Int => s"${x} 是一个Int类型数据"
      case x: Double => s"${x} 是一个Double类型数据"
      case _ => "未匹配"
    }
    println(result21)

    //简写
    val a1: Any = "hadoop"
    val result22 = a1 match {
      case _ => s"String类型数据"
      case _ => s"Int类型数据"
      case _ => s"Double类型数据"
      case _ => "未匹配"
    }
    println(result22)

    //3.守卫
    val a3 = 100
    a3 match {
      case x if x > 0 && x.isInstanceOf[Int] => println("正整数")
      case x if x < 0 && x.isInstanceOf[Int] => println("负整数")
      case x if x == 0 => println("负整数")
      case _ => println("其他数")
    }

    //4.样例类
    val c4: Any = Customer("gmwang", 99)
    c4 match {
      case Customer(a, b) => println(s"Customer类型对象，name=${a},age=${b}")
      case Order(a) => println(s"Order类型对象，id=${a}")
      case _ => println("未匹配")
    }

    //5.数组
    val arr1 = Array(1, 2, 3)
    val arr2 = Array(0)
    val arr3 = Array(0, 1, 2, 3, 4, 5)
    arr3 match {
      case Array(1, x, y) => println(s"匹配到数组，总个数}是3，首元素是1，其他两个元素无所谓:${x},${y}")
      case Array(0) => println("匹配到数组，长度为1，只有一个元素")
      case Array(0, _*) => println("匹配到数组，以元素0开头，后面多少个无所谓")
      case _ => println("未匹配")
    }
    //6.列表
    val list61 = List(0)
    val list62 = List(0, 1, 2, 3)
    val list63 = List(11, 22)
    list61 match {
      case List(0) => println("匹配列表，只包含一个元素0的列表")
      case List(0, _*) => println("匹配列表，0开头后面无所谓")
      case List(x, y) => println(s"匹配列表:只包含两个任意元素的列表，元素为${x},${y}")
      case _ => println("匹配失败")
    }
    //方式2
    list62 match {
      case 0 :: Nil => println("匹配列表，只包含一个元素0的列表")
      case 0 :: tail => println("匹配列表，0开头后面无所谓")
      case x :: y :: Nil => println(s"匹配列表:只包含两个任意元素的列表，元素为${x},${y}")
      case _ => println("匹配失败")
    }

    //7.元组
    val tp1 = (1, 2, 3)
    val tp2 = (3, 4, 5)
    tp1 match {
      case (1, x, y) => println(s"匹配元组:长度3，以1开头，剩下两个元素没所谓，分别是${x},${y}")
      case (x, y, 5) => println(s"匹配元素:长度3，以5结尾，前两个元素无所谓，分别是${x},${y}")
      case _ => println("未匹配")
    }

    //8.变量声明的模式匹配
    val arr8=(0 to 10 ).toArray
    val Array(_,x,y,z,_*)=arr8
    println(x,y,z)
    val list8=(0 to 10).toList
    val List(a8,b8,_*)=list8
    println(a8,b8)

    //9.匹配for表达式
    val map9=Map("gmwang"->23,"feifei"->24,"nobody"->12,"someone"->23)
//    for ((k,v) <- map9 if v==23) println(k,v) //功能同下
    for ((k,23) <- map9) println(k,23)

    //10.
  }


  //4.样例类
  case class Customer(name: String, age: Int)
  case class Order(id: Int)


}
