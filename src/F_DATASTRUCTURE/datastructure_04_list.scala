package F_DATASTRUCTURE

import scala.collection.mutable.ListBuffer

/*
最重要！最常用！
特点： 有序 可重复
类别： 可变 & 不可变

1.不可变列表
  创建
    1.1.指定值
    val/var 变量名 = List(e1, e2 , e3)
    1.2.空
    val/var 变量名 = Nil
    1.3.拼接
    val/var 变量名 = e1::e2::Nil
2.可变列表
  创建
    2.1.
    val/var 变量名=ListBuffer[数据类型]()
    2.2.
    val/var 变量名=ListBuffer(e1,e2,e3...)
  常用方法：
    index          列表名(index)
    添加            += ++=
    删除            -= --=
    转换为不可变列表  toList
    转换为数组       toArray
 */
object datastructure_04_list {
  def main(args: Array[String]): Unit = {
    //1.可变列表创建
    val list1 = List(1, 2, 3, 4)
    val list2 = Nil
    val list3 = -2 :: -1 :: Nil
    //2.不可变列表创建
    val lb2=ListBuffer[Int]()
    val lb1=ListBuffer(1,2,3,4,5,6,1)
    println(lb1)

    //3.操作(注意：从后面+ 从前面-)
    lb1 += 1000
    println(lb1)
    lb1 -= 1
    println(lb1)
    lb1 ++= List(1,2,3)
    println(lb1)
    lb1 --= List(1,2,3)
    println(lb1)
    val lb2l=lb1.toList
    println(lb2l)
    val lb2a=lb1.toArray
    println(lb2a)
  }

}
