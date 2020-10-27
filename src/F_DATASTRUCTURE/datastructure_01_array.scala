package F_DATASTRUCTURE


/*
1.定长数组
2.变长数组
特点： 内容可变，类型相同
格式：


一.定长数组
创建
  1.通过指定长度
  val/var 变量名 = new Array[Type](Length)
  2.通过指定元素
  val/var 变量名 = Array( e1 , e2 , e3 ...)
  注意：
    数组默认值： Int:0,Double:0.0,String:null
index
  数组名(index)
attribute
  数组名.length 或 数组名.size

二.变长数组
创建
  import scala.collection.mutable.ArrayBuffer
  val/var 变量名=ArrayBuffer[Type]()
  val/var 变量名=ArrayBuffer(e1,e2,e3...)
index
  数组名(index)
attribute
  数组名.length 或 数组名.size
method
  +，-，++，--
遍历
  for (i <-arr) println(i)
 */

import scala.collection.mutable.ArrayBuffer

object datastructure_01_array {
  def main(args: Array[String]): Unit = {
    //1. 定长数组
    //1.1按长度创建 & index & 修改
    val arr1 = new Array[Int](10)
    arr1(0) = 100
    println(arr1(0))
    //1.2.直接定义数组
    val arr2 = Array("java", "python", "scala")
    println(arr2.size)
    println(arr2.length)
    //3.遍历数组
    print_array(arr2)
    println("_"*20)

    //2.变长数组
    //2.1.创建空的
    val ab1 = new ArrayBuffer[Int]()
    //2.2.创建有初始值的
    val ab2 = ArrayBuffer("hadoop", "spark", "flink")
    //2.3.操作数组
    //添加单个元素
    ab2 += "flume"
    //删除单个元素
    ab2 -= "hadoop"
    //添加多个数据
    ab2 ++= Array("hive", "sqoop")
    //删除多个数据
    ab2 --= ArrayBuffer("sqoop", "spark")
    //删除数组中不存在的元素：有则删除，无则忽略
    ab2 -= "hello"
    ab2 --= Array("hive", "hello")
    print_array(ab2)
  }

  //3.遍历数组

  def print_array(arr: ArrayBuffer[String]): Unit = {
    //直接遍历
    for (i <-arr) println(i)
//    //to :左右都包括
//    for (i <- 0 to (arr.size-1)) println(arr(i))
//    //until: 左包右不包
//    for (i <- 0 until arr.size) println(arr(i))

  }

  def print_array(arr: Array[String]): Unit = for (i <-arr) println(i)
}
